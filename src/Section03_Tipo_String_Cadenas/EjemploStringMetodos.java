package Section03_Tipo_String_Cadenas;

public class EjemploStringMetodos {

	public static void main(String[] args) {
		
		String trabalenguas= "trabalenguas";
		System.out.println("Trabalenguas.toCharArray= "+ trabalenguas.toCharArray());
		
		char[] arreglo = trabalenguas.toCharArray();
		int largo= arreglo.length;
		System.out.println("largo=  "+ largo);
		for (int i=0; i < largo; i++) {
			System.out.println("arreglo = " + arreglo [i]);
		}
		
		System.out.println("Trabalenguas= "+ trabalenguas.split("a").toString());
		
		String [] arreglo2 = trabalenguas.split("a");
		int l= arreglo2.length;
		for (int j=0; j < l; j++) {
			System.out.println( arreglo2 [j]);
		}
		
		
	}

}
