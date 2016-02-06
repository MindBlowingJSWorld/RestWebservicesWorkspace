(function() {
	
	var gameApp = angular.module('gameApp');
	
	var DAOService = function($log, $http) {
		var customers = [{name:'David', city:'Pune'},{name:'MAX', city:'Mumbai'}, {name:'MARTIN', city:'London'}]
		
		this.getCustomers = function () {
			$log.log('Get Customers called in');
			return customers;
		};
		
		this.postCustomer = function(customer) {
			$log.log('Post Customer called in');
		}
		
		
	};
	
	gameApp.service('DAOService', DAOService);
	
})();