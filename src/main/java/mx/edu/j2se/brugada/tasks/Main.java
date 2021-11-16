package mx.edu.j2se.brugada.tasks;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello World");

		Task correrEnLasMananas = new Task("correrEnLasMananas", 4, 10, 2);
		//4, 6, 8, 10

		correrEnLasMananas.setActive(true);

		System.out.println(correrEnLasMananas);

	}

}
