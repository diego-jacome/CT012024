package ejemploJava;

public class Ejemplo_Metodos {

	public static void main(String[] args) {
		int resultado = suma(30,40,50);
		int resultado2 = suma(300,10);
		
		System.out.println(resultado);
		System.out.println(resultado2);
		
		System.out.println(carro(2));
	}
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static String  carro(int a) {
		String[] cars = {"Volvo", "BMW", "Ford"};
		
		return cars[a];
	}
	
	//sobrecarga de métodos. Tiene el mismo nombre que Suma pero un parámetro más
	public static int suma(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
	
}
