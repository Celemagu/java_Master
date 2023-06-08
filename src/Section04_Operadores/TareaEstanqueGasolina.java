package Section04_Operadores;

import java.util.Scanner;

public class TareaEstanqueGasolina {

	public static void main(String[] args) {
		
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de Gasolina que tiene el tanque");
		int gas = scanner.nextInt();
		
		if (gas > 70) {
			System.out.println("Por favor revisar, el limite del estanque es de 70");
		} else {
			if (gas == 70) {
				System.out.println("Estanque lleno");
			} else {
				if (gas <0) {
					System.out.println("Por favor revisar, la cantidad debe ser mayor a 0");
				}else {
					if (gas < 70 && gas >=60) {
					System.out.println("Estanque casi lleno");
				}else {
					if (gas < 60 && gas >=40) {
						System.out.println("Estanque 3/4");
					}else {
						if (gas < 40 && gas >=35) {
							System.out.println("Medio estanque");
						}else {
							if (gas < 35 && gas >=20) {
								System.out.println("Suficiente");
							}else {
								if (gas < 20 && gas >=1) {
									System.out.println("InSuficiente");
							}
					
					     }
				
				     }
				}
			}
		}
			}
	}
	}
	}
