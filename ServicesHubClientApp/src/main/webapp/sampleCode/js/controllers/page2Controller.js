(function() {
	var page2Controller = function($scope, $log) {
		
		$scope.pageNumber = "Page 2";
		$log.log("Inside Page 2 Controller");
	}; 
	
	var gameApp = angular.module('gameApp');
	gameApp.controller('page2Controller', page2Controller);
	
	
	
})();
