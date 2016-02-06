(function(){
    'use strict';

    var sidebarDirective = function() {
        return {
            templateUrl: './modules/shell/views/sidebar.html',
            restrict: 'EA',
            controller: 'sidebarController',
            link : function(scope){
                scope.initScopeParams();
            }
        };
    };

    angular
        .module(ccs.shell.module.name)
        .directive('sidebar', sidebarDirective);
})();