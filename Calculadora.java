import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero: ");
		double firstNumber = sc.nextDouble();
		System.out.println("Ingrese uno de los siguentes operadores + , - , * , / ");
		String operation = sc.next();
		
		System.out.println("Ingrese el segundo numero: ");
		double secondNumber = sc.nextDouble();
		
		double resultado = doCalculation(firstNumber, secondNumber, operation);
		
		System.out.println("El resultado final es: " + resultado);
	
	}
	
	public  static double doCalculation(double firstNumber, double secondNumber, String operation) {
		if (operation.equals("+")){
			return sum(firstNumber, secondNumber);
		} else if (operation.equals("-")) {
			return subs(firstNumber, secondNumber);
		} else if (operation.equals("*")) {
			return multiply(firstNumber, secondNumber);
		} else if (operation.equals("/")) {
			return divide(firstNumber, secondNumber);
		}
			
		throw new IllegalArgumentException("Operacion desconocida"); 
		
	}
	//Funcion Suma
	public static double sum(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	//Funcion Resta
	public static double subs(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}
	//Funcion multiplicar
	public static double multiply(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}
	//Funcion dividir
	public static double divide(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
	}
	
	
	
	
	
	
	
	
}
