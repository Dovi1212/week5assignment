package assignmentweek5;

public class App {

	public static void main(String[] args) {
		AsteriskLogger starWord = new AsteriskLogger();
		
		starWord.log("whats up?");
		System.out.println();
		starWord.error("hello");
		
		SpacedLogger spacedWord = new SpacedLogger();
		
		spacedWord.log("whats up?");
		System.out.println();
		
		spacedWord.error("hello");

	}

}
