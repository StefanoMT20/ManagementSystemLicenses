package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class frmConsultaParticipante extends JFrame {

	private JPanel contentPane;
	private JTextField txtBusquedaCodigo;
	private JTextField txtNombre;
	private JTextField txtApellido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConsultaParticipante frame = new frmConsultaParticipante();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmConsultaParticipante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 464, 209);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Busqueda por c\u00F3digo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(31, 77, 172, 27);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CONSULTA DE PARTICIPANTES");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(57, 26, 369, 27);
		panel.add(lblNewLabel_1);
		
		txtBusquedaCodigo = new JTextField();
		txtBusquedaCodigo.setBounds(169, 81, 172, 20);
		panel.add(txtBusquedaCodigo);
		txtBusquedaCodigo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(89, 125, 50, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido");
		lblNewLabel_3.setBounds(313, 125, 65, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.setBounds(351, 80, 89, 23);
		panel.add(btnNewButton);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(41, 146, 136, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(253, 146, 147, 20);
		panel.add(txtApellido);
		txtApellido.setColumns(10);
	}
}
