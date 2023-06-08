package Section02_Operadores;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Factura {
	public static void main(String[] args) {
		
		double suma = 0;
		double impuesto = 0.19;
		double sumaImpuesto=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la Factura");
		String nombreFactura= scanner.nextLine();
		
		System.out.println("Ingrese el primer precio");
		double precio1= 0;
		
		
		try {
			precio1 =scanner.nextDouble(); //Integer.parseInt(numeroStr);
		} catch (InputMismatchException e){
			System.out.println("Error, debe ingresar un numero");
			main (args);
			System.exit(0);
		}
				
		System.out.println("Ingrese el segundo precio");
		double precio2= 0;	
		
		try {
			precio2 =scanner.nextDouble(); //Integer.parseInt(numeroStr);
		} catch (InputMismatchException e){
			System.out.println("Error, debe ingresar un numero");
			main (args);
			System.exit(0);
		}
		
		suma= precio1 + precio2;
		sumaImpuesto= (impuesto*suma)+suma;
		
		
		System.out.println("El nombre de su factura es : " + nombreFactura);
		System.out.println("por un valor de : " + suma + " (sin iva)");
		System.out.println("con un iva del : " + impuesto*suma);
		System.out.println("por un valor total de : " + sumaImpuesto);
		
	}
}
