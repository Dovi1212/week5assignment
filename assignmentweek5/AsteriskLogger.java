package assignmentweek5;

public class AsteriskLogger implements logger {
	
	@Override
	public void log(String message) {
		System.out.println("*** " + message + " ***");
		
	}
		
	@Override
	public void error(String message) {
		System.out.println("*".repeat(15 + message.length()));
		System.out.println("*** " + "Error: " + message + " ***");	
		System.out.println("*".repeat(15 + message.length()));
		
	}



	}


