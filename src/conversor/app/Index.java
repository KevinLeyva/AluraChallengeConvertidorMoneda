package conversor.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.JobAttributes;
import java.awt.Color;
import javax.swing.UIManager;

public class Index extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Index frame = new Index();
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
	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Menu Conversor Alura");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		this.setLocationRelativeTo(null);
		JButton btnDivisas = new JButton("Conversor Divisas");
		btnDivisas.setBackground(new Color(192, 192, 192));
		btnDivisas.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDivisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConversorDivisas divisas = new ConversorDivisas();
				divisas.setVisible(true);
				dispose();
			}
		});
		btnDivisas.setBounds(102, 41, 251, 39);
		panel_1.add(btnDivisas);
		
		JButton btnTemperatura = new JButton("Conversor Temperatura");
		btnTemperatura.setBackground(new Color(192, 192, 192));
		btnTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversorTemperatura temp = new ConversorTemperatura();
				temp.setVisible(true);
				dispose();
			}
		});
		btnTemperatura.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnTemperatura.setBounds(102, 122, 251, 39);
		panel_1.add(btnTemperatura);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane option = new JOptionPane("Deseas salir de programa?", JOptionPane.QUESTION_MESSAGE,
						JOptionPane.YES_NO_OPTION);
				
				int n = JOptionPane.showConfirmDialog(
					    option,
					    "Deseas salir de programa?",
					    "An Inane Question",
					    JOptionPane.YES_NO_OPTION);
				if (n == 0) {
					dispose();
				}
				
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnNewButton_2.setBounds(297, 181, 117, 23);
		panel_1.add(btnNewButton_2);
	}

}
