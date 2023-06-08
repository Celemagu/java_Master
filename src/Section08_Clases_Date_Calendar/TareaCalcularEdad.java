package Section08_Clases_Date_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TareaCalcularEdad {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Ingrese la fecha de nacimiento con formato 'yyyy-MM-dd'" );
		try {
			Date fecha = format.parse(s.next());
			Date fecha2 = new Date ();
			long edad = fecha2.getYear() - fecha.getYear();
			
			System.out.println("Su edad es =" + edad + " años");
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
