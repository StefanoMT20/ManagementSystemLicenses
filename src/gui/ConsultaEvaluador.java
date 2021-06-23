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
import javax.swing.JComboBox;

public class ConsultaEvaluador extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).getNorthPane();
	private Dimension DimensionBarra = null;
	
	private JTable tableEvaluador;

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
		btnBuscar.setBounds(730, 113, 131, 39);
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
		
		JLabel lblNewLabel_2_1 = new JLabel("Puesto de Evaluador");
		lblNewLabel_2_1.setBounds(49, 125, 164, 14);
		getContentPane().add(lblNewLabel_2_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(219, 121, 410, 22);
		getContentPane().add(comboBox);

	}
}
