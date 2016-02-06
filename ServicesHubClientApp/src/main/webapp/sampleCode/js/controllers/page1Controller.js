(function() {
	var page1Controller = function($scope, $log) {
		
		$scope.pageNumber = "Page 1";
		$log.log("Inside Page 1 Controller");
	}; 
	
	var gameApp = angular.module('gameApp');
	gameApp.controller('page1Controller', page1Controller);
	
	
	
})();
