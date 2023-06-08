package Section05_Flujos_Control;

import java.util.Scanner;

public class TareaMultiplicarNumeros {

	public static void main(String[] args) {
		
	Scanner s= new Scanner(System.in);
	System.out.println("Ingresar el primer numero a multiplicar" );
	int num1= s.nextInt();
	System.out.println("Ingresar el Segundo numero a multiplicar" );
	int num2= s.nextInt();
	int total= 0;
	
		boolean positivonum1= num1>-1;
		boolean positivonum2= num2>-1;
		
		int abs = positivonum1? num1: -num1;
						
		
		for(int i= 1; i <= abs; i++) {
			total += num2;
		}
		
		if ((!positivonum1 && !positivonum2) || !positivonum1) {
			total = -total;
		}
		
		System.out.println("el resultado de la multiplicación es "+ total);
		
	}

}
