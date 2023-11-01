package Act3;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSlider;

public class MiniEnquestaVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public MiniEnquestaVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblElijeSO = new JLabel("Elije un sistema operativo");
		lblElijeSO.setBounds(41, 35, 166, 14);
		contentPane.add(lblElijeSO);
		
		JLabel lblElijeUnaEspecialidad = new JLabel("Elije una especialidad");
		lblElijeUnaEspecialidad.setBounds(242, 35, 166, 14);
		contentPane.add(lblElijeUnaEspecialidad);
		
		JLabel lblHorasDedicadasEn = new JLabel("Horas dedicadas en tu ordenador");
		lblHorasDedicadasEn.setBounds(41, 156, 211, 14);
		contentPane.add(lblHorasDedicadasEn);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setSelected(true);
		rdbtnWindows.setBounds(41, 56, 109, 23);
		contentPane.add(rdbtnWindows);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(41, 82, 109, 23);
		contentPane.add(rdbtnLinux);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(41, 108, 109, 23);
		contentPane.add(rdbtnMac);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnWindows);
		grupo.add(rdbtnLinux);
		grupo.add(rdbtnMac);
		
		JCheckBox chckbxProgramacion = new JCheckBox("Programación");
		chckbxProgramacion.setBounds(242, 56, 166, 23);
		contentPane.add(chckbxProgramacion);
		
		JCheckBox chckbxDiseoGrfico = new JCheckBox("Diseño gráfico");
		chckbxDiseoGrfico.setBounds(242, 82, 166, 23);
		contentPane.add(chckbxDiseoGrfico);
		
		JCheckBox chckbxAdministracion = new JCheckBox("Administracion");
		chckbxAdministracion.setBounds(242, 108, 166, 23);
		contentPane.add(chckbxAdministracion);
		
		JSlider slider = new JSlider();
		slider.setBounds(41, 181, 204, 45);
		slider.setMajorTickSpacing(1);
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMaximum(10);
		slider.setValue(5);
		contentPane.add(slider);
		
		JButton btnMostrar = new JButton("Mostrar Datos");
		btnMostrar.setBounds(273, 192, 117, 34);
		contentPane.add(btnMostrar);
		
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sist_op;
				StringBuilder especialidad = new StringBuilder();;
				int horas;
				
				if (rdbtnWindows.isSelected()) {
					sist_op = "Windows";
				} else if (rdbtnLinux.isSelected()) {
					sist_op = "Linux";
				} else {
					sist_op = "Mac";
				}
				
				if (chckbxProgramacion.isSelected()) {
					if (especialidad.length() > 0)
					{
						especialidad.append(", ");
					}
					
					especialidad.append("Programación");
				}
				
				if (chckbxDiseoGrfico.isSelected()) {
					if (especialidad.length() > 0)
					{
						especialidad.append(", ");
					}
					
					especialidad.append("Administración");
				} 
				
				if (chckbxDiseoGrfico.isSelected()) {
					if (especialidad.length() > 0)
					{
						especialidad.append(", ");
					}
					
					especialidad.append("Diseño");
				}
				
				horas = slider.getValue();
				
				if (especialidad.length() > 0)
				{
					JOptionPane.showMessageDialog(null, "El sistema operativo es: " + sist_op 
							+ "\nLa especialidad es: " + especialidad.toString() + "\nHoras dedicadas: " + horas);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "El sistema operativo es: " + sist_op 
							+ "\nNo se ha especificado especialidad" + "\nHoras dedicadas: " + horas);
				}
				
			}
				
		});
		
	}
}
