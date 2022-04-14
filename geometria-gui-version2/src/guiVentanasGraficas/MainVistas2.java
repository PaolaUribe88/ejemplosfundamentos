package guiVentanasGraficas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.Toolkit;
import java.awt.Color;

public class MainVistas2 extends JFrame {

	private JPanel contentPane;
	private AbstractButton menuItemSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainVistas2 frame = new MainVistas2();
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
	public MainVistas2() {
		setForeground(Color.CYAN);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Paola\\Downloads\\doc\\bb.jpeg"));
		setFont(new Font("Old English Text MT", Font.BOLD, 12));
		setTitle("AppGeometr\u00EDa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 366);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArchivo = new JMenu("Archivo");
		menuArchivo.setForeground(Color.RED);
		menuArchivo.setFont(new Font("Californian FB", Font.BOLD, 12));
		menuBar.add(menuArchivo);
		
		
		JMenuItem menuItemSalir = new JMenuItem("SALIR");
		menuItemSalir.setForeground(Color.MAGENTA);
		menuItemSalir.setFont(new Font("Times New Roman", Font.BOLD, 12));
		menuArchivo.add(menuItemSalir);
		menuItemSalir.addActionListener(evento -> System.exit(0));
		
		JMenu menuCalculos = new JMenu("Calculos");
		menuCalculos.setForeground(Color.RED);
		menuCalculos.setFont(new Font("Californian FB", Font.BOLD, 12));
		menuBar.add(menuCalculos);
		
		JMenuItem menuItemRectangulo = new JMenuItem("Rectangulo");
		menuItemRectangulo.setForeground(Color.MAGENTA);
		menuItemRectangulo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		menuCalculos.add(menuItemRectangulo);
		menuItemRectangulo.addActionListener(new ActionListener() {
			
			@Override//implementamos la accion de ActionListener
			public void actionPerformed(ActionEvent e) {
				contentPane = new RectanguloJpanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				contentPane.setLayout(new BorderLayout(0, 0));
				setContentPane(contentPane);
				contentPane.updateUI();//REFRESCA LA VENTANA
				
			}
		} );
		
		JMenuItem menuItemCirculo = new JMenuItem("Circulo");
		menuItemCirculo.setForeground(Color.MAGENTA);
		menuItemCirculo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		menuCalculos.add(menuItemCirculo);
		//LAMBDA
		menuItemCirculo.addActionListener(evento ->{
			contentPane = new CirculoJPanel();
			setContentPane(contentPane);
			contentPane.updateUI();
			});
		
				
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
