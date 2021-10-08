package ActividadAE2T2MultiprocesoNoEntregable;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Ejer4 {
	public void lanzarSumador(Integer n1, Integer n2) {
		String clase = "C:\\eclipse-workspace\\ProgramacionServivios\\src\\Lanzadera\\Suma3304.txt";
		try {

			String javaHome = System.getProperty("java.home");
			String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
			String classpath = System.getProperty("java.class.path");
			System.out.println(classpath);
			String className = clase;

			List<String> command = new ArrayList<>();
			command.add(javaBin);
			command.add("-cp");
			command.add(classpath);
			command.add(className);
			command.add(n1.toString());
			command.add(n2.toString());

			System.out.println("Comando que se pasa a ProcessBuilder: " + command);
			System.out.println("Comando a ejecutar en cmd.exe: " + command.toString().replace(",", ""));

			ProcessBuilder builder = new ProcessBuilder(command);
			Process process = builder.inheritIO().start();
			// Process process = builder.start();
			process.waitFor();
			 BufferedWriter bw = new BufferedWriter(new FileReader(clase));
			 bw.readLine();
			 bw.close();
			System.out.println(process.exitValue());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

