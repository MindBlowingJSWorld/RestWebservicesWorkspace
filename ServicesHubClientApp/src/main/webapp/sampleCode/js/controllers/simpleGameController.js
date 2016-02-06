(function() {
	var simpleGameController = function($scope, $log, customerGeneratorFactory, DAOService) {
		
		$scope.pageNumber = "Home page";
		$log.log("Inside Simple Game Controller");
		$scope.customers = [];
		
		var init = function() {
			//$scope.customers = customerGeneratorFactory.getCustomers();
			$scope.customers = DAOService.getCustomers();
		};
		
		init();
	}; 
	
	var gameApp = angular.module('gameApp');
	gameApp.controller('simpleGameController', simpleGameController);
	
	
	
})();
