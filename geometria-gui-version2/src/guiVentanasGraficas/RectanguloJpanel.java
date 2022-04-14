package guiVentanasGraficas;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Rectangulo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class RectanguloJpanel extends JPanel {
	private JTextField textFieldBase;
	private JTextField textFieldAltura;

	/**
	 * Create the panel.
	 */
	public RectanguloJpanel() {
		setBackground(Color.CYAN);
		setLayout(null);
		//esto se debe correr hacia arriba para que no provoque errores
		JLabel lblResultado = new JLabel("");
		lblResultado.setForeground(Color.BLUE);
		lblResultado.setBounds(55, 174, 188, 14);
		add(lblResultado);
		
		JButton btnCalcularArea = new JButton("CalcularArea");
		btnCalcularArea.setForeground(Color.RED);
		btnCalcularArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1.recuperar la base y la altura desde los jtexfield
				//2.convertir base y altura a double
				double base = Double.parseDouble(textFieldBase.getText());//con el metodo getText nos devuelve un String lo que ingreso el usuario
				double altura = Double.parseDouble(textFieldAltura.getText());
				
				//3.generar instancia de rectanguo y calcular
				Rectangulo rectangulo = new Rectangulo(base, altura);
				double area = rectangulo.calcularArea();
				//4. Mostrar en Pantalla
				lblResultado.setText(String.format("El Area es %.2f.", area));
			}
		});
		btnCalcularArea.setBounds(54, 214, 144, 23);
		add(btnCalcularArea);
		
		JButton btnCalcularPerimetro = new JButton("CalcularPerimetro");
		btnCalcularPerimetro.setForeground(Color.RED);
		btnCalcularPerimetro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1.recuperar la base y la altura desde los jtexfield
				//2.convertir base y altura a double
				double base = Double.parseDouble(textFieldBase.getText());//con el metodo getText nos devuelve un String lo que ingreso el usuario
				double altura = Double.parseDouble(textFieldAltura.getText());
				
				//3.generar instancia de rectanguo y calcular
				Rectangulo rectangulo = new Rectangulo(base, altura);
				double area = rectangulo.calcularPerimetro();
				//4. Mostrar en Pantalla
				lblResultado.setText(String.format("El Perimetro es %.2f.", area));
			}
		});
		btnCalcularPerimetro.setBounds(221, 214, 152, 23);
		add(btnCalcularPerimetro);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblBase.setBounds(54, 39, 46, 14);
		add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAltura.setBounds(54, 98, 56, 14);
		add(lblAltura);
		
		textFieldBase = new JTextField();
		textFieldBase.setBounds(143, 36, 86, 20);
		add(textFieldBase);
		textFieldBase.setColumns(10);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setText("");
		textFieldAltura.setBounds(143, 95, 86, 20);
		add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		

	}

}
