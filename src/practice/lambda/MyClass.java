package practice.lambda;


public class MyClass {

	public static void main(String[] args) {
		printLambda(s -> s.length());
	}
	
	private static void printLambda(StringLengthLambda stringLengthLambda) {
		System.out.println(stringLengthLambda.getLength("Oroni Hasan"));
	}
	
	@FunctionalInterface
	interface StringLengthLambda {
		int getLength(String s);
	} 
}
