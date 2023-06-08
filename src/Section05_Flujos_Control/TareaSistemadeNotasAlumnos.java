package Section05_Flujos_Control;

import java.util.Scanner;

public class TareaSistemadeNotasAlumnos {

	public static void main(String[] args) {
		
		
		Scanner notasf = new Scanner(System.in);
		double notasfinales= 0;
		int cantnotas= 5;
		double may5=0;
		double men4=0;
		int igual1=0;
		double promt=0;
		int prom=0;
		int prom1=0;
		
		for(int i=1 ; i <= cantnotas; i++ ) {
			
			System.out.println("Ingresar el numero " + i + " de " +cantnotas + " que se van a ingresar (deben estar entre 1 y 7)" );
			notasfinales= notasf.nextDouble();
			
			if (notasfinales >=5) {
				may5 += (notasfinales);
				prom ++;
			} else if (notasfinales <=4) {
				men4 += notasfinales; 
				prom1 ++;
			} 
			
			if (notasfinales ==1.0) {
				igual1 ++;
				
			}
			promt += notasfinales;
			
		}
		
	
		System.out.println("promt = "+ promt);
		promt /= cantnotas;
		may5/= prom;
		men4 /= prom1;
		
		System.out.println("El promedio de notas superiores a 5 es " + may5);
		System.out.println("El promedio de notas inferiores a 4 es " + men4);
		System.out.println("La cantidad de notas = 1 es " + igual1);
		System.out.println("El promedio total de notas es " + promt);
		

	}

}
