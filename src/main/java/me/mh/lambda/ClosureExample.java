package me.mh.lambda;

public class ClosureExample {

	public static void main(String[] args) {
		int i = 10;
		int j = 20; // effectively final
		doProcess(i, p -> System.out.println(i + j));
	}
	
	private static void doProcess(int i, Process p) {
		p.process(i);
	}
}

interface Process {
	void process(int i);
}