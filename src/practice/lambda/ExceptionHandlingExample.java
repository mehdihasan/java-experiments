package practice.lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int [] myArary = {1, 2, 3, 4, 5};
		int key = 0;
		
		process(myArary, key, wrapeprLambda((v, k) -> System.out.println(v / k)));
	}

	private static void process(int[] myArary, int key, BiConsumer<Integer, Integer> consumer) {
		for (int value : myArary) {
			consumer.accept(value, key); 
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapeprLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException happen from wrapperLambda");
			}
		};
	}

}
