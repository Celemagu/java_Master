package Section10_Class_Math;

import java.util.Scanner;

public class TareaAreaCirculo {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Ingresar el radio del circulo" );
		double radio= s.nextDouble();
		radio = Math.pow(radio,2);
		double area= Math.PI*radio;
		
		System.out.println("el area del circulo con radio "+ radio+ " es:" +area);
					}

}
