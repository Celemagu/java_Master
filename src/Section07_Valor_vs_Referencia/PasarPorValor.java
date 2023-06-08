package Section07_Valor_vs_Referencia;

public class PasarPorValor {

	public static void main(String[] args) {
		
		int i = 10;
		
		System.out.println("iniciamos el main con i  = " + i );
		test(i);
		System.out.println("Finalizamos el main con i (se mantiene igual) = " + i );
	}
	
	public static void test (int i) {
		System.out.println("iniciamos el test con i  = " + i );
		i=35;
		System.out.println("Finalizamos el test con i  = " + i );
	}

}