package Section07_Valor_vs_Referencia;

public class PasarPorReferencia {

	public static void main(String[] args) {
		
		int[] edad  = {10,11,12};
		
		System.out.println("iniciamos el main" );
		
		for (int i=0; i < edad.length; i++) {
			System.out.println("edad [i] = " + edad[i] );
			
		}
		System.out.println("Antes de llamar al metodo test");
		test(edad);
		System.out.println("Despues de llamar al metodo test");
		for (int i=0; i < edad.length; i++) {
			System.out.println("edad [i] = " + edad[i] );
		}
		
		System.out.println("Finalizamos el main con los datos del arreglo modificados");
	}
	
	public static void test (int [] edadArr) {
		System.out.println("iniciamos el test ");
		for (int i=0; i < edadArr.length; i++) {
			edadArr[i] = edadArr[i]+20;
		}
		System.out.println("Finalizamos el test");
	}

}
