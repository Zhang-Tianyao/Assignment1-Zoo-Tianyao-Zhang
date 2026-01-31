package edu.neu.csye6200;

/**
 * 
 * @author Amit Singh Tomar
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

         //Add your code in between these two print statements

		System.out.println("=== ZooAnimals (Concrete API) ===");
		ZooAnimals.demo();

		System.out.println("\n=== ZooAbstractAnimals (Abstract API) ===");
		ZooAbstractAnimals.demo();

		System.out.println("\n=== ZooAnamalisticAnimals (Interface API) ===");
		ZooAnamalisticAnimals.demo();

		System.out.println("\n=== ZooObjectAnimals (Object API) ===");
		ZooObjectAnimals.demo();
		 
		System.out.println("\n\n============Main Execution End===================");
	}
}