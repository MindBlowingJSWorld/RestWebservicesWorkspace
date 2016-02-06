(function() {
	var page3Controller = function($scope, $log) {
		
		$scope.pageNumber = "Page 3";
		
		$log.log("Inside Page 3 Controller");
		
	}; 
	
	var gameApp = angular.module('gameApp');
	gameApp.controller('page3Controller', page3Controller);
	
	
	
})();
