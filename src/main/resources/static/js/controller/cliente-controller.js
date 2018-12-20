//Criação de controllers
//"indexController" = chaver, function = valor
appCliente.controller("clienteController", function($scope, $http){ 
	
	//declação de variáveis
	$scope.clientes = [];
	$scope.cliente = {};//bind com o form
	
	
	//requisição via get
	carregarClientes = function(){
		$http({method:'GET', url:'http://localhost:8080/clientes'})
		.then(function(response){
			$scope.clientes = response.data;
			
			console.log(response.status);
		}, function(response){
			console.log(response.data);
			console.log(response.status);
		});
	};
	//requisição via post
	
		$scope.salvarCliente = function(){
			if($scope.frmCliente.$valid){
			$http({method:'POST', url:'http://localhost:8080/clientes',data:$scope.cliente})
			.then(function(response){
				//$scope.clientes.push(response.data);
				carregarClientes();
				$scope.cancelarAlteracaoCliente();
				$scope.frmCliente.$setPristine(true);//reseta o estado dos campos do form
				
			}, function(response){
				console.log(response.data);
				console.log(response.status);
			});
		
			}else{
				window.alert("Dados inválidos!");
			}
		};
	$scope.excluirCliente=function(cliente){
		$http({method:'DELETE', url:'http://localhost:8080/clientes/'+cliente.id})
		.then(function (response){
			
			pos = $scope.clientes.indexOf(cliente);
			$scope.clientes.splice(pos , 1);
			
		} , function (response){
			console.log(response.data);
			console.log(response.status);
			
		});	
		
	}
	
	$scope.alterarCliente=function(cli){
		
		$scope.cliente = angular.copy(cli);
	};
	
	$scope.cancelarAlteracaoCliente=function(){
		$scope.cliente = {};
	}
		
	
	carregarClientes();
});