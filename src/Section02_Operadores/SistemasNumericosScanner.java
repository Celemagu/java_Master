package Section02_Operadores;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SistemasNumericosScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		//String numeroStr= scanner.nextLine();
		
		
		
		int numeroDecimal = 0;
		try {
			numeroDecimal =scanner.nextInt(); //Integer.parseInt(numeroStr);
		} catch (InputMismatchException e){
			System.out.println("Error, debe ingresar un numero entero");
			main (args);
			System.exit(0);
		}
		
		System.out.println("numeroDecimal = " + numeroDecimal);
		
		
		System.out.println("numero binario de " + numeroDecimal+ " es igual a " +Integer.toBinaryString(numeroDecimal));
		
		
		int numeroBinario = 0b111110100;
		//System.out.println("numeroBinario = " + numeroBinario);
		
		
		
		System.out.println("numero octal de " + numeroDecimal+ " es igual a " + Integer.toOctalString(numeroDecimal));
		int numeroOctal = 0764;
		//System.out.println("numeroOctal = " + numeroOctal);
		
		System.out.println("numero Hexadecimal de " + numeroDecimal+ " es igual a " + Integer.toHexString(numeroDecimal));
		int numeroHex = 0x1f4;
		//System.out.println("numeroHex = " + numeroHex);
		
		String mensaje = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
		mensaje += "\nnumero octal de " + numeroDecimal+ " es igual a " + Integer.toOctalString(numeroDecimal);
		mensaje += "\nnumero Hexadecimal de " + numeroDecimal+ " es igual a " + Integer.toHexString(numeroDecimal);
		System.out.println(mensaje);
	}

}
