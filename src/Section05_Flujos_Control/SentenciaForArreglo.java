package Section05_Flujos_Control;

import javax.swing.JOptionPane;

public class SentenciaForArreglo {

	public static void main(String[] args) {

		String [] nombres = {"Cesar", "Pato", "Isa", "Carlos", "Andres", "Helena" };
		int count = nombres.length;
		for (int i = 0; i < count; i++) {
			if (nombres [i].equalsIgnoreCase("cesar") || nombres [i].equalsIgnoreCase("helena" )){
				continue;
			}
			System.out.println(i + ".- " + nombres [i]);
		}
		
		
		String buscar = JOptionPane.showInputDialog("Ingrese un nombre");
		System.out.println("buscar = " + buscar);
		
		boolean encontrado =false;
		for (int i = 0; i<count; i++) {
			if (nombres[i].equalsIgnoreCase(buscar)) {
				encontrado =true;
				break;
			}
		}
		
		if (encontrado) {
			JOptionPane.showMessageDialog(null, buscar + " Fue encontrado!!");
		}else {
			JOptionPane.showMessageDialog(null, buscar + " No Fue encontrado!!");
		}
			
	}

}
