package Section03_Tipo_String_Cadenas;

public class EjemploStringExtensionArchivo {

	public static void main(String[] args) {
		String archivo = "alguna_imagen.jpg";
		int i = archivo.lastIndexOf(".");
		System.out.println("archivo = " + archivo.length());
		System.out.println("nombre.Substring= " + archivo.substring(i+1));
		
		

	}

}
