package Section10_Class_Math;

import java.util.Random;

public class EjemploClassMathRandom {

	public static void main(String[] args) {
		
		String [] colores = {"azul", "amarillo", "verde", "negro", "gris", "rojo"};
		
		double random =Math.random();	
		System.out.println("Random = "+ random);
		random *=colores.length;
		System.out.println("Random = "+ random);
		
		random = Math.floor(random);
		System.out.println("Random = "+ random);
		System.out.println("colores = "+ colores[(int)random]);
		
		
		Random randomobj = new Random ();
		int randomint = randomobj.nextInt(25 -15); // entre 0 a 15
		System.out.println("randomint = "+ randomint);
	
		randomint= randomobj.nextInt(colores.length);
		System.out.println("randomint = "+ randomint);
		System.out.println("colores = "+ colores[randomint]);
		
	}

}
