package Section05_Flujos_Control;

import java.util.Scanner;

public class TareaCalcularnumeromenor {

	public static void main(String[] args) {

		Scanner conteoc = new Scanner(System.in);
		System.out.println("Ingresar la cantidad de números que se van a ingresar (debe ser mayor o igual 1)");
		int cancar= conteoc.nextInt();
		int numeromenor = Integer.MAX_VALUE;
		
		if (cancar < 1) {
			System.out.println("Por favor ingresa un numero mayor a 1");
			System.out.println("Ingresar la cantidad de números que se van a ingresar (debe ser mayor o igual 1)");
			cancar= conteoc.nextInt();
		}
		
		for(int i=1 ; i <= cancar; i++ ) {
			
			System.out.println("Ingresar el numero " + i + " de " +cancar + " que se van a ingresar" );
			int num= conteoc.nextInt();
			
			if (num < numeromenor) {
				numeromenor = num;
			}
			
		}
		
		if (numeromenor < 10) {
			System.out.println("El numero menor es " + numeromenor +" y es menor que 10" );
		} else
			
		System.out.println("El numero menor es igual o mayor a 10");

	}

}
