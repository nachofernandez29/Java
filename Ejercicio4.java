
/*Escriba un programa JAVA para cargar en un vector, 100 numeros enteros pares secuenciales partiendo
  desde la mitad de 678. Mostrar en forma invertida, los elementos de dicho valor */

public class Ejercicio4 {

	public static void main(String[] args) {
			float numeroPartida = 678/2F;
			double vectorSolicitado[] = new double[100];
			
			while(numeroPartida%2 != 0) {
				numeroPartida = numeroPartida + 1;
			}
			vectorSolicitado[0] = numeroPartida;
			for(int i=1;i<vectorSolicitado.length;i++) {
				numeroPartida = numeroPartida + 2;
				vectorSolicitado[i] = numeroPartida; 
			}
			
			for(int i=99;i<vectorSolicitado.length;i--) {
				if (i>=0) {
					System.out.println(vectorSolicitado[i]);
				}
				
			}
			
			System.out.println("En este array hay " + vectorSolicitado.length + " elementos");
			
			
	}

}
