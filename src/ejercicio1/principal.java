package ejercicio1;

public class principal {
	public static void main(String[] args) {
		Punto p1 = new Punto();
		Punto p2 = new Punto();
		Punto p3 = new Punto();

		p1.x = 5;
		p1.y = 0;

		p2.x = 10;
		p2.y = 10;

		p3.x = -3;
		p3.y = 7;
		
		System.out.println("Coordenadas originales");
		System.out.println("-----------------------");
		System.out.print("(" + p1.x + "," + p1.y + ")");
		System.out.println();
		System.out.print("(" + p2.x + "," + p2.y + ")");
		System.out.println();
		System.out.print("(" + p3.x + "," + p3.y + ")");
		System.out.println();

		p1.y *= p3.x;
		p1.x = p1.x * p2.y;

		p2.x += p1.x;
		p2.y = p2.y + p3.y;

		p3.x = p3.x - p1.x;
		p3.y = p1.x;

		System.out.println();
		System.out.println("Coordenadas modificadas");
		System.out.println("-----------------------");
		System.out.print("(" + p1.x + "," + p1.y + ")");
		System.out.println();
		System.out.print("(" + p2.x + "," + p2.y + ")");
		System.out.println();
		System.out.print("(" + p3.x + "," + p3.y + ")");
		System.out.println();
	}

}
