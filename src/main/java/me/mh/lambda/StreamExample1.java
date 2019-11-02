package me.mh.lambda;

import java.util.ArrayList;
import java.util.List;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		animals.add(new Animal("frog", true, true));
		animals.add(new Animal("tiger", true, true));
		animals.add(new Animal("human", true, true));
		
		animals.stream()
			.filter(a -> a.canSwim())
			.forEach(System.out::println); // this is called method reference // same as (a) -> System.out.println(a)
		
		System.out.println("Total item: " + animals.parallelStream()
			.filter(a -> a.canSwim())
			.count());
	}

}
