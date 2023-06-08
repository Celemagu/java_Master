package Section02_Operadores;
import javax.swing.JOptionPane;

public class SistemasNumericos {

	public static void main(String[] args) {
		
		String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
		int numeroDecimal = 0;
		try {
			numeroDecimal =Integer.parseInt(numeroStr);
		} catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero entero");
			main (args);
			System.exit(0);
		}
		
		System.out.println("numeroDecimal = " + numeroDecimal);
		
		
		System.out.println("numero binario de " + numeroDecimal+ " es igual a " +Integer.toBinaryString(numeroDecimal));
		
		
		int numeroBinario = 0b111110100;
		System.out.println("numeroBinario = " + numeroBinario);
		
		
		
		System.out.println("numero octal de " + numeroDecimal+ " es igual a " + Integer.toOctalString(numeroDecimal));
		int numeroOctal = 0764;
		System.out.println("numeroOctal = " + numeroOctal);
		
		System.out.println("numero Hexadecimal de " + numeroDecimal+ " es igual a " + Integer.toHexString(numeroDecimal));
		int numeroHex = 0x1f4;
		System.out.println("numeroHex = " + numeroHex);
		
		String mensaje = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
		mensaje += "\nnumero octal de " + numeroDecimal+ " es igual a " + Integer.toOctalString(numeroDecimal);
		mensaje += "\nnumero Hexadecimal de " + numeroDecimal+ " es igual a " + Integer.toHexString(numeroDecimal);
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
