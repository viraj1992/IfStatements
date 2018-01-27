
public class RandomClass {

	// Instance variables
	
	private String someName= "55";
	private int someNumber; 	
	private String result = "";
	// Convert String to int
	
	// do something Method

	public void doSomeThing() {
		// If statements
		someNumber = Integer.parseInt(someName);
		if (someNumber > 5) {
			result = "someNumber is greater than 5";
		} else if (someNumber < 5) {
			result = "someNumber is less than 5";
		} else if (someNumber == 5) {
			result = "someNumber is equal to 5";
		}	else {
			result = "None";
		}
		System.out.println(result);
	}

}





