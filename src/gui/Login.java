package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

<<<<<<< HEAD
import bean.Usuario;
import mantenimiento.GestionUsuario;
=======

>>>>>>> 9a148b9599dc0d0870a3eca9c94caa26aea6289e

import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Button;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContraseña;
	
	int xx,xy;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/img/9ea98f4bcb9bcc6cf6e223478c08f2ca98129d0f.ico")));
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(13, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, -12, 434, 285);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_3.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 18));
		lblNewLabel_3.setBounds(295, 11, 12, 27);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBackground(Color.RED);
		
		JLabel lblNewLabel_2 = new JLabel("");
	
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				xx = e.getX();
				
				xy = e.getY();
				
			}
		});
		lblNewLabel_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				Login.this.setLocation(x-xx, y-xy);
			}
		});

		lblNewLabel_2.setBounds(-55, 11, 420, 275);
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/img/bg.jpg.png")));
		panel.add(lblNewLabel_2);
		
		Button btnIngresar = new Button("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
				ingresar();
			}
		});


		btnIngresar.setForeground(Color.WHITE);
		btnIngresar.setBackground(new Color(241,57,83) );
		btnIngresar.setBounds(10, 437, 298, 30);
=======
				char [] clave = txtContraseña.getPassword();
				String claveFinal = new String(clave);
				
				if(txtUsuario.getText().equals("admin")& claveFinal.equals("admin") ) {
					dispose();
					JOptionPane.showMessageDialog(null, "Bienvenido", "Listo", JOptionPane.INFORMATION_MESSAGE);
					frmBienvenido frmBienvenido = new frmBienvenido();
					frmBienvenido.setVisible(true);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Error, Usuario o Contraseña Incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnIngresar.setForeground(Color.WHITE);
		btnIngresar.setBackground(new Color(241,57,83) );
		btnIngresar.setBounds(10, 440, 288, 30);
>>>>>>> 9a148b9599dc0d0870a3eca9c94caa26aea6289e
		contentPane.add(btnIngresar);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(43, 322, 212, 30);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel.setBounds(46, 297, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(43, 363, 101, 14);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.GRAY);
		separator.setBounds(257, 284, -211, 14);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(270, 373, -245, -7);
		contentPane.add(separator_1);
		
		txtContraseña = new JPasswordField();
		txtContraseña.setBounds(43, 388, 212, 30);
		contentPane.add(txtContraseña);
	}

<<<<<<< HEAD
	protected void ingresar() {
		String usuario = txtUsuario.getText();
		String clave = String.valueOf(txtContraseña.getPassword());
		
		GestionUsuario gestionUsuario = new GestionUsuario();
		
		
		Usuario usuario2 = new Usuario();
		usuario2.setUsuario(usuario);
		usuario2.setClave(clave);
		
		Usuario usu = gestionUsuario.obtenerUsuario(usuario2);
		
		if (usu!= null) {
			JOptionPane.showMessageDialog(contentPane, "Bienvenido");
			
			this.dispose();
			frmBienvenido bienvenido = new frmBienvenido();
			bienvenido.setVisible(true);
			
		}
		else {
			JOptionPane.showMessageDialog(contentPane, "Datos no coinciden", "Error",JOptionPane.ERROR_MESSAGE);
		}
		
	}

=======
>>>>>>> 9a148b9599dc0d0870a3eca9c94caa26aea6289e
	
}