package Section04_Operadores;

import javax.swing.JOptionPane;

public class TareaNombreMasLargo {

	public static void main(String[] args) {
		String nom1 = JOptionPane.showInputDialog(null, "Ingrese primer nombre");
		String nom2 = JOptionPane.showInputDialog(null,"Ingrese segundo nombre");
		String nom3 = JOptionPane.showInputDialog(null,"Ingrese tercer nombre");
		
		String max;
		int car=0;
		
		car = (nom1.length() > nom2.length()) ? nom1.length() : nom2.length();
		car = (car > nom3.length()) ? car : nom3.length();
		
		max = (nom1.length() > nom2.length()) ? nom1 : nom2;
		max = (max.length() > nom3.length()) ? max : nom3;
		
		JOptionPane.showMessageDialog(null, max + " tiene el nombre más largo con "+ car +" caracteres");
		
		}

}
