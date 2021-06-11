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
		panelLateral.setBounds(0, 0, 219, 639);
		contentPane.add(panelLateral);
		panelLateral.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/dashboardLogo1.png")));
		lblNewLabel.setBounds(0, 0, 219, 81);
		panelLateral.add(lblNewLabel);
		
		btnMantenimiento = new JButton("    Mantenimiento ");
		btnMantenimiento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMantenimiento.setBackground(new Color (36, 46, 66));
				btnMantenimiento.setForeground(Color.gray);
				btnMantenimiento.setIcon(new ImageIcon("D:\\Steff\\Proyectos\\ManagementSystemLicenses-master\\src\\img\\registration.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnMantenimiento.setForeground(Color.white);
				btnMantenimiento.setIcon(new ImageIcon("D:\\Steff\\Proyectos\\ManagementSystemLicenses-master\\src\\img\\registration.png"));
			}
		});
		btnMantenimiento.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/registration.png")));
		btnMantenimiento.setForeground(Color.WHITE);
		btnMantenimiento.setBackground(new Color(36, 46, 66) );

		btnMantenimiento.setHorizontalAlignment(SwingConstants.LEFT);
		btnMantenimiento.setFocusPainted(false);
		btnMantenimiento.setBorderPainted(false);
		btnMantenimiento.setBounds(0, 135, 188, 37);
		panelLateral.add(btnMantenimiento);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		desktopPane.setBounds(218, 0, 956, 639);
		desktopPane.setBackground(new Color(249, 251, 252));
		contentPane.add(desktopPane);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setIcon(new ImageIcon(frmBienvenido.class.getResource("/img/menu (1).png")));
		lblNewLabel_1.setBounds(10, 11, 32, 29);
		desktopPane.add(lblNewLabel_1);
	}
}
