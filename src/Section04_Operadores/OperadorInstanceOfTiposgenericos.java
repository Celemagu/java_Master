package Section04_Operadores;

public class OperadorInstanceOfTiposgenericos {

	public static void main(String[] args) {
		Object texto = "Creando un objeto de la clase string";
		Number num = 7;
		
		boolean b1 = texto instanceof String;
		
		
		System.out.println("Texto es el tipo String = " + b1);

		b1 = texto instanceof Number;
		System.out.println("Texto es el tipo Number = " + b1);
		
		b1 = texto instanceof Object;
		System.out.println("num es el tipo Object = " + b1);
		
		b1 = num instanceof Long;
		System.out.println("num es el tipo Long = " + b1);
		
		b1 = num instanceof Double;
		System.out.println("num es el tipo Double = " + b1);
		
		Number decimal = 45.54;
		b1= decimal instanceof Double;
		System.out.println("decimal es el tipo double = " + b1);
		b1 = decimal instanceof Number;
		System.out.println("decimal es el tipo Number = " + b1);
		b1 = decimal instanceof Float;
		System.out.println("decimal es el tipo Float = " + b1);
				
	}

}
