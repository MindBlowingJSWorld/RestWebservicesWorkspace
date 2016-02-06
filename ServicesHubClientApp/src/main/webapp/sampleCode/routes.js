//Define Routing for app
var gameApp = angular.module('gameApp');

gameApp.config(function($routeProvider) {
		$routeProvider
		.when('/', {
			templateUrl: './views/simpleGame.html',
            controller: 'simpleGameController'
		}).
		when('/page1', {
			templateUrl: './views/page.html',
            controller: 'page1Controller'
		}).
		when('/page2', {
			templateUrl: './views/page.html',
            controller: 'page2Controller'
		}).
		when('/page3', {
			templateUrl: './views/page.html',
            controller: 'page3Controller'
		}).
		when('/page4', {
			templateUrl: './views/page.html',
            controller: 'page4Controller'
		}).
        otherwise({
        	redirectTo: '/'
      });
	
});

