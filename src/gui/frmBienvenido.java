package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;

public class frmBienvenido extends JFrame {
	
	MantenimientoParticipante fpar;
	ConsultaParticipante conpar;
	
	MantenimientoPropuestas fpro;
	ConsultaPropuesta conpro;
	
	MantenimientoEvaluador feva;
	ConsultaEvaluador coneva;
	
	MantenimientoContratados fcon;
	ConsultaContratados concont;
	
	private JPanel contentPane;
	private JButton btnMantenimiento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmBienvenido frame = new frmBienvenido();
					frame.setUndecorated(true);
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
	public frmBienvenido() {
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1180, 664);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(249, 251, 252));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		desktopPane.setBounds(211, 47, 963, 592);
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/dash.png")));
		lblNewLabel.setBounds(10, 23, 940, 540);
		desktopPane.add(lblNewLabel);
		

		
		JPanel panelLateral = new JPanel();
		panelLateral.setBackground(new Color(36, 46, 66) );
		panelLateral.setBounds(0, 0, 212, 639);
		contentPane.add(panelLateral);
		panelLateral.setLayout(null);
		JPanel panelMantenimiento = new JPanel();
		panelMantenimiento.setVisible(false);
		panelMantenimiento.setBackground(new Color(209, 8, 50));
		panelMantenimiento.setBounds(187, 186, 7, 32);
		panelLateral.add(panelMantenimiento);
		
		JPanel panelConsulta = new JPanel();
		panelConsulta.setVisible(false);
		panelConsulta.setBackground(new Color(209, 8, 50));
		panelConsulta.setBounds(187, 222, 7, 32);
		panelLateral.add(panelConsulta);
		
		JButton btnManContratados = new JButton("    Contratados ");
		btnManContratados.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(fcon == null || fcon.isClosed()) {
					fcon = new MantenimientoContratados();
					fcon.setBounds(0,0,957,627);
					desktopPane.add(fcon);
					fcon.show();
				}
				else {
					fpar.setVisible(false);
					fpro.setVisible(false);
					feva.setVisible(false);
					fcon.setVisible(true);
					conpar.setVisible(false);
					conpro.setVisible(false);
					coneva.setVisible(false);
					concont.setVisible(false);
					
				}
			}
		});
		btnManContratados.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnManContratados.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/team.png")));
		btnManContratados.setVisible(false);
		btnManContratados.setHorizontalAlignment(SwingConstants.LEFT);
		btnManContratados.setForeground(Color.WHITE);
		btnManContratados.setFocusPainted(false);
		btnManContratados.setBorderPainted(false);
		btnManContratados.setBackground(new Color(36, 46, 66));
		btnManContratados.setBounds(24, 332, 158, 37);
		panelLateral.add(btnManContratados);
		
		JButton btnConContratados = new JButton("    Contratados");
		btnConContratados.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(concont == null || concont.isClosed()) {
					concont = new ConsultaContratados();
					concont.setBounds(0,0,957,627);
					desktopPane.add(concont);
					concont.show();
				}
				else {
					fpar.setVisible(false);
					fpro.setVisible(false);
					feva.setVisible(false);
					fcon.setVisible(false);
					conpar.setVisible(false);
					conpro.setVisible(false);
					coneva.setVisible(false);
					concont.setVisible(true);
					
				}
			}
		});
		btnConContratados.setVisible(false);
		btnConContratados.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnConContratados.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/team.png")));
		btnConContratados.setHorizontalAlignment(SwingConstants.LEFT);
		btnConContratados.setForeground(Color.WHITE);
		btnConContratados.setFocusPainted(false);
		btnConContratados.setBorderPainted(false);
		btnConContratados.setBackground(new Color(36, 46, 66));
		btnConContratados.setBounds(24, 362, 165, 37);
		panelLateral.add(btnConContratados);


		
		JPanel panelReporte = new JPanel();
		panelReporte.setVisible(false);
		panelReporte.setBackground(new Color(209, 8, 50));
		panelReporte.setBounds(187, 260, 7, 32);
		panelLateral.add(panelReporte);
		JButton btnManParticipante = new JButton("  Participante ");
		btnManParticipante.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnManParticipante.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(fpar == null || fpar.isClosed()) {
					fpar = new MantenimientoParticipante();
					fpar.setBounds(0,0,957,627);
					desktopPane.add(fpar);
					fpar.show();
				}
				else {
					fpar.setVisible(true);
					fpro.setVisible(false);
					feva.setVisible(false);
					fcon.setVisible(false);
					conpar.setVisible(false);
					conpro.setVisible(false);
					coneva.setVisible(false);
					concont.setVisible(false);
					
				}
			}
		});
		btnManParticipante.setVisible(false);
		btnManParticipante.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/profile.png")));
		btnManParticipante.setHorizontalAlignment(SwingConstants.LEFT);
		btnManParticipante.setForeground(Color.WHITE);
		btnManParticipante.setFocusPainted(false);
		btnManParticipante.setBorderPainted(false);
		btnManParticipante.setBackground(new Color(36, 46, 66));
		btnManParticipante.setBounds(24, 222, 142, 37);
		panelLateral.add(btnManParticipante);
		
		JButton btnManPropuesta = new JButton("   Propuestas");
		btnManPropuesta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(fpro == null || fpar.isClosed()) {
					fpro = new MantenimientoPropuestas();
					fpro.setBounds(0,0,957,627);
					desktopPane.add(fpro);
					fpro.show();
				}
				else {
					fpro.setVisible(true);
					fpar.setVisible(false);
					feva.setVisible(false);
					fcon.setVisible(false);
					conpar.setVisible(false);
					conpro.setVisible(false);
					coneva.setVisible(false);
					concont.setVisible(false);
				}
			}
		});
		btnManPropuesta.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnManPropuesta.setVisible(false);
		btnManPropuesta.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/google-docs.png")));
		btnManPropuesta.setHorizontalAlignment(SwingConstants.LEFT);
		btnManPropuesta.setForeground(Color.WHITE);
		btnManPropuesta.setFocusPainted(false);
		btnManPropuesta.setBorderPainted(false);
		btnManPropuesta.setBackground(new Color(36, 46, 66));
		btnManPropuesta.setBounds(24, 258, 142, 37);
		panelLateral.add(btnManPropuesta);
		
		JButton btnManEvaluador = new JButton("   Evaluador");
		btnManEvaluador.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(feva == null || feva.isClosed()) {
					feva = new MantenimientoEvaluador();
					feva.setBounds(0,0,957,627);
					desktopPane.add(feva);
					feva.show();
				}
				else {
					feva.setVisible(true);
					fpro.setVisible(false);
					fpar.setVisible(false);
					fcon.setVisible(false);
					conpar.setVisible(false);
					conpro.setVisible(false);
					coneva.setVisible(false);
					concont.setVisible(false);
				}
			}
		});
		btnManEvaluador.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnManEvaluador.setVisible(false);
		btnManEvaluador.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/best-employee.png")));
		btnManEvaluador.setHorizontalAlignment(SwingConstants.LEFT);
		btnManEvaluador.setForeground(Color.WHITE);
		btnManEvaluador.setFocusPainted(false);
		btnManEvaluador.setBorderPainted(false);
		btnManEvaluador.setBackground(new Color(36, 46, 66));
		btnManEvaluador.setBounds(24, 292, 142, 37);
		panelLateral.add(btnManEvaluador);
		
		JButton btnConParticipante = new JButton("    Participante");
		btnConParticipante.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(conpar == null || conpar.isClosed()) {
					conpar = new ConsultaParticipante();
					conpar.setBounds(0,0,957,627);
					desktopPane.add(conpar);
					conpar.show();
				}
				else {
					conpar.setVisible(true);
					conpro.setVisible(false);
					coneva.setVisible(false);
					concont.setVisible(false);
					fcon.setVisible(false);
					fpar.setVisible(false);
					fpro.setVisible(false);
					feva.setVisible(false);
				}
			}
		});
		btnConParticipante.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnConParticipante.setVisible(false);
		btnConParticipante.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/headhunting.png")));
		btnConParticipante.setHorizontalAlignment(SwingConstants.LEFT);
		btnConParticipante.setForeground(Color.WHITE);
		btnConParticipante.setFocusPainted(false);
		btnConParticipante.setBorderPainted(false);
		btnConParticipante.setBackground(new Color(36, 46, 66));
		btnConParticipante.setBounds(24, 260, 158, 37);
		panelLateral.add(btnConParticipante);
		
		JButton btnConPropuestas = new JButton("    Propuesta");
		btnConPropuestas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(conpro == null || conpro.isClosed()) {
					conpro = new ConsultaPropuesta();
					conpro.setBounds(0,0,957,627);
					desktopPane.add(conpro);
					conpro.show();
				}
				else {
					conpar.setVisible(false);
					conpro.setVisible(true);
					concont.setVisible(false);
					coneva.setVisible(false);
					fpar.setVisible(false);
					fcon.setVisible(false);
					fpro.setVisible(false);
					feva.setVisible(false);
				}
			}
		});
		btnConPropuestas.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnConPropuestas.setVisible(false);
		btnConPropuestas.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/open-book.png")));
		btnConPropuestas.setHorizontalAlignment(SwingConstants.LEFT);
		btnConPropuestas.setForeground(Color.WHITE);
		btnConPropuestas.setFocusPainted(false);
		btnConPropuestas.setBorderPainted(false);
		btnConPropuestas.setBackground(new Color(36, 46, 66));
		btnConPropuestas.setBounds(24, 296, 165, 37);
		panelLateral.add(btnConPropuestas);
		
		
		JButton btnConEvaluador = new JButton("    Evaluador");
		btnConEvaluador.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(coneva == null || conpar.isClosed()) {
					coneva = new ConsultaEvaluador();
					coneva.setBounds(0,0,957,627);
					desktopPane.add(coneva);
					coneva.show();
				}
				else {
					conpar.setVisible(false);
					conpro.setVisible(false);
					coneva.setVisible(true);
					concont.setVisible(false);
					fcon.setVisible(false);
					fpar.setVisible(false);
					fpro.setVisible(false);
					feva.setVisible(false);
				}
			}
		});
		btnConEvaluador.setVisible(false);
		btnConEvaluador.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/headhunter.png")));
		btnConEvaluador.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnConEvaluador.setHorizontalAlignment(SwingConstants.LEFT);
		btnConEvaluador.setForeground(Color.WHITE);
		btnConEvaluador.setFocusPainted(false);
		btnConEvaluador.setBorderPainted(false);
		btnConEvaluador.setBackground(new Color(36, 46, 66));
		btnConEvaluador.setBounds(24, 332, 158, 37);
		panelLateral.add(btnConEvaluador);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/dashboardLogo1.png")));
		lblLogo.setBounds(0, 11, 212, 81);
		panelLateral.add(lblLogo);
		JPanel panelHome = new JPanel();
		panelHome.setVisible(false);
		panelHome.setBackground(new Color(209, 8, 50));
		panelHome.setBounds(187, 141, 7, 32);
		panelLateral.add(panelHome);
		
		
		JButton btnReporte = new JButton("    Reporte ");
		
		btnReporte.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReporte.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/checklist.png")));
		btnReporte.setHorizontalAlignment(SwingConstants.LEFT);
		btnReporte.setForeground(Color.WHITE);
		btnReporte.setFocusPainted(false);
		btnReporte.setBorderPainted(false);
		btnReporte.setBackground(new Color(36, 46, 66));
		btnReporte.setBounds(0, 261, 158, 37);
		panelLateral.add(btnReporte);
		JButton btnConsulta = new JButton("    Consulta");
		btnConsulta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnConsulta.setBackground(new Color (241,57,83));

				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnConsulta.setBackground(new Color (36, 46, 66));
				btnConsulta.setForeground(Color.white);

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(btnConsulta.isVisible()== true) {
						panelHome.setVisible(false);
						panelMantenimiento.setVisible(false);
						panelConsulta.setVisible(true);
						panelReporte.setVisible(false);
						btnManParticipante.setVisible(false);
						btnManPropuesta.setVisible(false);
						btnManEvaluador.setVisible(false);
						btnManContratados.setVisible(false);
						btnConsulta.setBounds(0,222,177,37);
						btnConContratados.setVisible(true);
						btnConParticipante.setVisible(true);
						btnConPropuestas.setVisible(true);
						btnConEvaluador.setVisible(true);
						btnReporte.setBounds(0,400,177,37);
					}
				}
				catch(Exception ex){
					System.err.print(ex.toString());
					
				}
			}
		});
		btnConsulta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConsulta.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/discovery.png")));
		btnConsulta.setHorizontalAlignment(SwingConstants.LEFT);
		btnConsulta.setForeground(Color.WHITE);
		btnConsulta.setFocusPainted(false);
		btnConsulta.setBorderPainted(false);
		btnConsulta.setBackground(new Color(36, 46, 66));
		btnConsulta.setBounds(0, 222, 177, 37);
		panelLateral.add(btnConsulta);
		btnReporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnReporte.setBackground(new Color (241,57,83));
	
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnReporte.setBackground(new Color (36, 46, 66));
				btnReporte.setForeground(Color.white);

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(btnReporte.isVisible()== true) {
						panelHome.setVisible(false);
						panelMantenimiento.setVisible(false);
						panelConsulta.setVisible(false);
						panelReporte.setVisible(true);
						btnManParticipante.setVisible(false);
						btnManPropuesta.setVisible(false);
						btnManContratados.setVisible(false);
						btnManEvaluador.setVisible(false);
						btnConEvaluador.setVisible(false);
						btnConContratados.setVisible(false);
						btnConParticipante.setVisible(false);
						btnConPropuestas.setVisible(false);
						btnReporte.setBounds(0,261,158,37);
						btnConsulta.setBounds(0,222,177,37);

					}
				}
				catch(Exception ex){
					System.err.print(ex.toString());
					
				}
			}
		});
		
	
		
		JButton btnHome = new JButton("    Home");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHome.setBackground(new Color (241,57,83));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHome.setBackground(new Color (36, 46, 66));
				btnHome.setForeground(Color.white);
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(btnHome.isVisible()== true) {
						panelHome.setVisible(true);
						panelMantenimiento.setVisible(false);
						panelConsulta.setVisible(false);
						panelReporte.setVisible(false);
						btnManParticipante.setVisible(false);
						btnManPropuesta.setVisible(false);
						btnManContratados.setVisible(false);
						btnManEvaluador.setVisible(false);
						btnConEvaluador.setVisible(false);
						btnConParticipante.setVisible(false);
						btnConContratados.setVisible(false);
						btnConPropuestas.setVisible(false);
						btnConsulta.setBounds(0,222,177,37);
						btnMantenimiento.setBounds(0,183,188,37);
						btnReporte.setBounds(0,261,158,37);
						fpar.setVisible(false);
						fpro.setVisible(false);
						feva.setVisible(false);
						fcon.setVisible(false);
						concont.setVisible(false);
						conpar.setVisible(false);
						conpro.setVisible(false);
						coneva.setVisible(false);
					}
				}
				catch(Exception ex){
					System.err.print(ex.toString());
					
				}
			}
		});
		btnHome.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/inicio.png")));
		btnHome.setHorizontalAlignment(SwingConstants.LEFT);
		btnHome.setForeground(Color.WHITE);
		btnHome.setFocusPainted(false);
		btnHome.setBorderPainted(false);
		btnHome.setBackground(new Color(36, 46, 66));
		btnHome.setBounds(0, 141, 188, 37);
		panelLateral.add(btnHome);
		
		btnMantenimiento = new JButton("    Mantenimiento ");
		btnMantenimiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMantenimiento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMantenimiento.setBackground(new Color (241,57,83));
			
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnMantenimiento.setBackground(new Color (36, 46, 66));
				btnMantenimiento.setForeground(Color.white);

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(btnMantenimiento.isVisible()== true) {
						panelHome.setVisible(false);
						panelMantenimiento.setVisible(true);
						panelConsulta.setVisible(false);
						panelReporte.setVisible(false);
						btnManParticipante.setVisible(true);
						btnManPropuesta.setVisible(true);
						btnManEvaluador.setVisible(true);
						btnManContratados.setVisible(true);
						btnConEvaluador.setVisible(false);
						btnConParticipante.setVisible(false);
						btnConContratados.setVisible(false);
						btnConPropuestas.setVisible(false);
						btnReporte.setBounds(-1,425,177,37);
						btnConsulta.setBounds(0,375,177,37);
					
					}

				}
				catch(Exception ex){
					System.err.print(ex.toString());
					
				}
			}
		});
		btnMantenimiento.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/guide.png")));
		btnMantenimiento.setForeground(Color.WHITE);
		btnMantenimiento.setBackground(new Color(36, 46, 66) );

		btnMantenimiento.setHorizontalAlignment(SwingConstants.LEFT);
		btnMantenimiento.setFocusPainted(false);
		btnMantenimiento.setBorderPainted(false);
		btnMantenimiento.setBounds(0, 183, 188, 37);
		panelLateral.add(btnMantenimiento);
		

		


		
		JLabel lblMenu = new JLabel("");
		lblMenu.setBounds(229, 11, 32, 29);
		contentPane.add(lblMenu);
		lblMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(panelLateral.getBounds().width==219) {
					panelLateral.setBounds(0,0,60,664);
					lblMenu.setBounds(70,11,32,39);
					lblLogo.setVisible(false);
					desktopPane.setBounds(75,47,1200,592);

				}
				else {
					panelLateral.setBounds(0,0,219,663);
					lblMenu.setBounds(229,11,32,39);
					desktopPane.setBounds(218,47,956,592);
					lblLogo.setVisible(true);

				}
			}
		});
		
		lblMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblMenu.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/menu (1).png")));

	}
}