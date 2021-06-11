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

public class frmBienvenido extends JFrame {

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
		
		JPanel panelLateral = new JPanel();
		panelLateral.setBackground(new Color(36, 46, 66) );
		panelLateral.setBounds(0, 0, 212, 639);
		contentPane.add(panelLateral);
		panelLateral.setLayout(null);
		JPanel panelMantenimiento = new JPanel();
		panelMantenimiento.setVisible(false);
		panelMantenimiento.setBackground(new Color(209, 8, 50));
		panelMantenimiento.setBounds(187, 205, 7, 37);
		panelLateral.add(panelMantenimiento);
		
		JPanel panelConsulta = new JPanel();
		panelConsulta.setVisible(false);
		panelConsulta.setBackground(new Color(209, 8, 50));
		panelConsulta.setBounds(187, 265, 7, 37);
		panelLateral.add(panelConsulta);
		
		JPanel panelReporte = new JPanel();
		panelReporte.setVisible(false);
		panelReporte.setBackground(new Color(209, 8, 50));
		panelReporte.setBounds(187, 328, 7, 37);
		panelLateral.add(panelReporte);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		desktopPane.setBounds(211, 47, 963, 592);
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane);
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/dashboardLogo1.png")));
		lblLogo.setBounds(0, 0, 219, 81);
		panelLateral.add(lblLogo);
		JPanel panelHome = new JPanel();
		panelHome.setVisible(false);
		panelHome.setBackground(new Color(209, 8, 50));
		panelHome.setBounds(187, 141, 7, 37);
		panelLateral.add(panelHome);
		btnMantenimiento = new JButton("    Mantenimiento ");
		btnMantenimiento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMantenimiento.setBackground(new Color (241,57,83));
			
				btnMantenimiento.setIcon(new ImageIcon("D:\\Steff\\Proyectos\\ManagementSystemLicenses-master\\src\\img\\guide.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnMantenimiento.setBackground(new Color (36, 46, 66));
				btnMantenimiento.setForeground(Color.white);
				btnMantenimiento.setIcon(new ImageIcon("D:\\Steff\\Proyectos\\ManagementSystemLicenses-master\\src\\img\\guide.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(btnMantenimiento.isVisible()== true) {
						panelHome.setVisible(false);
						panelMantenimiento.setVisible(true);
						panelConsulta.setVisible(false);
						panelReporte.setVisible(false);
						
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
		btnMantenimiento.setBounds(0, 205, 188, 37);
		panelLateral.add(btnMantenimiento);
		
		JButton btnReporte = new JButton("    Reporte ");
		btnReporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnReporte.setBackground(new Color (241,57,83));
				
				btnReporte.setIcon(new ImageIcon("D:\\Steff\\Proyectos\\ManagementSystemLicenses-master\\src\\img\\checklist.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnReporte.setBackground(new Color (36, 46, 66));
				btnReporte.setForeground(Color.white);
				btnReporte.setIcon(new ImageIcon("D:\\Steff\\Proyectos\\ManagementSystemLicenses-master\\src\\img\\checklist.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(btnReporte.isVisible()== true) {
						panelHome.setVisible(false);
						panelMantenimiento.setVisible(false);
						panelConsulta.setVisible(false);
						panelReporte.setVisible(true);
						
					}
				}
				catch(Exception ex){
					System.err.print(ex.toString());
					
				}
			}
		});
		btnReporte.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReporte.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/checklist.png")));
		btnReporte.setHorizontalAlignment(SwingConstants.LEFT);
		btnReporte.setForeground(Color.WHITE);
		btnReporte.setFocusPainted(false);
		btnReporte.setBorderPainted(false);
		btnReporte.setBackground(new Color(36, 46, 66));
		btnReporte.setBounds(0, 328, 188, 37);
		panelLateral.add(btnReporte);
		
		JButton btnConsulta = new JButton("    Consulta");
		btnConsulta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnConsulta.setBackground(new Color (241,57,83));
			
				btnConsulta.setIcon(new ImageIcon("D:\\Steff\\Proyectos\\ManagementSystemLicenses-master\\src\\img\\discovery.png"));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnConsulta.setBackground(new Color (36, 46, 66));
				btnConsulta.setForeground(Color.white);
				btnConsulta.setIcon(new ImageIcon("D:\\Steff\\Proyectos\\ManagementSystemLicenses-master\\src\\img\\discovery.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(btnConsulta.isVisible()== true) {
						panelHome.setVisible(false);
						panelMantenimiento.setVisible(false);
						panelConsulta.setVisible(true);
						panelReporte.setVisible(false);
						
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
		btnConsulta.setBounds(0, 265, 188, 37);
		panelLateral.add(btnConsulta);
		
	
		
		JButton btnHome = new JButton("    Home");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnHome.setBackground(new Color (241,57,83));
				btnHome.setIcon(new ImageIcon("D:\\Steff\\Proyectos\\ManagementSystemLicenses-master\\src\\img\\inicio.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnHome.setBackground(new Color (36, 46, 66));
				btnHome.setForeground(Color.white);
				btnHome.setIcon(new ImageIcon("D:\\Steff\\Proyectos\\ManagementSystemLicenses-master\\src\\img\\inicio.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(btnHome.isVisible()== true) {
						panelHome.setVisible(true);
						panelMantenimiento.setVisible(false);
						panelConsulta.setVisible(false);
						panelReporte.setVisible(false);
						
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
