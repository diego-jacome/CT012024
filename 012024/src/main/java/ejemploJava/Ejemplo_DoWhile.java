package ejemploJava;

public class Ejemplo_DoWhile {

	public static void main(String[] args) {
		int b = 10;
		
		do {
			//Este código dentro del "Do" se imprime incluso si la condición del While es falsa
			System.out.println("El valor de B es " + b);
			b++;
		}while(b <= 20);
		
		
	}
		

}
