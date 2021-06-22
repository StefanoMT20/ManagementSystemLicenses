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
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class ConsultaPropuesta extends JInternalFrame {

	private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).getNorthPane();
	private Dimension DimensionBarra = null;
	private JTable tablePropuestas;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MantenimientoPropuestas frame = new MantenimientoPropuestas();
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
	public ConsultaPropuesta() {
		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
		quitarBarraTitulo();
		getContentPane().setBackground(Color.WHITE);
		setBounds(233, 37, 957, 627);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulta de Propuesta");
		lblNewLabel.setBounds(306, 22, 352, 27);
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
		getContentPane().add(lblNewLabel);
		
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
		
		tablePropuestas = new JTable();
		tablePropuestas.setFillsViewportHeight(true);
		scrollPane.setColumnHeaderView(tablePropuestas);
		tablePropuestas.setBorder(new LineBorder(new Color(227, 227, 227), 2, true));
		tablePropuestas.setBackground(new Color(245, 245, 220));
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo de Propuesta");
		lblNewLabel_1.setBounds(57, 78, 171, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(57, 98, 144, 20);
		getContentPane().add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de Propuesta");
		lblNewLabel_2.setBounds(57, 129, 194, 14);
		getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(57, 154, 144, 20);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("C\u00F3digo del Participante");
		lblNewLabel_3.setBounds(57, 185, 171, 14);
		getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(57, 201, 144, 20);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Fecha de Inicio");
		lblNewLabel_2_2.setBounds(265, 78, 123, 14);
		getContentPane().add(lblNewLabel_2_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(265, 98, 144, 20);
		getContentPane().add(textField_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Fecha Final");
		lblNewLabel_3_1.setBounds(265, 129, 166, 14);
		getContentPane().add(lblNewLabel_3_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(265, 154, 144, 20);
		getContentPane().add(textField_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("Presupuesto");
		lblNewLabel_2_1.setBounds(265, 185, 123, 14);
		getContentPane().add(lblNewLabel_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(265, 201, 144, 20);
		getContentPane().add(textField_5);
		
		JLabel lblNewLabel_2_3 = new JLabel("Puntaje Propuesta T\u00E9cnica");
		lblNewLabel_2_3.setBounds(487, 78, 194, 14);
		getContentPane().add(lblNewLabel_2_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(487, 103, 144, 20);
		getContentPane().add(textField_6);
		
		JLabel lblNewLabel_3_2 = new JLabel("Puntaje Propuesta Econ\u00F3mica");
		lblNewLabel_3_2.setBounds(487, 134, 194, 14);
		getContentPane().add(lblNewLabel_3_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(487, 150, 144, 20);
		getContentPane().add(textField_7);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Puntaje Final");
		lblNewLabel_3_2_1.setBounds(487, 185, 166, 14);
		getContentPane().add(lblNewLabel_3_2_1);
		
		textField_8 = new JTextField();
		textField_8.setEnabled(false);
		textField_8.setColumns(10);
		textField_8.setBounds(487, 201, 144, 20);
		getContentPane().add(textField_8);

	}

}
