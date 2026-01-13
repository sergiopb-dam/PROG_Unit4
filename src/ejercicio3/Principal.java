package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// En el main de la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5)
		// y (7,9)(2,3). Muestra por pantalla sus coordenadas, perímetros (suma de
		// lados) y áreas (ancho x alto). Modifica todas las coordenadas como consideres
		// y vuelve a imprimir coordenadas, perímetros y áreas.

		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();

		// Rectángulo 1
		r1.x1 = 0;
		r1.y1 = 0;
		r1.x2 = 5;
		r1.y2 = 5;

		// Rectángulo 2
		r2.x1 = 7;
		r2.y1 = 9;
		r2.x2 = 2;
		r2.y2 = 3;

		// CÁLCULOS R1
		int base1, altura1;

		// Calculamos la base (x) asegurando que sea positiva
		if (r1.x2 > r1.x1) {
			base1 = r1.x2 - r1.x1;
		} else {
			base1 = r1.x1 - r1.x2;
		}

		// Calculamos la altura (y) asegurando que sea positiva
		if (r1.y2 > r1.y1) {
			altura1 = r1.y2 - r1.y1;
		} else {
			altura1 = r1.y1 - r1.y2;
		}

		System.out.println("Rectángulo 1:");
		System.out.println("Coords: (" + r1.x1 + "," + r1.y1 + ") (" + r1.x2 + "," + r1.y2 + ")");
		System.out.println("Perímetro: " + (2 * (base1 + altura1)));
		System.out.println("Área: " + (base1 * altura1));
		System.out.println();

		// CÁLCULOS R2
		int base2, altura2;

		// Base
		if (r2.x2 > r2.x1) {
			base2 = r2.x2 - r2.x1;
		} else {
			base2 = r2.x1 - r2.x2; // Entrará aquí porque 7 es mayor que 2
		}

		// Altura
		if (r2.y2 > r2.y1) {
			altura2 = r2.y2 - r2.y1;
		} else {
			altura2 = r2.y1 - r2.y2; // Entrará aquí porque 9 es mayor que 3
		}

		System.out.println("Rectángulo 2:");
		System.out.println("Coords: (" + r2.x1 + "," + r2.y1 + ") (" + r2.x2 + "," + r2.y2 + ")");
		System.out.println("Perímetro: " + (2 * (base2 + altura2)));
		System.out.println("Área: " + (base2 * altura2));

		// --- MODIFICACIÓN ---
		System.out.println("\n--- MODIFICADOS ---");

		// Cambio coordenadas R1
		r1.x1 = 2;
		r1.y1 = 2;
		r1.x2 = 6;
		r1.y2 = 4;

		// Cambio coordenadas R2
		r2.x1 = 10;
		r2.y1 = 10;
		r2.x2 = 5;
		r2.y2 = 5;

		// VUELTA A CALCULAR R1
		if (r1.x2 > r1.x1)
			base1 = r1.x2 - r1.x1;
		else
			base1 = r1.x1 - r1.x2;

		if (r1.y2 > r1.y1)
			altura1 = r1.y2 - r1.y1;
		else
			altura1 = r1.y1 - r1.y2;

		System.out.println("Rectángulo 1 Modificado:");
		System.out.println("Perímetro: " + (2 * (base1 + altura1)));
		System.out.println("Área: " + (base1 * altura1));

		// VUELTA A CALCULAR R2
		if (r2.x2 > r2.x1)
			base2 = r2.x2 - r2.x1;
		else
			base2 = r2.x1 - r2.x2;

		if (r2.y2 > r2.y1)
			altura2 = r2.y2 - r2.y1;
		else
			altura2 = r2.y1 - r2.y2;

		System.out.println("Rectángulo 2 Modificado:");
		System.out.println("Perímetro: " + (2 * (base2 + altura2)));
		System.out.println("Área: " + (base2 * altura2));

	}

}
