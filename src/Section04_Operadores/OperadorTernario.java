package Section04_Operadores;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		
		//variable = condicion ? si es verdadero:  si es falso;
		String variable = 7 == 7   ? "Si es verdedaro" : "si es falso";
		System.out.println("Variable = " + variable);
		
		String estado = "";
		double promedio =  0.0;
		double matematicas = 0.0;
		double ciencias = 0.0;
		double historia = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la nota de matematicas entre 2.0 y 7.0");
		matematicas=scanner.nextDouble();
		System.out.println("Ingrese la nota de ciencias entre 2.0 y 7.0");
		ciencias=scanner.nextDouble();
		System.out.println("Ingrese la nota de Historia entre 2.0 y 7.0");
		historia=scanner.nextDouble();
		
		promedio = (matematicas + ciencias + historia) / 3;
		
		estado = promedio >=5.21 ? "Aprobado": "Rechazado";
		System.out.println("Estado = " + estado+ " con una nota de " + promedio);
		
//		if (promedio >=5.49) {
//			estado = "Aprobado";
//		}else {
//			estado = "Rechazado";
//		}
//		
//		System.out.println("Estado = " + estado);
	}

}