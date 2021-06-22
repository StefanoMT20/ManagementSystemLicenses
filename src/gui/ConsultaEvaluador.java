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

public class ConsultaEvaluador extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).getNorthPane();
	private Dimension DimensionBarra = null;
	
	private JTable tableEvaluador;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaEvaluador frame = new ConsultaEvaluador();
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
	public ConsultaEvaluador() {
		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
		quitarBarraTitulo();
		getContentPane().setBackground(Color.WHITE);
		setBounds(233, 37, 957, 627);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulta de Evaluadores");
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
		
		tableEvaluador = new JTable();
		tableEvaluador.setBackground(new Color(255, 228, 181));
		tableEvaluador.setFillsViewportHeight(true);
		scrollPane.setViewportView(tableEvaluador);
		tableEvaluador.setBorder(new LineBorder(new Color(227, 227, 227), 2, true));
		tableEvaluador.setBackground(new Color(245, 245, 220));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(239, 98, 144, 20);
		getContentPane().add(textField_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("C\u00F3digo de la propuesta asignada");
		lblNewLabel_3_1.setBounds(239, 78, 218, 14);
		getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Puesto de Evaluador");
		lblNewLabel_2_1.setBounds(65, 158, 164, 14);
		getContentPane().add(lblNewLabel_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(65, 178, 144, 20);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(65, 98, 144, 20);
		getContentPane().add(textField_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("C\u00F3digo de Evaluador");
		lblNewLabel_1_1.setBounds(65, 78, 164, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(239, 178, 144, 20);
		getContentPane().add(textField);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Nombre de Evaluador");
		lblNewLabel_3_1_1.setBounds(239, 158, 187, 14);
		getContentPane().add(lblNewLabel_3_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(440, 98, 144, 20);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Apellido del Evaluador");
		lblNewLabel_3_1_2.setBounds(440, 78, 218, 14);
		getContentPane().add(lblNewLabel_3_1_2);

	}

}
