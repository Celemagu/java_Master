package Section04_Operadores;

public class OperadoresUnarios {

	public static void main(String[] args) {
		int i = -5;
		
		int j= +i; // j = (1)*i => -5
		System.out.println("j= " + j);
		
		int k= -i; // j = (-1)*i => 5
		System.out.println("K= " + k);
		
		i =6;
		j = +i;
		System.out.println("j= " + j);
		k = -i;
		System.out.println("K= " + k);
	}

}
