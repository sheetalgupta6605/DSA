package CollectionFramework;

import java.util.Stack;

public class learnstack {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();

        animal.push("Lion");

        animal.push("Tiger");
        animal.push("Cat");
        animal.push("Dog");

        // System.out.println("Stack : " + animal);
        // System.out.println("Top: " + animal.peek());
        // System.out.println("Remove last: " + animal.pop());

        // System.out.println("\n\nStack : " + animal);
        int pos = animal.search("Mouse");
        System.out.println("Search animal: " + pos);
        // System.out.println("-1 not found.");

        // System.out.println("\n\nStack : " + animal);
        // System.out.println(animal.size());

        // System.out.println(animal.pop());
        // System.out.println(animal.pop());
        // System.out.println(animal.pop());

        // System.out.println("\n\nStack : " + animal);

        // boolean b = animal.isEmpty();
        // System.out.println("Is Stack Empty?: " + b);

    }

}
