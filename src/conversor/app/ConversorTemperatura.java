package conversor.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversorTemperatura extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorTemperatura frame = new ConversorTemperatura();
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
	public ConversorTemperatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Conversor de Temperatura");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);

		final JLabel lblErrores = new JLabel("");
		lblErrores.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblErrores.setBounds(115, 11, 297, 30);
		panel_1.add(lblErrores);

		JLabel lblNewLabel_2_3 = new JLabel("Cantidad");
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_2_3.setBounds(36, 65, 88, 14);
		panel_1.add(lblNewLabel_2_3);

		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(119, 55, 293, 32);
		panel_1.add(txtCantidad);

		final JLabel lblCelsius = new JLabel("");
		lblCelsius.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCelsius.setBounds(14, 193, 444, 36);
		panel_1.add(lblCelsius);
		this.setLocationRelativeTo(null);
		
		String seleccionTemperaturas[] = { "Grados Celsius a Fahrenheit", "Grados Celsius a Kelvin",
				"Grados Fahrenheit a Celsius", "Kelvin a Grados Celsius", "Kelvin a Grados Fahrenheit",
				"Grados Celsius a Rakine", "Grados Fahrenheit a Kelvin", "Grados Fahrenheit a Rankine" };
		final JComboBox cmbSeleccionTemp = new JComboBox(seleccionTemperaturas);
		cmbSeleccionTemp.setBackground(new Color(192, 192, 192));
		cmbSeleccionTemp.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cmbSeleccionTemp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		cmbSeleccionTemp.setBounds(119, 98, 293, 32);
		panel_1.add(cmbSeleccionTemp);

		final JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setBackground(new Color(192, 192, 192));
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FunctionTemperatura temp = new FunctionTemperatura();

				if (!txtCantidad.getText().matches("[a-zA-Z_]+")) {
					if (txtCantidad.getText().isEmpty()) {
						lblErrores.setText("Es necesario ingresar una cantidad!!");
						lblErrores.setForeground(Color.RED);

					} else {
						double cantidad = Double.parseDouble(txtCantidad.getText());
						String seleccion = (String) cmbSeleccionTemp.getSelectedItem().toString();
						temp.convertirTemperatura(cantidad, seleccion);

						lblCelsius.setText("El resultado es: " + Double.toString(temp.resultado));
					}
				} else {
					lblErrores.setText("Solo acepta numeros!!");
					lblErrores.setForeground(Color.RED);
				}
			}
		});

		btnConvertir.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnConvertir.setBounds(196, 150, 158, 32);
		panel_1.add(btnConvertir);

		JButton btnRegresar = new JButton("<<<<");
		btnRegresar.setBackground(new Color(192, 192, 192));
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Index index = new Index();
				index.setVisible(true);

				dispose();
			}
		});
		btnRegresar.setBounds(10, 18, 65, 23);
		panel_1.add(btnRegresar);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setBackground(new Color(192, 192, 192));
		btnSalir.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(369, 240, 89, 23);
		panel_1.add(btnSalir);

	}
}
