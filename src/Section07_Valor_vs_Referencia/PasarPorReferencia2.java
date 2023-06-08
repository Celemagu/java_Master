package Section07_Valor_vs_Referencia;

class Persona{
	private String nombre;
	
	public void modificarNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public String leerNombre () {
		return nombre;
	}
}

public class PasarPorReferencia2 {

	public static void main(String[] args) {
		
		Persona persona = new Persona ();
		persona.modificarNombre("Cesar");
		
		System.out.println("Iniciamos con el metodo Main");
		
		System.out.println("Persona = " + persona.leerNombre());
		System.out.println("Antes de llamar al metodo test");
		test(persona);
		System.out.println("Despues de llamar al metodo test");
		
		System.out.println("Persona = " + persona.leerNombre());
		System.out.println("Finalizamos el main con los datos de la presona modificados");
	}
	
	public static void test (Persona persona) {
		System.out.println("iniciamos el test ");
		persona.modificarNombre("Leonardo");
		System.out.println("Finalizamos el test");
	}

}
