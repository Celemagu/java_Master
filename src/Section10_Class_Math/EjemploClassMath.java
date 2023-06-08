package Section10_Class_Math;

public class EjemploClassMath {

	public static void main(String[] args) {
		
		int absoluto = Math.abs(-3); // absoluto de un valor
		System.out.println("absoluto = "+ absoluto);
		
		double max= Math.max(3.5, 1.2); // maximo de dos valores
		System.out.println("max = "+ max);
		
		double min= Math.min(3.5, 1.2); // minimo de dos valores
		System.out.println("min = "+ min);
		
		double techo= Math.ceil(3.5); // redondea hacia arriba
		System.out.println("techo = "+ techo);
		
		double piso= Math.floor(3.5); // redondea hacia abajo
		System.out.println("piso = "+ piso);
		
		long entero = Math.round(3.4); //redondea al entero mas cercano
		System.out.println("entero = "+ entero);
		
		double exp  = Math.exp(2); //exponencial
		System.out.println("exp = "+ exp);
		
		double log  = Math.log(10); //logaritmo natural
		System.out.println("log = "+ log);
		
		double potencia  = Math.pow(10, 3); //potencia
		System.out.println("potencia = "+ potencia);
		
		double raiz  = Math.sqrt(25); //raiz cuadrada
		System.out.println("raiz = "+ raiz);
		
		double grados  = Math.toDegrees(1.57); // convertir a grados
		grados = Math.round(grados);
		System.out.println("grados = "+ grados);
		
		double radianes  = Math.toRadians(90.00); // convertir a radianes
		//radianes = Math.round(radianes);
		System.out.println("radianes = "+ radianes);
		
		System.out.println("Sin (90) = " + Math.sin(radianes)); // seno
		System.out.println("cos (90) = " + Math.cos(radianes)); // coseno
		
		radianes = Math.toRadians(180);
		System.out.println("cos (90) = " + Math.cos(radianes)); // coseno
		radianes = Math.toRadians(0.00);
		System.out.println("cos (90) = " + Math.cos(radianes)); // coseno
	}

}
