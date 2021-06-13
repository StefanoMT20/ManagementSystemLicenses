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

public class ConsultaPropuesta extends JInternalFrame {

	private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).getNorthPane();
	private Dimension DimensionBarra = null;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable tablePropuestas;

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
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo de Propuesta");
		lblNewLabel_1.setBounds(57, 77, 109, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de Propuesta");
		lblNewLabel_2.setBounds(57, 128, 123, 14);
		getContentPane().add(lblNewLabel_2);
		
		
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
		btnBuscar.setBounds(57, 274, 131, 39);
		btnBuscar.setIcon(new ImageIcon(ConsultaParticipante.class.getResource("/img/discovery.png")));
		btnBuscar.setForeground(new Color(253, 245, 230));
		btnBuscar.setBorderPainted(false);
		btnBuscar.setBackground(new Color(220, 20, 60));
		getContentPane().add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(57, 355, 826, 219);
		getContentPane().add(scrollPane);
		
		tablePropuestas = new JTable();
		tablePropuestas.setFillsViewportHeight(true);
		scrollPane.setColumnHeaderView(tablePropuestas);

	}

}
