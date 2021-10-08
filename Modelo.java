package AE02_T1_2_Streams_Entrgable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;

public class Modelo {
	private String fichero_lectura;
	private String fichero_escritura;

	public Modelo() {
		fichero_lectura = "AE02_T1_2_Streams_Groucho.txt";
		fichero_escritura = "AE02_T1_2_Streams_Groucho_2.txt";
	}

	public ArrayList<String> contenidoFichero(String fichero) throws IOException {
		
		FileReader fr = new FileReader(fichero);
		
		BufferedReader br= new BufferedReader(fr);
		
	
		return null;

	}
	public String ficheroLectura() {
		return fichero_escritura;}
	public  void remplazar() {
		
	}

	public String ficheroEscritura() {
		return fichero_escritura;
	}

	public String getFichero_lectura() {
		return fichero_lectura;
	}

	public void setFichero_lectura(String fichero_lectura) {
		this.fichero_lectura = fichero_lectura;
	}

	public String getFichero_escritura() {
		return fichero_escritura;
	}

	public void setFichero_escritura(String fichero_escritura) {
		this.fichero_escritura = fichero_escritura;
	}

	
}
