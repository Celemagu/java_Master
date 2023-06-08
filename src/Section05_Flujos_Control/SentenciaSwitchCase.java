package Section05_Flujos_Control;

public class SentenciaSwitchCase {

	public static void main(String[] args) {
		int num= 8;
		switch (num) {
			case 0:	
				System.out.println("El numero es 0");
				break;
			case 1:	
				System.out.println("El numero es 1");
				break;
			case 2:
				System.out.println("El numero es 2");
				break;
			case 3:
				System.out.println("El numero es 3");
				break;
			default:
				System.out.println("Numero o caracter desconocido");
		}
		
		String nombre = "pato";
		
		switch (nombre){
			case "Pato":
				System.out.println("El nombre es Pato");
				break;
			case "Isa":
				System.out.println("El nombre es Isa");
				break;
			case "Cesar" :
				System.out.println("El nombre es Cesar");
				break;
			default:
				System.out.println("Nombre desconocido");
		}

	}

}
