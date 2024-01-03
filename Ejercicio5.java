
/*

Las hermanas Mariela, Juana y Andrea habitan una propiedad horizontal formada por tres departamentos.
Si bien cada una abona los gastos individuales de su departamento, el gasto de agua es comun en forma
porcentual segun la cantidad de M2 de la propiedad que habitan, a saber:
 Mariela: 37m2
 Andrea: 63m2
 Juana: 56m2

Desarrollar un programa en JAVA para determinar y mostrar, el importe proporcional del agua que debe ser
abonado por cada heramana, a partir del ingreso por teclado del valor del agua. Utilizar funciones.

*/

import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese monto de la factura del agua: ");
		double facturaAgua = sc.nextDouble();
		
		System.out.println("El monto que tiene que pagar Mariela es " + montoMariela(facturaAgua));
		System.out.println("El monto que tiene que pagar Andrea es " + montoAndrea(facturaAgua));
		System.out.println("El monto que tiene que pagar Juana es " + montoJuana(facturaAgua));

	}
	
	public static double montoMariela(double agua){
		double porcetajeMetrosMariela = 37.0/156;
		double totalPagar = (porcetajeMetrosMariela * agua);
		return totalPagar;
	}
	public static double montoAndrea(double agua){
		float porcetajeMetrosAndrea = 63/156F;
		double totalPagar = (porcetajeMetrosAndrea * agua);
		return totalPagar;
	}
	public static double montoJuana(double agua){
		float porcetajeMetrosJuana = 56/156F;
		double totalPagar = (porcetajeMetrosJuana * agua);
		return totalPagar;
	}

}
