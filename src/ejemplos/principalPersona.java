package ejemplos;

public class principalPersona {

	public static void main(String[] args) {
		persona Daniel = new persona();
		System.out.println();
		Daniel.nombre = "Daniel";
		Daniel.carnet = false;
		Daniel.genero = "No binarie";
		Daniel.edad = 18;
		Daniel.DNI = "5968596859";
		System.out.println(Daniel.nombre);
	}

}
