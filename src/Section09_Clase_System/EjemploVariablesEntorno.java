package Section09_Clase_System;

import java.util.Map;

public class EjemploVariablesEntorno {

	public static void main(String[] args) {
		
		
		Map<String, String> varEnv = System.getenv();
		System.out.println("Variables de entorno del sistema = " + varEnv);
		
		System.out.println("---------Listando variables de entorno del sistema---------- ");
		
		for (String key: varEnv.keySet()) {
			System.out.println(key + "=>" + varEnv.get(key));
		}
				
		String username = System.getenv("USERNAME");
		System.out.println("Username = " + username);
		
		String javahome = System.getenv("JAVA_HOME");
		System.out.println("javahome = " + javahome);
		
		String Xauthority = System.getenv("XAUTHORITY");
		System.out.println("Xauthority = " + Xauthority);
		
		String path = System.getenv("PATH");
		System.out.println("path = " + path);
		
		String path2 = varEnv.get("Path");
		System.out.println("path2 = " + path2);
		
	}

}
