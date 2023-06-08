package Section02_Operadores;

public class PrimitivosCaracteres {

	public static void main(String[] args) {
		char caracter = '\u0040';
		char decimal = 64;
		System.out.println("caracter = " + caracter);
		System.out.println("decimal = " + decimal);
		System.out.println("decimal = caracter: " + (decimal == caracter));
		
		
		char simbolo = '@';
		System.out.println("simbolo = " + simbolo);
		System.out.println("simbolo = caracter: " + (simbolo == caracter));
		
		char espacio = ' ';
		
		System.out.println("Tipo Char corresponde en byte a" + espacio + Character.BYTES);
		System.out.println("Tipo Char corresponde en bites a  " + Character.SIZE);
		System.out.println("Valor maximo de un Char es  " + Character.MAX_VALUE);
		System.out.println("Valor minimo de un Char es  " + Character.MIN_VALUE);
		
	}

}
