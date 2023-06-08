package Section09_Clase_System;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesSistema {

	public static void main(String[] args) {
		
		try {
			FileInputStream archivo = new FileInputStream ("src/Section9_Clase_System/config.properties");
			
			Properties p = new Properties(System.getProperties());
			p.load(archivo);
			p.setProperty("mi.propiedad.personalizada", "mi valor guardado en el objeto properties");
			
			System.setProperties(p);
			
			Properties ps=System.getProperties();
			
			System.out.println("ps = " + ps.getProperty("mi.propiedad.personalizada"));
			System.out.println(System.getProperty("config.autor.email"));
			System.out.println(System.getProperty("config.texto.ambiente"));
			
			ps.list(System.out);
			
			
		} catch (Exception e) {
			System.out.println("No existe el archivo "  + e);
			
		}

	}

}
