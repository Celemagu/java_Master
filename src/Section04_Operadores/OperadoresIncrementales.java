package Section04_Operadores;

public class OperadoresIncrementales {

	public static void main(String[] args) {
		
		//Pre incremento
		int i = 1;
		int j = ++i; //i = i + 1
		System.out.println("i = " + i);
		System.out.println("j = " + j);

		//post Incremento
		
		i=2;
		j = i++;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		//pre Decremento
		
		i=3;
		j= --i; // i = i-1
		System.out.println("i = " + i);
		System.out.println("j = " + j);		
		
		//Post Decremento
		
		i=4;
		j= i--;
		System.out.println("i = " + i);
		System.out.println("j = " + j);	
		
		System.out.println("j = " + (++j));		
		System.out.println("j = " + (j++));	
		System.out.println("j = " + j);	
		
		System.out.println("i = " + (++i));
		System.out.println("i = " + (i++));
	}

}