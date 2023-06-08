package Section04_Operadores;

import java.util.Scanner;

public class OperadoresLogicosLoginArreglos {

	public static void main(String[] args) {
		
//		String [] userNames = new String [2];
//		String [] password = new String [2];
//		
//		userNames [0]= "Cesar";
//		password [0]= "12345";
//		userNames [1]= "Pato";
//		password [1]= "12345";
		
		String [] userNames = {"cesar", "Pato"};
		String [] password = {"45678", "12345"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el username");
		String usuario= scanner.next();
		
		System.out.println("Ingrese el password");
		String pass= scanner.next();
		
		boolean esAutenticado= false;
		
		for (int i =0 ; i < userNames.length; i++) {
			if(userNames[i].equals(usuario) && password[i].equals(pass)) {
				esAutenticado= true;
				break;
				}
			}
		
		if (esAutenticado) {
			System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
		}else {
			System.out.println("Username o Password Incorrecto");
			System.out.println("lo siento requiere autenticación ");
		}
			
		}
		
		
		
	}


