package avazquezch.training;

import java.util.ArrayList;
import java.util.List;

public class Aplication {

    public void greet() {
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");

        for (String greeting  : greetings) {
            System.out.println("Greeting: " + greeting);
        }
    }
    
    public Aplication() {
        System.out.println ("Inside Aplication");
    }

    // method main(): ALWAYS the Aplication entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Aplication");
	Aplication app = new Aplication();
    app.greet();
    }
}
