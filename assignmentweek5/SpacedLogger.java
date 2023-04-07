package assignmentweek5;

public class SpacedLogger implements logger {

	@Override
	public void log(String log) {
		String msg = "";	
		for (int i=0; i< log.length();i++) {
			msg+=(log.charAt(i)+ " ");
		}
		msg = msg.trim();
		System.out.println(msg);
	}

	@Override
	public void error(String error) {
		String msg = "ERROR: ";		
		for (int i=0; i< error.length();i++) {
			msg +=(error.charAt(i)+ " ");		
	}
		msg = msg.trim();
		System.out.println(msg);


	
	}
}
