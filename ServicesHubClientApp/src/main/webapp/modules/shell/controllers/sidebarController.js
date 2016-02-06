(function () {
    'use strict';
    var sidebarController = function ($scope, $rootScope, $location, $http, $log) {
        
    	$scope.initScopeParams = function() {
    		$log.log('init Scope Param is executed');
    	};
    	
        // redirect use to specific pages
        $scope.redirectTo = function (url) {
            $location.path (url);
        };
        
        // Http request
        $scope.sendHttpRequest = function (httpUrl, callBack) {
            $http.get (httpUrl).success (function (data) {
                callBack (data);
            }).error (function (error) {
                $log.error ('Unable to retrieve data, error thrown : ' + error);
                callBack ();
            });
        };

    };

    angular.module (ccs.shell.module.name)
        .controller ('sidebarController',
                     ['$scope', '$rootScope', '$location', '$http', '$log', sidebarController]);
}) ();
