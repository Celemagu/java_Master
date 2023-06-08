package Section04_Operadores;

import javax.swing.JOptionPane;

public class OperadoresAritmetico {

	public static void main(String[] args) {
		int i =5, j =4, suma = i + j, resta = i-j, multi= i*j, division = i/j;
		float div= (float) i/j;
		
		System.out.println("Suma = " + suma);
		System.out.println("Resta = " + resta);
		System.out.println("Multiplicación = " + multi);
		System.out.println("division= " + division);
		System.out.println("division2= " + div);
		
		int resto = i / j;
		
		System.out.println("resto= " + resto);
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		if (numero % 2 == 0) {
			System.out.println("numero par = " + numero);
		} else {
			System.out.println("numero Impar = " + numero);
		}
			

	}

}
