package Static;

import javax.management.relation.RelationService;

import operators.login;

class Loginservice;
	    static void validateUser (){
	        String username;
			System.out.println(username + " is logged in"); 
	    }

	    void logout() {
	        System.out.println(" logged out successfully"); 
	    }

	
	    public static void main(String[] args) {

	       
	        validateUser();

	        
	        RelationService loginservice = new RelationService();

	        
	        loginservice.logout();  
	    }
	}

