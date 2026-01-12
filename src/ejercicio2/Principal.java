package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona();

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre de la primera persona: ");
		p1.nombre = sc.next();
		System.out.println("Introduce los apellidos de la primera persona: ");
		p1.apellidos = sc.next();
		System.out.println("Introduce el DNI de la primera persona: ");
		p1.DNI = sc.next();
		System.out.println("Introduce la edad de la primera persona: ");
		p1.edad = sc.nextInt();

		System.out.println("Introduce el nombre de la segunda persona: ");
		p2.nombre = sc.next();
		System.out.println("Introduce los apellidos de la segunda persona: ");
		p2.apellidos = sc.next();
		System.out.println("Introduce el DNI de la segunda persona: ");
		p2.DNI = sc.next();
		System.out.println("Introduce la edad de la segunda persona: ");
		p2.edad = sc.nextInt();

		System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.DNI + " tiene " + p1.edad + " años.");
		System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.DNI + " tiene " + p2.edad + " años.");

		sc.close();
	}

}
