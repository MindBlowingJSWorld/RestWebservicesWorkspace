(function(){
    'use strict';

    var shellDirective = function() {
        return {
            templateUrl: './modules/shell/views/shell.html',
            restrict: 'E'
        };
    };
    
    angular.module(ccs.shell.module.name).directive('shell', shellDirective); 

})();