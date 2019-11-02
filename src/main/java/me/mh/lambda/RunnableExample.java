package me.mh.lambda;


public class RunnableExample {

	public static void main(String[] args) {
		
		// on a different thread
		Thread myThread = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				System.out.println(" | " + i);
			}
		});
		
		myThread.start();
		
		// on main thread
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " | ");
		}
	}
}
