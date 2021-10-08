package Entregable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejer1Entregable {

	/*
	 * Parametros de Entrada : Ninguno Metodo : Say Hello Parametros de Salida :Void
	 * 
	 */
	public static void sayHello() {

		System.out.println("Hola mundo");

	}

	/*
	 * Parametros de Entrada : Ninguno Metodo : arrayCompa Parametros de Salida :
	 * Void
	 * 
	 */
	public static void arrayCompa() {
		System.out.println("--------------------------------");
		System.out.println("Array normal");
		System.out.println("  ");
		String[] alumnos = { "Joan", "Ximo", "Jorge", "Xavi", "Eric", "Ripoll" };
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}

		System.out.println("--------------------------------");
		System.out.println("Array list");
		System.out.println("  ");

		ArrayList<String> Compa = new ArrayList<String>();
		Compa.add("Joan");
		Compa.add("Ximo");
		Compa.add("Jorge");
		Compa.add("Xavi");
		Compa.add("Eric");
		Compa.add("Ripoll");

		System.out.println(Compa.get(0));
		System.out.println(Compa.get(1));
		System.out.println(Compa.get(2));
		System.out.println(Compa.get(3));
		System.out.println(Compa.get(4));
		System.out.println(Compa.get(5));
	}

	/*
	 * Parametros de Entrada : Int Metodo : numerosPares Parametros de Salida : Void
	 * 
	 */
	public static void numerosPares(int numero) {
		int suma = 0, cont = 0;

		if (numero % 2 == 0) {

			do {
				suma = suma + cont;
				cont = cont + 2;
			} while (cont != numero + 2);

		} else {
			do {
				suma = suma + cont;
				cont = cont + 2;
			} while (cont != numero + 1);
		}

		System.out.println("--------------------------------");
		System.out.println("La suma de los pares es " + suma);
	}

	/*
	 * Parametros de Entrada : Int Metodo : Factorial Parametros de Salida : Void
	 * 
	 */
	public static void factorial(int numero) {
		long factorial = numero;
		int menosUno = numero - 1;
		for (int i = menosUno; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println("El factorial " + numero + " es de " + factorial);
	}

	/*
	 * Parametros de Entrada : Int Metodo : Elementos Parametros de Salida : Void
	 * 
	 */
	public static void elementos(int[] elementos) {
		int numero = 0;
		for (int i = 0; i < elementos.length; i++) {
			if (numero < elementos[i]) {
				numero = elementos[i];
			}
		}
		System.out.println("El numero mas mayor es " + numero);
	}

	/*
	 * Parametros de Entrada : Ninguno Metodo : Numeros ENteros Parametros de Salida
	 * : Void
	 * 
	 */
	public static void numeroEnteros() {
		Scanner sc = new Scanner(System.in);
		int[] elementos = new int[4];
		int suma = 0;
		for (int i = 0; i < elementos.length; i++) {
			System.out.println("Dime el numero");
			elementos[i] = sc.nextInt();

			suma = suma + elementos[i];
			System.out.println(suma);
		}
		for (int i = 4; i >= 0; i--) {

			System.out.println("Numeros Inversos");

			elementos[i] = sc.nextInt();
			System.out.println(elementos[i]);
		}

	}

	/*
	 * Parametros de Entrada : Ninguno Metodo : Empresa Parametros de Salida : Void
	 * 
	 */
	public static void empresa() {
		Scanner sc = new Scanner(System.in);

		double años;
		String nombre;

		System.out.println("Dime tu nombre");
		nombre = sc.nextLine();

		System.out.println("Dime cuantos años de experiencia tienes");
		años = sc.nextInt();

		if (años < 1) {
			System.out.println("Desarrollador Junior L1 – 15000-18000");
		} else if (años > 1 && años < 2) {
			System.out.println("Desarrollador Junior L2 – 18000-22000");
		}
		if (años > 3 && años < 5) {
			System.out.println("Desarrollador Senior L1 – 22000-28000");
		} else if (años > 5 && años < 8) {
			System.out.println("Desarrollador Senior L2 – 28000-36000");
		}
		if (años > 8) {
			System.out.println("Analista / Arquitecto. Salario a convenir en base a rol");
		}
	}

	/*
	 * Parametros de Entrada : Ninguno Metodo : Teclado Parametros de Salida : Void
	 * 
	 */
	public static void teclado() {
		Scanner sc = new Scanner(System.in);
		long mili = System.currentTimeMillis();
		int primero;
		int numfinal;
		int contador;

		System.out.println("Dime Primer numero");
		primero = sc.nextInt();

		System.out.println("Dime tu Segundo numero");
		numfinal = sc.nextInt();

		System.out.println(primero);
		contador = primero;
		for (int i = primero; i <= numfinal - 1; i++) {
			contador = contador + 1;
			System.out.println(contador);

			if (contador == 2 || contador == 3 || contador == 5 || contador == 7) {
				System.out.println("Es primo");

			} else if (contador % 2 == 0 || contador % 3 == 0 || contador % 5 == 0 || contador % 7 == 0) {
				System.out.println("No es primo");
			}

		}
		long tim = System.currentTimeMillis() - mili;
		System.out.println("La accion tarda "  + tim + " en nanosegundos");
	}

	public static void main(String[] args) {
		String numero = args[0];
		Scanner sc = new Scanner(System.in);
		int numeroInt = Integer.parseInt(numero);
		int[] elementos = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int valor = sc.nextInt();

		String directorio = args[0];

		System.out.println("1.SayHello");
		System.out.println("2.ArrayCompa");
		System.out.println("3.NumerosPares");
		System.out.println("4.Factorial");
		System.out.println("5.Elementos");
		System.out.println("6.Empresa");
		System.out.println("7.Teclado");
		System.out.println("8.Salir");

		switch (valor) {
		case 1:
			sayHello();
			break;
		case 2:
			arrayCompa();
			break;
		case 3:
			numerosPares(numeroInt);
			break;
		case 4:
			factorial(numeroInt);
			break;
		case 5:
			elementos(elementos);
			break;
		case 6:
			empresa();
			break;
		case 7:
			teclado();
			break;
		case 8:
			System.out.println("Salida Correctamente");
			break;

		}

	}

	

}
