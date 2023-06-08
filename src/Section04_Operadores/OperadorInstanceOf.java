package Section04_Operadores;

public class OperadorInstanceOf {

	public static void main(String[] args) {
		String texto = "Creando un objeto de la clase string";
		Integer num = 7;
		
		boolean b1 = texto instanceof String;
		System.out.println("Texto es el tipo String = " + b1);

		b1 = texto instanceof Object;
		System.out.println("Texto es el tipo Object = " + b1);
		
		b1 = num instanceof Integer;
		System.out.println("num es el tipo Integer = " + b1);
		
		b1 = num instanceof Number;
		System.out.println("num es el tipo Number = " + b1);
		
		b1 = num instanceof Object;
		System.out.println("num es el tipo Object = " + b1);
		
		Double decimal = 45.54;
		
		b1 = decimal instanceof Number;
		System.out.println("decimal es el tipo Number = " + b1);
		
				
	}

}
