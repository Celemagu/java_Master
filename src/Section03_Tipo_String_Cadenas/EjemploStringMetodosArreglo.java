package Section03_Tipo_String_Cadenas;

public class EjemploStringMetodosArreglo {

	public static void main(String[] args) {
		String nombre= "Cesar";
		System.out.println("nombre.lenght()= " + nombre.length());
		System.out.println("nombre.ToUppercase()= " + nombre.toUpperCase());
		System.out.println("nombre.ToLowercase()= " + nombre.toLowerCase());
		System.out.println("nombre.equals()= " + nombre.equals("Cesar"));
		System.out.println("nombre.equalsIgnoreCase()= " + nombre.equalsIgnoreCase("cesar"));
		System.out.println("nombre.compareTo(equal)= " + nombre.compareTo("Cesar"));
		System.out.println("nombre.compareTo(diferente)= " + nombre.compareTo("Aaron"));
		System.out.println("nombre.charArt(0)= " + nombre.charAt(0));
		System.out.println("nombre.charArt(4)= " + nombre.charAt(4));
		System.out.println("nombre.charArt(nombre.length)= " + nombre.charAt(nombre.length()-2));
		System.out.println("nombre.Substring= " + nombre.substring(4));
		System.out.println("nombre.Substring= " + nombre.substring(nombre.length()-2));
		
		
		String trabalenguas= "trabalenguas";
		System.out.println("trabalenguas.replace = " + trabalenguas.replace("a", "."));
		System.out.println("trabalenguas.indexOf = " + trabalenguas.indexOf('a'));
		System.out.println("trabalenguas.lastIndexOf = " + trabalenguas.lastIndexOf('a'));
		System.out.println("trabalenguas.indexOf(carnoexiste) = " + trabalenguas.indexOf('z'));
		System.out.println("trabalenguas.contains = " + trabalenguas.contains("lenguas"));
		System.out.println("trabalenguas.startsWith = " + trabalenguas.startsWith("t"));
		System.out.println("trabalenguas.endsWith = " + trabalenguas.endsWith("as"));
		System.out.println("  trabalenguas  ");
		System.out.println("  trabalenguas  ".trim());
		
		
	}

}
