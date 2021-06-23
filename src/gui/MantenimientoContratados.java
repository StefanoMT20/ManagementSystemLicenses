package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;


import CBOS.CBOBANCOS;
import Controladores.MySqlContratadosDAO;
import clases.Contratados;

import javax.swing.JComboBox;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class MantenimientoContratados extends JInternalFrame implements ActionListener, MouseListener {
	private MySqlContratadosDAO contratadosDAO = new MySqlContratadosDAO();

	private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).getNorthPane();
	private Dimension DimensionBarra = null;
	
	private JTextField txtcodContratado;
	private JTextField txtNomcontra;
	private JTextField txtApecontra;
	private JTextField txtDNIcontra;
	private JTextField txtEmacontra;
	private JTextField txtDirecontra;
	private JTextField txtCelcontra;
	private JButton btnRegistrar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JTable tblContratados;
	private JComboBox cboBanco;
	private JTextField txtSueldoContra;

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
	public MantenimientoContratados() {
		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
		quitarBarraTitulo();
		getContentPane().setBackground(Color.WHITE);
		setBounds(233, 37, 957, 627);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mantenimiento de Contratados");
		lblNewLabel.setBackground(new Color(153, 0, 204));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel.setBounds(0, 0, 957, 49);
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo de Contratado");
		lblNewLabel_1.setBounds(57, 77, 109, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de Contratado");
		lblNewLabel_2.setBounds(57, 128, 123, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido");
		lblNewLabel_3.setBounds(57, 184, 166, 14);
		getContentPane().add(lblNewLabel_3);
		
		txtcodContratado = new JTextField();
		txtcodContratado.setEnabled(false);
		txtcodContratado.setBounds(57, 97, 144, 20);
		getContentPane().add(txtcodContratado);
		txtcodContratado.setColumns(10);
		
		txtNomcontra = new JTextField();
		txtNomcontra.setBounds(57, 153, 144, 20);
		getContentPane().add(txtNomcontra);
		txtNomcontra.setColumns(10);
		
		txtApecontra = new JTextField();
		txtApecontra.setBounds(57, 200, 144, 20);
		getContentPane().add(txtApecontra);
		txtApecontra.setColumns(10);
		
		btnRegistrar = new JButton("    Registrar");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setBounds(735, 77, 153, 39);
		btnRegistrar.setForeground(new Color(253, 245, 230));
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setIcon(new ImageIcon(MantenimientoEvaluador.class.getResource("/img/open-book.png")));
		btnRegistrar.setBackground(new Color(220, 20, 60));
		getContentPane().add(btnRegistrar);
		
		btnEliminar = new JButton("    Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(735, 180, 153, 39);
		btnEliminar.setIcon(new ImageIcon(MantenimientoEvaluador.class.getResource("/img/delete (2).png")));
		btnEliminar.setForeground(new Color(253, 245, 230));
		btnEliminar.setBorderPainted(false);
		btnEliminar.setBackground(new Color(220, 20, 60));
		getContentPane().add(btnEliminar);
		
		btnModificar = new JButton("    Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(735, 128, 153, 39);
		btnModificar.setIcon(new ImageIcon(MantenimientoEvaluador.class.getResource("/img/edit (1).png")));
		btnModificar.setForeground(new Color(253, 245, 230));
		btnModificar.setBorderPainted(false);
		btnModificar.setBackground(new Color(220, 20, 60));
		getContentPane().add(btnModificar);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 244, 910, 329);
		getContentPane().add(scrollPane);
		
		tblContratados = new JTable();
		tblContratados.addMouseListener(this);
		tblContratados.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"CODIGO", "DNI", "NOMBRES", "APELLIDOS", "DIRECCI\u00D3N", "EMAIL", "TELEFONO", "BANCO", "SUELDO S/"
			}
		));
		tblContratados.getColumnModel().getColumn(0).setPreferredWidth(55);
		tblContratados.getColumnModel().getColumn(6).setPreferredWidth(85);
		tblContratados.getColumnModel().getColumn(7).setPreferredWidth(74);
		tblContratados.setBackground(new Color(255, 153, 153));
		scrollPane.setViewportView(tblContratados);
		
		JLabel lblNewLabel_2_1 = new JLabel("Direcci\u00F3n");
		lblNewLabel_2_1.setBounds(291, 184, 123, 14);
		getContentPane().add(lblNewLabel_2_1);
		
		txtDNIcontra = new JTextField();
		txtDNIcontra.setColumns(10);
		txtDNIcontra.setBounds(291, 97, 144, 20);
		getContentPane().add(txtDNIcontra);
		
		JLabel lblNewLabel_3_1 = new JLabel("Email");
		lblNewLabel_3_1.setBounds(291, 128, 166, 14);
		getContentPane().add(lblNewLabel_3_1);
		
		txtEmacontra = new JTextField();
		txtEmacontra.setColumns(10);
		txtEmacontra.setBounds(291, 153, 144, 20);
		getContentPane().add(txtEmacontra);
		
		JLabel lblNewLabel_2_2 = new JLabel("DNI");
		lblNewLabel_2_2.setBounds(291, 77, 123, 14);
		getContentPane().add(lblNewLabel_2_2);
		
		txtDirecontra = new JTextField();
		txtDirecontra.setColumns(10);
		txtDirecontra.setBounds(291, 200, 144, 20);
		getContentPane().add(txtDirecontra);
		
		JLabel lblNewLabel_2_3 = new JLabel("Banco Asociado");
		lblNewLabel_2_3.setBounds(513, 77, 123, 14);
		getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("Celular");
		lblNewLabel_3_2.setBounds(513, 133, 166, 14);
		getContentPane().add(lblNewLabel_3_2);
		
		txtCelcontra = new JTextField();
		txtCelcontra.setColumns(10);
		txtCelcontra.setBounds(513, 149, 144, 20);
		getContentPane().add(txtCelcontra);
		
		JLabel texfiueld = new JLabel("Sueldo");
		texfiueld.setBounds(513, 184, 166, 14);
		getContentPane().add(texfiueld);
		
		cboBanco = new CBOBANCOS("select * from TB_BLANCOS") ;
		cboBanco.setBounds(513, 96, 153, 21);
		getContentPane().add(cboBanco);
		
		txtSueldoContra = new JTextField();
		txtSueldoContra.setColumns(10);
		txtSueldoContra.setBounds(513, 200, 144, 20);
		getContentPane().add(txtSueldoContra);
		listado();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(e);
		}
		if (e.getSource() == btnModificar) {
			actionPerformedBtnModificar(e);
		}
		if (e.getSource() == btnRegistrar) {
			actionPerformedBtnRegistrar(e);
		}
	}
	protected void actionPerformedBtnRegistrar(ActionEvent e) {
		String dni,nom,ape,dire,email,cel,sue;
		dni=txtDNIcontra.getText();
		nom=txtNomcontra.getText();
		ape=txtApecontra.getText();
		dire=txtDirecontra.getText();
		email=txtEmacontra.getText();
		cel=txtCelcontra.getText();
		sue=txtSueldoContra.getText();
		//validando
		if(dni.trim().equals("")) {
			mensaje("Campo DNI es obligatorio");
			txtDNIcontra.requestFocus();
		}
		if(dni.matches("\\d{8}")==false) {
			mensaje("Campo DNI 8 cifras");
			txtDNIcontra.requestFocus();
		}
		else if(nom.trim().equals("")) {
			mensaje("Campo Nombre es obligatorio");
			txtNomcontra.requestFocus();
		}
		else if(nom.matches("[a-zA-Z\\s\\ñ\\Ñ\\á\\é\\í\\ó\\ú\\Á\\É\\Í\\Ó\\Ú\\Ü]{3,30}")==false) {
			mensaje("Campo Nombre solo letras");
			txtNomcontra.requestFocus();
		}
		else if(ape.trim().equals("")) {
			mensaje("Campo Apellido es obligatorio");
			txtApecontra.requestFocus();
		}
		else if(ape.matches("[a-zA-Z\\s\\ñ\\Ñ\\á\\é\\í\\ó\\ú\\Á\\É\\Í\\Ó\\Ú\\Ü]{3,30}")==false) {
			mensaje("Campo Apellidos solo letras");
			txtApecontra.requestFocus();
		}
		else if(cel.matches("\\d{9}")==false) {
			mensaje("Telefono 9 cifras");
			txtCelcontra.requestFocus();
		}
		else if(sue.trim().equals("")) {
			mensaje("Campo Sueldo es obligatorio, Por favor indique su sueldo");
			txtSueldoContra.requestFocus();
		}
		else if(sue.matches("[1-9]\\d{3}||[9][0]{3}||[1-9]\\d{3}.\\d{1,2}")==false) {
			mensaje("Campo sueldo min:100.00 - hasta 9000 ");
			txtSueldoContra.requestFocus();
		}
		else {
			Contratados bean= new Contratados();
			bean.setDniContratado(dni);
			bean.setNombreContratado(nom);
			bean.setApellidoContratado(ape);
			bean.setDirecContratado(dire);
			bean.setEmailContratado(email);
			bean.setCelContratado(Integer.parseInt(cel));
			bean.setSueldo(Double.parseDouble(cel));
			//
			String sep[]=cboBanco.getSelectedItem().toString().split("-");
			bean.setCodBanco(Integer.parseInt(sep[0]));
			//
			int salida;
			salida= contratadosDAO.save(bean);
			//
			if(salida>0) {
				mensaje("Contratado correctamente");
				listado();
			}
			else 
				mensaje("Error en la contratación");
		}
	}
	protected void actionPerformedBtnModificar(ActionEvent e) {
		String cod,dni,nom,ape,dire,email,cel,sue;
		cod=txtcodContratado.getText();
		dni=txtDNIcontra.getText();
		nom=txtNomcontra.getText();
		ape=txtApecontra.getText();
		dire=txtDirecontra.getText();
		email=txtEmacontra.getText();
		cel=txtCelcontra.getText();
		sue=txtSueldoContra.getText();
		//validando
				if(dni.trim().equals("")) {
					mensaje("Campo DNI es obligatorio");
					txtDNIcontra.requestFocus();
				}
				if(dni.matches("\\d{8}")==false) {
					mensaje("Campo DNI 8 cifras");
					txtDNIcontra.requestFocus();
				}
				else if(nom.trim().equals("")) {
					mensaje("Campo Nombre es obligatorio");
					txtNomcontra.requestFocus();
				}
				else if(nom.matches("[a-zA-Z\\s\\ñ\\Ñ\\á\\é\\í\\ó\\ú\\Á\\É\\Í\\Ó\\Ú\\Ü]{3,30}")==false) {
					mensaje("Campo Nombre solo letras");
					txtNomcontra.requestFocus();
				}
				else if(ape.trim().equals("")) {
					mensaje("Campo Apellido es obligatorio");
					txtApecontra.requestFocus();
				}
				else if(ape.matches("[a-zA-Z\\s\\ñ\\Ñ\\á\\é\\í\\ó\\ú\\Á\\É\\Í\\Ó\\Ú\\Ü]{3,30}")==false) {
					mensaje("Campo Apellidos solo letras");
					txtApecontra.requestFocus();
				}
				else if(cel.matches("\\d{9}")==false) {
					mensaje("Telefono 9 cifras");
					txtCelcontra.requestFocus();
				}
				else if(sue.trim().equals("")) {
					mensaje("Campo Sueldo es obligatorio, Por favor indique su sueldo");
					txtSueldoContra.requestFocus();
				}
				else if(sue.matches("[1-9]\\d{3}||[9][0]{3}||[1-9]\\d{3}.\\d{1,2}")==false) {
					mensaje("Campo sueldo min:100.00 - hasta 9000 ");
					txtSueldoContra.requestFocus();
				}
				else {
					Contratados bean=new Contratados();
					bean.setCodContratado(Integer.parseInt(cod));
					bean.setDniContratado(dni);
					bean.setNombreContratado(nom);
					bean.setApellidoContratado(ape);
					bean.setDirecContratado(dire);
					bean.setEmailContratado(email);
					bean.setCelContratado(Integer.parseInt(cel));
					bean.setSueldo(Double.parseDouble(sue));
					//
					String ser[]=cboBanco.getSelectedItem().toString().split("-");
					bean.setCodBanco(Integer.parseInt(ser[0]));
					//
					int salida;
					salida=contratadosDAO.update(bean);
					//
					if(salida>0) {
						mensaje("Actualizado correctamente");
						listado();
					}
				}
	}
	protected void actionPerformedBtnEliminar(ActionEvent e) {
		int cod,boton,salida;
		boton=JOptionPane.showConfirmDialog(this, "Seguro de eliminar","Sistema",JOptionPane.YES_OPTION);
		if(boton==0) {
			cod=Integer.parseInt(txtcodContratado.getText());
			salida=contratadosDAO.delete(cod);
			if(salida>0) {
				mensaje("Eliminado correctamente");
				listado();
				//action del nuevo
			}
			else
				mensaje("Error en la eliminación");
		}
	}
	void listado() {
		DefaultTableModel modeloContratado =(DefaultTableModel) tblContratados.getModel();
		modeloContratado.setRowCount(0);
		List<Contratados> lista=contratadosDAO.ListAll();
		for(Contratados c:lista) {
			Object row[]= {c.getCodContratado(),c.getDniContratado(),c.getNombreContratado(),c.getApellidoContratado(),c.getDirecContratado(),c.getEmailContratado(),c.getCelContratado(),c.getNomBanco(),c.getSueldo()};
			modeloContratado.addRow(row);
		}		
	}
	void mensaje(String m) {
		JOptionPane.showMessageDialog(this, m);
	}
	
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == tblContratados) {
			mouseClickedTblContratados(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedTblContratados(MouseEvent e) {
		int pos;
		String cod,dni,nom,ape,dire,email,cel,sue,ban;
		pos=tblContratados.getSelectedRow();
		cod=tblContratados.getValueAt(pos, 0).toString();
		dni=tblContratados.getValueAt(pos, 1).toString();
		nom=tblContratados.getValueAt(pos, 2).toString();
		ape=tblContratados.getValueAt(pos, 3).toString();
		dire=tblContratados.getValueAt(pos, 4).toString();
		email=tblContratados.getValueAt(pos, 5).toString();
		cel=tblContratados.getValueAt(pos, 6).toString();
		sue=tblContratados.getValueAt(pos, 8).toString();
		ban=tblContratados.getValueAt(pos, 7).toString();
		txtcodContratado.setText(cod);
		txtDNIcontra.setText(dni);
		txtNomcontra.setText(nom);
		txtApecontra.setText(ape);
		txtDirecontra.setText(dire);
		txtEmacontra.setText(email);
		txtCelcontra.setText(cel);
		txtSueldoContra.setText(sue);
		cboBanco.setSelectedItem(ban);
	}
}
