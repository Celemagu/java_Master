package Section05_Flujos_Control;

import java.util.Scanner;

public class TareaMenuOpciones {

	public static void main(String[] args) {
			
		Scanner m = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("Nuestro menú");
			System.out.println("1. Actualizar");
			System.out.println("2. Eliminar");
			System.out.println("3. Crear");
			System.out.println("4. Listar");
			System.out.println("5. Salir");
			System.out.println("Ingrese el número con la opción que desea");
			opcion= m.nextInt();
		switch (opcion) {
		case 1:	
			System.out.println("Usuario actualizado correctamente");
			System.out.println();
			break;
		case 2:	
			System.out.println("Usuario eliminado correctamente");
			System.out.println();
			break;
		case 3:
			System.out.println("Usuario creado correctamente");
			System.out.println();
			break;
		case 4:
			System.out.println("Lista:");
			System.out.println();
			break;
		case 5:
			System.out.println("Haz salido con exito");
			System.out.println();
			break;
		default:
			System.out.println("Ingrese un número de opción valido");
			System.out.println();
		}
		}while(opcion != 5);
	}

}
