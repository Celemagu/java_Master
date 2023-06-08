package Section02_Operadores;

public class PrimitivoFloat {

	public static void main(String[] args) {
		
		
		float numeroFloat = 3.4028235E38F;
		
		System.out.println("numeroFloat = " + numeroFloat);
		System.out.println("Tipo Float corresponde en byte a  " + Float.BYTES);
		System.out.println("Tipo Float corresponde en bites a  " + Float.SIZE);
		System.out.println("Valor maximo de un Float es  " + Float.MAX_VALUE);
		System.out.println("Valor minimo de un Float es  " + Float.MIN_VALUE);
		
		double numeroDouble = 1.7976931348623157E308D;
		
		System.out.println("numeroDouble = " + numeroDouble);
		System.out.println("Tipo Double corresponde en byte a  " + Double.BYTES);
		System.out.println("Tipo Double corresponde en bites a  " + Double.SIZE);
		System.out.println("Valor maximo de un Double es  " + Double.MAX_VALUE);
		System.out.println("Valor minimo de un Double es  " + Double.MIN_VALUE);
		
		float varFlotante = 3.1416f;
		System.out.println("varFlotante = " + varFlotante);

	}

}
