package Section04_Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {

	public static void main(String[] args) {
		String userName= "Cesar";
		String password = "12345";
		
		String userName2= "Pato";
		String password2 = "12345";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el username");
		String usuario= scanner.next();
		
		System.out.println("Ingrese el password");
		String pass= scanner.next();
		
		boolean esAutenticado= false;
		
		if(userName.equals(usuario) || userName2.equals(usuario)) {
			if (password.equals(pass)||password2.equals(pass)) {
				System.out.println("Acceso correcto");
			}else {
				System.out.println("Password Incorrecto");
			}
		}else {
			System.out.println("Usuario Incorrecto");
		}
	}

}
