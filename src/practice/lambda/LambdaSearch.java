package practice.lambda;

import java.util.ArrayList;
import java.util.List;
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
	}

	private static void print(List<Animal> animals
			, Predicate<Animal> checker) {
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