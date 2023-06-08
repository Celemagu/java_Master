package Section09_Clase_System;

import java.util.Properties;

public class EjemploPropiedadesSystem {

	public static void main(String[] args) {
		
		String username= System.getProperty("user.name");
		System.out.println("username =" + username);
		
		String home = System.getProperty("user.home");
		System.out.println("home =" + home);
		
		
		String workspace = System.getProperty("user.dir");
		System.out.println("home =" + workspace);
		
		String java = System.getProperty("java.version");
		System.out.println("home =" + java);
		
		String lineseparator = System.getProperty("line.separator");
		String lineseparator2 = System.lineSeparator();
		System.out.println("home =" + lineseparator2 + "Una linea nueva ...");
		System.out.println("home =" + lineseparator + "Una linea nueva ...");
		
		
		Properties p = System.getProperties();
		p.list(System.out);
		
	}

}
