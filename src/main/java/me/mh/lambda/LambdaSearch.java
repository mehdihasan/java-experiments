package me.mh.lambda;

import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaSearch {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		animals.add(new Animal("frog", true, true));
		animals.add(new Animal("tiger", true, true));
		animals.add(new Animal("human", true, true));
		
		print(animals, a -> a.canHop());
		print(animals, a -> a.canSwim());
		
		
		// sort list by name
		animals.sort((o1, o2) -> o1.toString().compareTo(o2.toString()));
		System.out.println(animals);
		System.out.println();
		
		// prints all the elements in the list
		animals.iterator().forEachRemaining(a->System.out.println(a.toString()));
		System.out.println();
		
		// print all animal name starts with t
		printConditionally(animals
				, a -> a.toString().substring(0, 1).equalsIgnoreCase("t")
				, a -> System.out.println(a.toString()));
	}

	private static void printConditionally(List<Animal> animals, Predicate<Animal> checker, Consumer<Animal> consumer) {
		for (Animal animal : animals) {
			if (checker.test(animal)) {
				consumer.accept(animal);
			}
		}
		System.out.println();
	}
	
	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for (Animal animal : animals) {
			if (checker.test(animal)) {
				System.out.println(animal + "");
			}
		}
		System.out.println();
	}
	
	
}

class Animal {
	
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String species
			, boolean canHop
			, boolean canSwim) {
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}
	
	public boolean canHop() {
		return canHop;
	}
	
	public boolean canSwim() {
		return canSwim;
	}
	
	public String toString() {
		return species;
	}
} 