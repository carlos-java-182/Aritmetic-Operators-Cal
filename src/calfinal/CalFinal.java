package calfinal;

import java.util.Scanner;

public class CalFinal {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		float participación, primerparcial, segundoparcial, exámenfinal, total;
		
		System.out.println("Ingresa la calificación de la participación");
		participación=entrada.nextFloat();
		
		System.out.println("Ingresa el resultado del primer parcial");
		primerparcial=entrada.nextFloat();
		
		System.out.println("Ingresa la calificación del segundo parcial");
		segundoparcial= entrada.nextFloat();
		
		System.out.println("Ingresa la calificación del exámen final");
		exámenfinal= entrada.nextFloat();
		
		
		total = (float) ((participación * 0.10) + (primerparcial * 0.25) + (segundoparcial * 0.25) + (exámenfinal*0.40));
		
		System.out.println("La calificación total es: " + total);
	}

}
