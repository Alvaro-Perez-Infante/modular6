package pakage;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Util.subrayar("EJERCICIO 06 MODULAR", "*");

		double num;
		boolean resultado;

		num = Util.leerdouble("Introduzca un número: ");
		resultado = esPrimo(num);

		System.out.println(resultado);
		
		if (resultado == true) {
			Util.escribir("El número introducido es primo");
		} else {
			Util.escribir("El número introducido NO es primo");
		}
		

	}

	public static boolean esPrimo(double num) {

		boolean resultado;
		if (num % 2 == 0){
			
			resultado = false;
			
		} else {
			
			resultado = true;

		}
		return resultado;
	}

}
