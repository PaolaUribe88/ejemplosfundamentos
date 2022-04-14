package guiVentanasGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Circulo;
import modelo.Rectangulo;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class CirculoJPanel extends JPanel {
	private JTextField textFieldDiametro;

	/**
	 * Create the panel.
	 */
	public CirculoJPanel() {
		setBackground(Color.CYAN);
		setLayout(null);
		
		JLabel lblDiametro = new JLabel("Diametro");
		lblDiametro.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDiametro.setBounds(38, 23, 62, 38);
		add(lblDiametro);
		
		textFieldDiametro = new JTextField();
		textFieldDiametro.setToolTipText("El Diametro es");
		textFieldDiametro.setBounds(122, 32, 213, 20);
		add(textFieldDiametro);
		textFieldDiametro.setColumns(10);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setForeground(Color.BLUE);
		lblResultado.setBounds(38, 180, 240, 14);
		add(lblResultado);
		
		JButton btnCalcularArea = new JButton("CalcularArea");
		btnCalcularArea.setForeground(Color.RED);
		btnCalcularArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1.recuperar la base y la altura desde los jtexfield
				//2.convertir base y altura a double
				double diametro = Double.parseDouble(textFieldDiametro.getText());//con el metodo getText nos devuelve un String lo que ingreso el usuario
							
				//3.generar instancia de rectanguo y calcular
				double area = (new Circulo(diametro)).calcularAreaC();
				//4. Mostrar en Pantalla
				lblResultado.setText(String.format("El Area es %.2f.", area));
			}
		});
		btnCalcularArea.setBounds(38, 205, 148, 23);
		add(btnCalcularArea);
		
		JButton btnCalcularPerimetro = new JButton("CalcularPerimetro");
		btnCalcularPerimetro.setForeground(Color.RED);
		btnCalcularPerimetro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					//1.recuperar la base y la altura desde los jtexfield
					//2.convertir base y altura a double
					double diametro = Double.parseDouble(textFieldDiametro.getText());//con el metodo getText nos devuelve un String lo que ingreso el usuario						
					//3.generar instancia de rectanguo y calcular
					double perimetro = (new Circulo(diametro)).calcularPerimetro();
					//4. Mostrar en Pantalla
					lblResultado.setText(String.format("El Perimetro es %.2f.", perimetro));
			}
			
		});
		btnCalcularPerimetro.setBounds(237, 205, 153, 23);
		add(btnCalcularPerimetro);
		
	

	}

}
