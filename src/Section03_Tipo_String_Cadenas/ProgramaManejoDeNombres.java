package Section03_Tipo_String_Cadenas;

import java.util.Scanner;

public class ProgramaManejoDeNombres {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el primer nombre");
		String nombre1= scanner.nextLine();
		System.out.println("IIngrese el Segundo nombre");
		String nombre2= scanner.nextLine();
		System.out.println("Ingrese el tercer nombre");
		String nombre3= scanner.nextLine();
		
		System.out.println("nombre.charArt(0)= " + nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2));
		System.out.println("nombre.charArt(0)= " + nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2));
		System.out.println("nombre.charArt(0)= " + nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2));
	}

}
