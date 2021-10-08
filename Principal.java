package AE02_T1_2_Streams_Entrgable;

public class Principal {

	public static void main(String[] args) {
	
		Vista vista = new Vista();
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador(vista,modelo);

	}

}
