package AE02_T1_2_Streams_Entrgable;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Vista {
	private JFrame frame;
	private JTextField textField_Buscar;
	private JTextField textField_Reemplazar;
	JButton btnBuscar;
	private JButton btnReemplazar;
	private JTextArea textArea_Original;
	private JTextArea textArea_Modificado;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 799, 581);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane textArea_Originals = new JScrollPane();
		textArea_Originals.setBounds(22, 20, 743, 222);
		frame.getContentPane().add(textArea_Originals);
		
		textArea_Original = new JTextArea();
		textArea_Original.setLineWrap(true);
		textArea_Original.setRows(12);
		textArea_Originals.setColumnHeaderView(textArea_Original);
		textArea_Originals.getViewport().setView(textArea_Original);
		
		textField_Buscar = new JTextField();
		textField_Buscar.setBounds(32, 252, 177, 27);
		frame.getContentPane().add(textField_Buscar);
		textField_Buscar.setColumns(10);
		
		textField_Reemplazar = new JTextField();
		textField_Reemplazar.setColumns(10);
		textField_Reemplazar.setBounds(421, 252, 177, 27);
		frame.getContentPane().add(textField_Reemplazar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBuscar.setBounds(219, 252, 120, 27);
		frame.getContentPane().add(btnBuscar);
		
		btnReemplazar = new JButton("Reemplazar");
		btnReemplazar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReemplazar.setBounds(608, 252, 120, 27);
		frame.getContentPane().add(btnReemplazar);
		
		JScrollPane scrollPane_Modificado = new JScrollPane();
		scrollPane_Modificado.setBounds(22, 300, 743, 222);
		frame.getContentPane().add(scrollPane_Modificado);
		
		textArea_Modificado = new JTextArea();
		textArea_Modificado.setLineWrap(true);
		textArea_Modificado.setRows(12);
		scrollPane_Modificado.setColumnHeaderView(textArea_Modificado);
		scrollPane_Modificado.getViewport().setView(textArea_Modificado);
		
		this.frame.setVisible(true);
	}
	
	public JButton getBtnBuscar() {
		return btnBuscar;
	}
	
	public JButton getBtnReemplazar() {
		return btnReemplazar;
	}
	
	public JTextField getTextFieldBuscar() {
		return textField_Buscar;
	}
	
	public JTextField getTextFieldReemplazar() {
		return textField_Reemplazar;
	}
	
	public JTextArea getTextAreaOriginal() {
		return textArea_Original;
	}
	
	public JTextArea getTextAreaModificado() {
		return textArea_Modificado;
	}

}