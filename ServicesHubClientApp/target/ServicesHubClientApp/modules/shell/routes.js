//Define Routing for app
ccs.shell.module.config(['$routeProvider', function($routeProvider) {
    'use strict';
    $routeProvider.
	      when('/', {
	            templateUrl: 'modules/shell/views/homeScreen.html',
	            controller: 'homeController'
	        }).
	        otherwise({
	        	redirectTo: '/'
	      });
}]);