package AbstractionConcept;

public class InterfaceBMWChildClassForInterfaceCar implements InterfaceCar{//here this is a child class of interface parent class so 
	//use implements keyword
	// so here if child class implements intefcae parent class it has to use all the methods of interface to it as shown below:
	//@override****************************************
	    public void start() {
	    	System.out.println("start method********");
	    }
	    
		public void stop(){
			System.out.println("stop method********");
		}
		public void fuel() {
			System.out.println("refuel method********");
		}

	}


