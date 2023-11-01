package Act1;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SaludadorVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texto;
	private Saludador hola = new Saludador();

	/**
	 * Create the frame.
	 */
	public SaludadorVentana() {
		
		
		setTitle("SaludadorAPP");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel Label = new JLabel("Escribe un nombre para saludar");
		Label.setBounds(121, 48, 186, 14);
		contentPane.add(Label);
		
		texto = new JTextField();
		texto.setBounds(138, 119, 156, 20);
		contentPane.add(texto);
		texto.setColumns(10);
		
		JButton btnsaludar = new JButton("¡Saludar!");
		btnsaludar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (!texto.getText().isEmpty()) 
				{
					JOptionPane.showMessageDialog(null, hola.saludar(texto.getText()));
					} else 
					{
						JOptionPane.showMessageDialog(null, "Escribe un nombre en el recuadro");
					}
			}
		});
		btnsaludar.setBounds(169, 174, 89, 23);
		contentPane.add(btnsaludar);
	}
}
