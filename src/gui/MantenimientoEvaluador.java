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

public class MantenimientoEvaluador extends JInternalFrame {
	private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).getNorthPane();
	private Dimension DimensionBarra = null;
	private JTable tableEvaluadores;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MantenimientoEvaluador frame = new MantenimientoEvaluador();
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
	public MantenimientoEvaluador() {
		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
		quitarBarraTitulo();
		getContentPane().setBackground(Color.WHITE);
		setBounds(233, 37, 957, 627);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mantenimiento de Evaluadores");
		lblNewLabel.setBounds(306, 22, 352, 27);
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
		getContentPane().add(lblNewLabel);
		
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
		
		tableEvaluadores = new JTable();
		tableEvaluadores.setBackground(new Color(255, 228, 181));
		tableEvaluadores.setFillsViewportHeight(true);
		scrollPane.setViewportView(tableEvaluadores);
		tableEvaluadores.setBorder(new LineBorder(new Color(227, 227, 227), 2, true));
		tableEvaluadores.setBackground(new Color(245, 245, 220));
		
		JLabel lblNewLabel_1_1 = new JLabel("C\u00F3digo de Evaluador");
		lblNewLabel_1_1.setBounds(49, 77, 164, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(49, 102, 144, 20);
		getContentPane().add(textField);
		
		JLabel lblNewLabel_2_1 = new JLabel("Puesto de Evaluador");
		lblNewLabel_2_1.setBounds(49, 162, 164, 14);
		getContentPane().add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(49, 180, 144, 20);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Nombre de Evaluador");
		lblNewLabel_3_1_1.setBounds(242, 162, 187, 14);
		getContentPane().add(lblNewLabel_3_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(242, 180, 144, 20);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("C\u00F3digo de la propuesta asignada");
		lblNewLabel_3_1.setBounds(242, 77, 218, 14);
		getContentPane().add(lblNewLabel_3_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(242, 102, 144, 20);
		getContentPane().add(textField_3);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Apellido del Evaluador");
		lblNewLabel_3_1_2.setBounds(453, 77, 218, 14);
		getContentPane().add(lblNewLabel_3_1_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(456, 102, 144, 20);
		getContentPane().add(textField_4);

	}

	}


