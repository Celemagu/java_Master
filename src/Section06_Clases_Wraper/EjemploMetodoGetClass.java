package Section06_Clases_Wraper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {

	public static void main(String[] args) {
		
		String texto = "Hola que tal";
		
		Class strClass = texto.getClass();
		
		System.out.println("strClass. getname()= " + strClass.getName());
		System.out.println("strClass. getSimpleName()= " + strClass.getSimpleName());
		System.out.println("strClass. getPackageName()= " + strClass.getPackageName());
		System.out.println("strClass= " + strClass);
		
		for (Method metodo: strClass.getMethods()){
			System.out.println("Metodo =" + metodo.getName());
		}
		Integer num=34;
		Class intClass = num.getClass();
		Class objClass = intClass.getSuperclass().getSuperclass();
		
		System.out.println("IntClass= " + intClass.getSuperclass());
		System.out.println("IntClass= " + objClass);
		
		
		for (Method metodo: objClass.getMethods()){
			System.out.println("Metodo =" + metodo.getName());
		}
		
	}

}
