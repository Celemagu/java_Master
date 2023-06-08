package Section09_Clase_System;

import java.io.IOException;

public class EjemploEjecutarProgramaSO {

	public static void main(String[] args) {
		
		
		Runtime rt = Runtime.getRuntime();
		Process proceso;
		
		try {
		if (System.getProperty("os.name").startsWith("Linux")) {
			
				proceso = rt.exec("gedit");
		
			} else {
				proceso = rt.exec ("notepad");
			}
		proceso.waitFor();
		
		} catch (Exception e) {
			 System.err.println("El comando es desconocido " + e.getMessage());
			 System.exit(1);
			
			}
		
		
		System.out.println("Se ha cerrado el editor");
		System.exit(0);
	}

}
