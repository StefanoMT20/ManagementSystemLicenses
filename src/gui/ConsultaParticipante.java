package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class ConsultaParticipante extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).getNorthPane();
	private Dimension DimensionBarra = null;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable tableParticipante;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaParticipante frame = new ConsultaParticipante();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void quitarBarraTitulo() {
		Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).getNorthPane();
		DimensionBarra = Barra.getPreferredSize();
		Barra.setSize(0,0);
		Barra.setPreferredSize(new Dimension (0,0));
		repaint();
	}

	/**
	 * Create the frame.
	 */
	public ConsultaParticipante() {
		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
		quitarBarraTitulo();
		getContentPane().setBackground(Color.WHITE);
		setBounds(233, 37, 957, 627);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulta de Participantes");
		lblNewLabel.setBounds(306, 22, 352, 27);
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo de Participante");
		lblNewLabel_1.setBounds(57, 77, 109, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(57, 128, 123, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido");
		lblNewLabel_3.setBounds(57, 184, 166, 14);
		getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(57, 97, 144, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(57, 153, 144, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(57, 200, 144, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnBuscar = new JButton("    Buscar");
		btnBuscar.setHorizontalAlignment(SwingConstants.LEFT);
		btnBuscar.setBounds(752, 116, 131, 39);
		btnBuscar.setIcon(new ImageIcon(ConsultaParticipante.class.getResource("/img/discovery.png")));
		btnBuscar.setForeground(new Color(253, 245, 230));
		btnBuscar.setBorderPainted(false);
		btnBuscar.setBackground(new Color(220, 20, 60));
		getContentPane().add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 244, 910, 329);
		getContentPane().add(scrollPane);
		
		tableParticipante = new JTable();
		tableParticipante.setFillsViewportHeight(true);
		scrollPane.setColumnHeaderView(tableParticipante);
		tableParticipante.setBorder(new LineBorder(new Color(227, 227, 227), 2, true));
		tableParticipante.setBackground(new Color(245, 245, 220));
		
		JLabel lblNewLabel_2_2 = new JLabel("DNI");
		lblNewLabel_2_2.setBounds(259, 77, 123, 14);
		getContentPane().add(lblNewLabel_2_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(259, 97, 144, 20);
		getContentPane().add(textField_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Email");
		lblNewLabel_3_1.setBounds(259, 128, 166, 14);
		getContentPane().add(lblNewLabel_3_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(259, 153, 144, 20);
		getContentPane().add(textField_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("Direcci\u00F3n");
		lblNewLabel_2_1.setBounds(259, 184, 123, 14);
		getContentPane().add(lblNewLabel_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(259, 200, 144, 20);
		getContentPane().add(textField_5);
		
		JLabel lblNewLabel_3_2 = new JLabel("Celular");
		lblNewLabel_3_2.setBounds(470, 77, 166, 14);
		getContentPane().add(lblNewLabel_3_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(470, 97, 144, 20);
		getContentPane().add(textField_6);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Nombre de Propuesta");
		lblNewLabel_3_2_1.setBounds(470, 128, 166, 14);
		getContentPane().add(lblNewLabel_3_2_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(470, 153, 144, 20);
		getContentPane().add(textField_7);

	}
}


