package Section02_Operadores;

public class ConversionTIpos {

	public static void main(String[] args) {
		String numeroStr= "50";
		int numeroInt= Integer.parseInt(numeroStr);
		System.out.println("NumeroInt = " + numeroInt);
		
		int numeroByte = Byte.parseByte(numeroStr);
		System.out.println("numeroByte = " + numeroByte);
		
		String realStr = "98765.43e-3";
		double realDouble = Double.parseDouble(realStr);
		System.out.println("realDouble = " + realDouble);
		
		String logicoStr = "False";
		boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
		System.out.println("logicoBoolean = " + logicoBoolean);
		
		int otroNumeroInt = 100;
		System.out.println("otroNumeroInt = " + otroNumeroInt);
		
		String otronumeroStr = Integer.toString(otroNumeroInt);
		System.out.println("otronumeroStr = " + otronumeroStr);
		
		otronumeroStr = String.valueOf(otroNumeroInt+10);
		System.out.println("otronumeroStr = " + otronumeroStr);
		
		int i = 22768;
		short s = (short)i;
		System.out.println("s =" + s);
		long l = i;
		System.out.println("l =" + l);
		char b =(char)i;
		System.out.println("b =" + b);
		float f = (float) i;
		System.out.println("f =" + f);
	}

}
