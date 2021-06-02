package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
<<<<<<< HEAD
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
=======
>>>>>>> 9a148b9599dc0d0870a3eca9c94caa26aea6289e

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
<<<<<<< HEAD
import java.awt.Font;
import java.awt.Color;
=======
>>>>>>> 9a148b9599dc0d0870a3eca9c94caa26aea6289e

public class frmBienvenido extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmBienvenido frame = new frmBienvenido();
<<<<<<< HEAD
					frame.setUndecorated(true);
=======
>>>>>>> 9a148b9599dc0d0870a3eca9c94caa26aea6289e
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
<<<<<<< HEAD
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 490);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
=======
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Terminen la gui porfa, luego lo voy cambiando");
		lblNewLabel.setBounds(112, 105, 272, 55);
		contentPane.add(lblNewLabel);
	}

>>>>>>> 9a148b9599dc0d0870a3eca9c94caa26aea6289e
}
