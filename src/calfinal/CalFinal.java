package calfinal;

import java.util.Scanner;

public class CalFinal {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		float participaci�n, primerparcial, segundoparcial, ex�menfinal, total;
		
		System.out.println("Ingresa la calificaci�n de la participaci�n");
		participaci�n=entrada.nextFloat();
		
		System.out.println("Ingresa el resultado del primer parcial");
		primerparcial=entrada.nextFloat();
		
		System.out.println("Ingresa la calificaci�n del segundo parcial");
		segundoparcial= entrada.nextFloat();
		
		System.out.println("Ingresa la calificaci�n del ex�men final");
		ex�menfinal= entrada.nextFloat();
		
		
		total = (float) ((participaci�n * 0.10) + (primerparcial * 0.25) + (segundoparcial * 0.25) + (ex�menfinal*0.40));
		
		System.out.println("La calificaci�n total es: " + total);
	}

}
