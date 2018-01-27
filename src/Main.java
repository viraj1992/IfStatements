
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stringData = "Hello1";
		String stringData2 = "OMG";
		String result = "";

		if(stringData == "Hello") {
			result = "String present is: " + stringData; 
		} else if(stringData2 == "OMG"){
			result = stringData2 + " Found!!!!";
		} else {
			result = "String Hello is not present";
		}

		System.out.println(result);
		
		RandomClass randomClass = new RandomClass();
		randomClass.doSomeThing();

	}
}
