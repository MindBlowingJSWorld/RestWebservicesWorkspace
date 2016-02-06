(function() {
	var personController = function($scope) {
		
		$scope.customers = [{name:'Mak', city:'pune'},
		                    {name:'Chuk', city:'london'},
		                    {name:'Duck', city:'copenhagen'},
		                    {name:'Maxi', city:'paris'}];
		
		
	}; 
	
	var demoApp = angular.module('demoApp');
	demoApp.controller('personController', personController);
	
	
	
})();
