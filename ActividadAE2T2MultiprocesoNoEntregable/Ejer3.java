package ActividadAE2T2MultiprocesoNoEntregable;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ejer3 {

	public static void main(String[] args) {
		 
		String ruta = "C:\\eclipse-workspace\\ProgramacionServivios\\src\\Lanzadera\\Suma3304.txt";
        String contenido = "Suma";
        PrintWriter salida = null;
        File file = new File(ruta);
        int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
				try {
	
	            FileWriter fw = new FileWriter(file);
	            BufferedWriter bw = new BufferedWriter(fw);
	            salida = new PrintWriter("C:\\eclipse-workspace\\ProgramacionServivios\\src\\Lanzadera\\Suma3304.txt");
	            bw.write(String.valueOf(n1));
	            bw.write(String.valueOf(n2));
	            bw.close();
	            bw.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

