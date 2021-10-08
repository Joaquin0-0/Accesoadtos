package AE02_T1_2_Streams_Entrgable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {

	private Vista vista;
	private Modelo modelo;
	private String ficheroLectura;
	private String ficheroEscritura;
	

	public Controlador(Vista vista, Modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
		control();
	}
	
	private void control() {

		ActionListener actionListenerBoton1 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String mensaje1 = modelo.ficheroEscritura();
				vista.(mensaje1);

			}
		};
		vista.getbtnMensaje1().addActionListener(actionListenerBoton1);
		
		actionListenerBoton2 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String mensaje2 = modelo.getmensaje2();
				vista.mostrarMensaje(mensaje2);

			}
		};
		vista.getbtnMensaje2().addActionListener(actionListenerBoton2);
	}
}
