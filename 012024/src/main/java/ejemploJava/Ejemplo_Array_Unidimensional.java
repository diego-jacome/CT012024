package ejemploJava;

public class Ejemplo_Array_Unidimensional {

	public static void main(String[] args) {
		//Ejemplos de declaración de arreglos
		int intArray[];
		int[] intArray2;
		double doublearray[];
		
	
		//Declarar un arreglo de strings
		String[] arr;
		
		//Asignar memoria para 5 strings
		arr = new String[5];
		
		//inicializar el primer elemento del arreglo
		arr[0] = "cero";
		
		//inicializar el segundo elemento del arreglo
		arr[1] = "uno";
		
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		/*Ejemplo de imprimir cada posición del arreglo individualmente
		
		 system.out.println("La posición del arreglo es: " +arr[0])
		 system.out.println("La posición del arreglo es: " +arr[1])
		 system.out.println("La posición del arreglo es: " +arr[2])
		 system.out.println("La posición del arreglo es: " +arr[3])
		 system.out.println("La posición del arreglo es: " +arr[4])
		 
		*/
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Elemento en el indice " + i + ": " + arr[i]);
		}
		
		//ejemplo de arreglo de enteros
		int[] intArr = new int[] {1,2,3,4,5,6,7,8};

	}
}

