package Section05_Flujos_Control;

import java.util.Scanner;

public class SentenciaIfElse {

	public static void main(String[] args) {
	float promedio =3.8f;
	if(promedio>=6.5) {
		System.out.println("Felicitaciones, Excelente promedio");
		}else if (promedio >=6){
		System.out.println("Muy buen promedio");
	}else if (promedio >=5.5){
		System.out.println("Buen promedio");
	}	else if (promedio >=5){
		System.out.println("Regular, necesitas un poso mas de esfuerzo");
	}	else if (promedio >=4){
		System.out.println("Insuficiente");
	}	else {
		System.out.println("Reprobado");
	}	
	System.out.println("Promedio = " + promedio);
}

}
