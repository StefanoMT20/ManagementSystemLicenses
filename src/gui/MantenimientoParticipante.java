package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JComponent;

public class MantenimientoParticipante extends JInternalFrame {
	private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).getNorthPane();
	private Dimension DimensionBarra = null;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable tableParticipantes;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MantenimientoParticipante frame = new MantenimientoParticipante();
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
	public MantenimientoParticipante() {
		
		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
		quitarBarraTitulo();
		getContentPane().setBackground(Color.WHITE);
		setBounds(233, 37, 957, 627);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mantenimiento de Participantes");
		lblNewLabel.setBounds(306, 22, 352, 27);
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo de Participante");
		lblNewLabel_1.setBounds(57, 77, 180, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre ");
		lblNewLabel_2.setBounds(57, 128, 166, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido");
		lblNewLabel_3.setBounds(57, 184, 46, 14);
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
		
		JButton btnRegistrar = new JButton("    Registrar");
		btnRegistrar.setBounds(735, 77, 153, 39);
		btnRegistrar.setForeground(new Color(253, 245, 230));
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setIcon(new ImageIcon(MantenimientoEvaluador.class.getResource("/img/open-book.png")));
		btnRegistrar.setBackground(new Color(220, 20, 60));
		getContentPane().add(btnRegistrar);
		
		JButton btnEliminar = new JButton("    Eliminar");
		btnEliminar.setBounds(735, 180, 153, 39);
		btnEliminar.setIcon(new ImageIcon(MantenimientoEvaluador.class.getResource("/img/delete (2).png")));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setForeground(new Color(253, 245, 230));
		btnEliminar.setBorderPainted(false);
		btnEliminar.setBackground(new Color(220, 20, 60));
		getContentPane().add(btnEliminar);
		
		JButton btnModificar = new JButton("    Modificar");
		btnModificar.setBounds(735, 128, 153, 39);
		btnModificar.setIcon(new ImageIcon(MantenimientoEvaluador.class.getResource("/img/edit (1).png")));
		btnModificar.setForeground(new Color(253, 245, 230));
		btnModificar.setBorderPainted(false);
		btnModificar.setBackground(new Color(220, 20, 60));
		getContentPane().add(btnModificar);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 244, 910, 329);
		getContentPane().add(scrollPane);
		
		tableParticipantes = new JTable();
		tableParticipantes.setFillsViewportHeight(true);
		scrollPane.setColumnHeaderView(tableParticipantes);
		tableParticipantes.setBorder(new LineBorder(new Color(227, 227, 227), 2, true));
		tableParticipantes.setBackground(new Color(245, 245, 220));
		
		JLabel lblNewLabel_2_2 = new JLabel("DNI");
		lblNewLabel_2_2.setBounds(247, 77, 123, 14);
		getContentPane().add(lblNewLabel_2_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(247, 97, 144, 20);
		getContentPane().add(textField_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Email");
		lblNewLabel_3_1.setBounds(247, 128, 166, 14);
		getContentPane().add(lblNewLabel_3_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(247, 153, 144, 20);
		getContentPane().add(textField_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("Direcci\u00F3n");
		lblNewLabel_2_1.setBounds(247, 184, 123, 14);
		getContentPane().add(lblNewLabel_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(247, 200, 144, 20);
		getContentPane().add(textField_5);
		
		JLabel lblNewLabel_3_2 = new JLabel("Celular");
		lblNewLabel_3_2.setBounds(458, 77, 166, 14);
		getContentPane().add(lblNewLabel_3_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(458, 97, 144, 20);
		getContentPane().add(textField_7);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Nombre de Propuesta");
		lblNewLabel_3_2_1.setBounds(458, 128, 166, 14);
		getContentPane().add(lblNewLabel_3_2_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(458, 153, 144, 20);
		getContentPane().add(textField_8);

	}
}
