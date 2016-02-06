(function(){
    'use strict';

    var navigationDirective = function() {
        return {
            templateUrl: './modules/shell/views/navigation.html',
            restrict: 'E'
        };
    };

    angular.module(ccs.shell.module.name).directive('ccsNavigation', navigationDirective);

})();
