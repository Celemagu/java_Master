package Section06_Clases_Wraper;

public class WrapperInteger {

	public static void main(String[] args) {
		
		//Primitivo a objeto
		
		int intPrimitivo = 32768;
		Integer intObjeto = Integer.valueOf(intPrimitivo) ;
		Integer inObjeto2 = 32768;
		
		System.out.println("In Objeto = " + intObjeto);	
		//Objeto a primitivo
		
		int num = intObjeto;
		int num2 = intObjeto.intValue();
		System.out.println("num= " + num);	
		System.out.println("num2= " + num2);
		
		
		String valorTvLcd = "625874";
		Integer valor = Integer.valueOf(valorTvLcd);
		System.out.println("valor= " + valor);
		
		
		Short shortobjeto= intObjeto.shortValue();
		System.out.println("shortobjeto= " + shortobjeto);
		
		Byte byteobjeto = intObjeto.byteValue();
		System.out.println("byteobjeto= " + byteobjeto);
		
		Long longObjeto= intObjeto.longValue();
		System.out.println("longObjeto= " + longObjeto);
		
	}

}
