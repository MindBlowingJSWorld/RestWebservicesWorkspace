(function() {
	var page4Controller = function($scope, $log) {
		
		$scope.pageNumber = "Page 4";
		
		$log.log("Inside Page 4 Controller");
		
	}; 
	
	var gameApp = angular.module('gameApp');
	gameApp.controller('page4Controller', page4Controller);
	
	
	
})();
