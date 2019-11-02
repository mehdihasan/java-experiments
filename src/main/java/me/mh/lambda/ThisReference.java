package me.mh.lambda;

public class ThisReference {
	
	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i is :" + i);
			System.out.println(this);
		});
	}

	public static void main(String[] args) {
		ThisReference thisReference = new ThisReference();
		thisReference.execute();
	}
	
	public String toString() {
		return "This is reference of ThisReference";
	}
}
