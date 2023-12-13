import java.io.*;

public class Main {
	
	
	public static void main(String[] args) {
		System.out.println("The method of Duck");
		duck duck1 = new duck();
		System.out.println(duck1.eat());
		System.out.println();
		
		System.out.println("The methods of Parrot");
		parrot parrot1 = new parrot();
		System.out.println(parrot1.eat());
		System.out.println(parrot1.fly());


		
	

	}

}
