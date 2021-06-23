package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.List;

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

import CBOS.CBOBANCOS;
import Controladores.MySqlContratadosDAO;
import clases.Contratados;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultaContratados extends JInternalFrame implements ActionListener {

	/**
	 * Launch the application.
	 */
	private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).getNorthPane();
	private Dimension DimensionBarra = null;
	private JTable tblContratado;
	private JComboBox cbobuscarB;
	//declarar
	private MySqlContratadosDAO contratadoDAO=new MySqlContratadosDAO();
	private JButton btnBuscar;
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
	public ConsultaContratados() {
		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
		quitarBarraTitulo();
		getContentPane().setBackground(Color.WHITE);
		setBounds(233, 37, 837, 608);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consulta de Contratados");
		lblNewLabel.setBackground(new Color(153, 0, 204));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel.setBounds(187, 11, 436, 49);
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
		getContentPane().add(lblNewLabel);
		
		btnBuscar = new JButton("    Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setHorizontalAlignment(SwingConstants.LEFT);
		btnBuscar.setBounds(667, 72, 131, 39);
		btnBuscar.setIcon(new ImageIcon(ConsultaParticipante.class.getResource("/img/discovery.png")));
		btnBuscar.setForeground(new Color(253, 245, 230));
		btnBuscar.setBorderPainted(false);
		btnBuscar.setBackground(new Color(220, 20, 60));
		getContentPane().add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 147, 789, 426);
		getContentPane().add(scrollPane);
		
		tblContratado = new JTable();
		tblContratado.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"CODIGO", "DNI", "NOMBRE", "APELLIDO", "BANCO"
			}
		));
		scrollPane.setViewportView(tblContratado);
		tblContratado.setBackground(new Color(255, 228, 181));
		tblContratado.setFillsViewportHeight(true);
		tblContratado.setBorder(new LineBorder(new Color(227, 227, 227), 2, true));
		tblContratado.setBackground(new Color(245, 245, 220));
		
		JLabel lblNewLabel_1 = new JLabel("Banco :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(65, 82, 69, 16);
		getContentPane().add(lblNewLabel_1);
		
		cbobuscarB = new CBOBANCOS("select * from TB_BLANCOS");
		cbobuscarB.setBounds(125, 80, 455, 22);
		getContentPane().add(cbobuscarB);

	}
	//metodo listado
			void listado(int codBanco) {
				DefaultTableModel modeloContratado=(DefaultTableModel) tblContratado.getModel();
				modeloContratado.setRowCount(0);
				List<Contratados> lista=contratadoDAO.ListAllBanco(codBanco);
				for(Contratados c:lista) {
					Object row[]= {c.getCodContratado(),c.getDniContratado(),c.getNombreContratado(),c.getApellidoContratado(),c.getNomBanco()};
					modeloContratado.addRow(row);
				}
			}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(e);
		}
	}
	protected void actionPerformedBtnBuscar(ActionEvent e) {
		String banco;
		banco=cbobuscarB.getSelectedItem().toString();
		
		String cad[]=banco.split("-");
		listado(Integer.parseInt(cad[0]));
	}
	}


