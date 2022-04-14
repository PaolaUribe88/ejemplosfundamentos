package guivistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Rectangulo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MainGuiVistas extends JFrame {

	private JPanel contentPane;//agrego atributos
	private JTextField textFieldBase;
	private JTextField textFieldAltura;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGuiVistas frame = new MainGuiVistas();
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
	public MainGuiVistas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBase = new JLabel("Base");//label a nivel del constructor
		lblBase.setBounds(32, 35, 62, 14);
		contentPane.add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(32, 126, 46, 14);
		contentPane.add(lblAltura);
		
		textFieldBase = new JTextField();
		textFieldBase.setToolTipText("La base del rectangulo");
		textFieldBase.setBounds(74, 32, 86, 20);
		contentPane.add(textFieldBase);
		textFieldBase.setColumns(10);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setToolTipText("La altura del Rectangulo");
		textFieldAltura.setBounds(74, 123, 86, 20);
		contentPane.add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		JButton btnCalculoArea = new JButton("CalcularArea");
		btnCalculoArea.setBounds(32, 214, 128, 23);
		contentPane.add(btnCalculoArea);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(32, 189, 201, 14);
		contentPane.add(lblResultado);
		
		JButton btnCalcularPerimetro = new JButton("CalcularPerimetro");
		btnCalcularPerimetro.setBounds(221, 214, 145, 23);
		contentPane.add(btnCalcularPerimetro);
		//seteamos un evento
		btnCalculoArea.addActionListener(evento ->{
			//1.recuperar la base y la altura desde los jtexfield
			//2.convertir base y altura a double
			double base = Double.parseDouble(textFieldBase.getText());//con el metodo getText nos devuelve un String lo que ingreso el usuario
			double altura = Double.parseDouble(textFieldAltura.getText());
			
			//3.generar instancia de rectanguo y calcular
			Rectangulo rectangulo = new Rectangulo(base, altura);
			double area = rectangulo.calcularArea();
			//4. Mostrar en Pantalla
			lblResultado.setText(String.format("El Area es %.2f.", area));
		});
		btnCalcularPerimetro.addActionListener(evento ->{
			//1.recuperar la base y la altura desde los jtexfield
			//2.convertir base y altura a double
			double base = Double.parseDouble(textFieldBase.getText());//con el metodo getText nos devuelve un String lo que ingreso el usuario
			double altura = Double.parseDouble(textFieldAltura.getText());
			
			//3.generar instancia de rectanguo y calcular
			Rectangulo rectangulo = new Rectangulo(base, altura);
			double area = rectangulo.calcularPerimetro();
			//4. Mostrar en Pantalla
			lblResultado.setText(String.format("El Perimetro es %.2f.", area));
			
		});
		
		
	
	}
}
