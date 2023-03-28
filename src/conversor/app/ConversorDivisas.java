package conversor.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class ConversorDivisas extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorDivisas frame = new ConversorDivisas();
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
	public ConversorDivisas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setForeground(SystemColor.desktop);
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Conversor de Divisas");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JButton btnRegresar = new JButton("<<<<");
		btnRegresar.setBackground(new Color(192, 192, 192));
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Index index = new Index();
				index.setVisible(true);
				
				dispose();
			}
		});
		btnRegresar.setBounds(10, 11, 96, 23);
		panel_1.add(btnRegresar);

		JLabel lblNewLabel_1 = new JLabel("Ingrese la cantidad que desea convertir");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(83, 45, 283, 25);
		panel_1.add(lblNewLabel_1);

		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtCantidad.setBounds(103, 81, 204, 31);
		panel_1.add(txtCantidad);
		txtCantidad.setColumns(10);
		String[] listDivisas = { "Pesos Mexicanos", "Dolar", "Yen Japones", "Euros", "Won sul-coreano" };

		final JComboBox sectionOne = new JComboBox(listDivisas);
		sectionOne.setBackground(new Color(192, 192, 192));
		sectionOne.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		sectionOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		sectionOne.setBounds(103, 117, 204, 31);
		panel_1.add(sectionOne);

		final JComboBox sectionTwo = new JComboBox(listDivisas);
		sectionTwo.setBackground(new Color(192, 192, 192));
		sectionTwo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		sectionTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sectionTwo.setBounds(103, 152, 204, 31);
		panel_1.add(sectionTwo);

		final JLabel lblResultado = new JLabel();
		lblResultado.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblResultado.setBounds(103, 233, 294, 40);
		panel_1.add(lblResultado);

		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setBackground(new Color(192, 192, 192));
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DivisasFunction funtionDivisas = new DivisasFunction();

				if (!txtCantidad.getText().matches("[a-zA-Z_]+")) {
					if (txtCantidad.getText().isEmpty()) {
						lblResultado.setText("Debes ingresar una cantidad!!");
						lblResultado.setForeground(Color.RED);
					} else {
						double cantidad = Double.parseDouble(txtCantidad.getText());
						funtionDivisas.divisas(cantidad, sectionOne.getSelectedItem().toString(),
								sectionTwo.getSelectedItem().toString());
						String res = Double.toString(funtionDivisas.resultado);
						lblResultado.setText(res);
					}
				} else {
					lblResultado.setText("Solo acepta numeros!!");
					lblResultado.setForeground(Color.RED);
				}

			}
		});
		btnConvertir.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnConvertir.setBounds(128, 194, 153, 23);
		panel_1.add(btnConvertir);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(308, 277, 89, 23);
		panel_1.add(btnNewButton);
	}
}
