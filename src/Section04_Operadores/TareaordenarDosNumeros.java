package Section04_Operadores;

import java.util.Scanner;

public class TareaordenarDosNumeros {

	public static void main(String[] args) {
		
		int max= 0, min= 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el primer número");
		int num1 = scanner.nextInt();
		System.out.println("Ingrese el Segundo número");
		int num2 = scanner.nextInt();
		
		
		
		max= (num1 > num2) ? num1 : num2;
		min =(num1 < num2) ? num1 : num2;
		
		System.out.println("numero mayor es:" + max + " y el numero menor es " + min);
	
	
	
	}

}
