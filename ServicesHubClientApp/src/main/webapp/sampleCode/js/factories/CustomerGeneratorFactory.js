(function(){
	
	var gameApp = angular.module('gameApp');
	
	var CustomerGeneratorFactory = function() {
		
		var customers = [{name:'David', city:'Pune'},{name:'MAX', city:'Mumbai'}, {name:'MARTIN', city:'London'}]
		
		var factory = {};
		
		factory.getCustomers = function() {
			return customers;
		};
		
		factory.postCustomers = function() {
			
		};
		
		return factory;
		
	};
	
	gameApp.factory('customerGeneratorFactory', CustomerGeneratorFactory);
	
})();