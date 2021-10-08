package Entregable;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Ejer1 {

	// Este metodo lo utlizamos para sacar la informacion del File o los Directorios
	// que hay los parametros de entrada es la ruta donde quieres sacar la informacion y la salida es la informacion.

	public static void getInformacion(String directorio) {
		// Pasamos la ruta de String a File.
		File ficheros = new File(directorio);
		String[] listado = ficheros.list();

		System.out.println(ficheros.getName());
		System.out.println(ficheros.getAbsolutePath());
		System.out.println(ficheros.length());
		// Aqui es para averiguar si es una archivo o un directorio.
		if (ficheros.isFile()) {
			System.out.println("Es un fichero");
			System.out.println(" Su grandaria es " + ficheros.length());
		} else if (ficheros.isDirectory()) {
			System.out.println("Es un directorio");
			for (int i = 0; i < listado.length; i++) {
				System.out.println(listado[i]);
			}
		}
		// Aqui es para averiguar si el fichero esta oculto o no.
		if (ficheros.isHidden()) {
			System.out.println("Esta oculto");

		} else {
			System.out.println("No esta oculto");
		}
		// Averiguamos la ultima vez que se ha modificado.
		String pattern = "yyyy-MM-dd hh:mm aa";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		Date lastModifiedDate = new Date();

		System.out
				.println("El archivo " + ficheros + " ha sido modificado " + simpleDateFormat.format(lastModifiedDate));
		// Aqui es para averiguar el tamaño
		System.out.println(ficheros.getTotalSpace() + " bytes ");
		System.out.println(ficheros.getFreeSpace() + " bytes ");
		System.out.println(ficheros.getUsableSpace() + " bytes ");
		// Aqui es para averiguar el archivo o el directorio esta vacia.
		if (listado == null || listado.length == 0) {
			System.out.println("Esta vacia la carpeta");
		} else {
			for (int i = 0; i < listado.length; i++) {
				System.out.println(listado[i]);
			}
		}

	}

	// Este metodo lo utlizamos para crear una nueva carpeta.
	public static void creaCarpeta() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime ruta");
		String ruta = sc.nextLine();

		File directorio2 = new File("C:\\eclipse-workspace\\Accesde\src");
		// Nos indica si lo hemos creado.
		if (!directorio2.exists()) {
			if (directorio2.mkdir()) {
				System.out.println(" Creado");
			}

		} else {

			System.out.println("No creado");
		}

	}

	// Este metodo lo utlizamos para crear una nuevo fichero.
	public static void creaFixter() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime ruta");

		File directorio2 = new File("C:\\eclipse-workspace\\Accesde\src");
		// Nos indica si lo hemos creado.
		try {
			directorio2.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Este metodo lo utlizamos para crear eliminar el fichero o directorio.
	public static void elimina() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime ruta");

		File directorio2 = new File("C:\\eclipse-workspace\\Accesde\src");
		// Nos indica si lo hemos borrado.
		if (directorio2.exists()) {
			if (directorio2.delete()) {
				System.out.println("Ha sido borrado el archivo");
			}

		} else {

			System.out.println("No ha sido borrado el archivo");
		}
	}

	// Este metodo lo utlizamos para crear renombrar el fichero o directorio.
	public static void renomena(String directorio) {
		// Nos indica si lo hemos renombrado.
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la ruta con el nuevo nombre");
		String ruta4 = sc.nextLine();
		File ficheros2 = new File(ruta4);
		File ficheros = new File(directorio);
		if (ficheros.exists()) {
			if (ficheros.renameTo(ficheros2)) {
				System.out.println("renombrado");
			}

		} else {

		}
	}

	// Aqui esta el main con el switch para la mejor eleccion del metodo y sea mas comodo.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Informacion");
		System.out.println("2.Crear Directorio");
		System.out.println("3.Crear Fichero");
		System.out.println("4.Elimina");
		System.out.println("5.Renomena");
		System.out.println("6.Salir");
		int valor = sc.nextInt();

		String directorio = args[0];

		switch (valor) {
		case 1:
			getInformacion(directorio);
			break;
		case 2:
			creaCarpeta();
			break;
		case 3:
			creaFixter();
			break;
		case 4:
			elimina();
			break;
		case 5:
			renomena(directorio);
			break;
		case 6:
			System.out.println("Salida Correctamente");
			break;

		}

	}
}
