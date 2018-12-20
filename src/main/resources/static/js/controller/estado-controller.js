appCliente.controller("estadoController", function($scope, $http){
	$scope.estado = [];
	$scope.estados = {};
	
	$scope.salvarEstado = function(){
		$http({method:'POST', url:'http://localhost:8080/estados',data:$scope.estados})
		.then(function(response){
			
		},function(){
			
		});
	};
});