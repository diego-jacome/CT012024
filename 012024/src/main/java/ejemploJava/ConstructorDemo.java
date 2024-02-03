package ejemploJava;

public class ConstructorDemo {

	public static void main(String[] args) {
		MiClase t1 = new MiClase();
		
		System.out.println(t1.x);
		
		//siempre el constructor se inicializará en 10 porque es el valor de la clase
		
	    MiClase t2 = new MiClase();
		
		System.out.println(t2.x);

	}

}
