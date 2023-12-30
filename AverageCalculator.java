import java.util.*;

public class AverageCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] numbers = new double[3];
		
		numbers[0] = sc.nextDouble();
		numbers[1] = sc.nextDouble();
		numbers[2] = sc.nextDouble();
		
		//System.out.println(numbers.length);
		double resultado = 0;
		for(int i=0; i<numbers.length; i++) {
			resultado = resultado + numbers[i];
		}
		System.out.println(resultado/numbers.length);
		
	}

	
	
	
	
	
	
	
	
	
	
}
