package Act2;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class PeliculasVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPelicula;
	private Peliculas Peliculas = new Peliculas();


	/**
	 * Create the frame.
	 */
	public PeliculasVentana() 
	{
		
		
		setTitle("Peliculas");
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 182);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escribe el titulo de una pelicula");
		lblNewLabel.setBounds(30, 23, 186, 14);
		contentPane.add(lblNewLabel);
		
		textPelicula = new JTextField();
		textPelicula.setBounds(30, 48, 248, 20);
		contentPane.add(textPelicula);
		textPelicula.setColumns(10);
		
		JButton btnAñadir = new JButton("Añadir");
		btnAñadir.setBounds(73, 79, 89, 23);
		contentPane.add(btnAñadir);
				
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setBounds(463, 23, 69, 14);
		contentPane.add(lblPeliculas);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(421, 47, 216, 22);
		contentPane.add(comboBox);
		
		
		
		
		btnAñadir.addActionListener(new ActionListener() 
		{
		
			public void actionPerformed(ActionEvent e) 
			{
				if (!textPelicula.getText().isEmpty()) 
				{
					
					Peliculas.insertaPelicula(textPelicula.getText());
					
					comboBox.setModel(new DefaultComboBoxModel<String>(Peliculas.getPeliculas().toArray(new String[0])));
					
					comboBox.setSelectedItem(textPelicula.getText());
					
				} else 
				{
					
					JOptionPane.showMessageDialog(null, "Debes poner una película en el recuadro");
					
				}
			}
		});
		
		
		
		
	
	}
}
