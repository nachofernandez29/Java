
/*  Escriba un programa JAVA que muestre por pantalla los primeros 15 multiplos de 4 y el resultado de la suma de ellos, sin utilizar sentencias condicionales. Harcerlo con While o For*/


public class Ejercicio_3 {

	public static void main(String[] args) {
		int numero = 4;
		double numeroFinal = 0;
		for( int i=1;i<=15;i++) {
			System.out.println(numero*i);
			numeroFinal = numeroFinal + (numero*i);			
		}
		System.out.println("La suma de los primeros 15 multiples de 4 es: " + numeroFinal);
	}

}
