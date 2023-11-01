package Act4;


import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CalculadoraVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
    private double firstNumber;
    private String operator;


	/**
	 * Create the frame.
	 */
	public CalculadoraVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 286, 319);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField(25);
		textField.setBounds(10, 11, 250, 51);
	    textField.setFont(new Font("Arial", Font.PLAIN, 30));
        textField.setHorizontalAlignment(JTextField.RIGHT);
	    textField.setBackground(Color.GRAY); 
	    textField.setForeground(Color.WHITE); 
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 70, 250, 207);
		panel.setBackground(Color.DARK_GRAY); 
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 4, 4, 4));
		
	    String[] botones_calculadora = 
           {"7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", ".", "+",
            "="};
	    
	    
	    for (String label : botones_calculadora) 
	    {
	        JButton button = new JButton(label); 
	        button.setBackground(Color.GRAY); 
	        button.setForeground(Color.WHITE); 
	        button.setFont(new Font("Arial", Font.PLAIN, 24)); 
	        panel.add(button); 

	        button.addActionListener(new ActionListener() { 
	        	
	            public void actionPerformed(ActionEvent e) { 
	                onButtonClicked(label); 
	            }
	        });
	    }

	    contentPane.add(panel);
	    setVisible(true); 
		
	}
	
	private void calcularResult() 
	{
	    double secondNumber = Double.parseDouble(textField.getText()); 
	    double result = 0; 
	    switch (operator) 
	    {
	        case "/": 
	            result = firstNumber / secondNumber; 
	            break;
	        case "*": 
	            result = firstNumber * secondNumber; 
	            break;
	        case "-": 
	            result = firstNumber - secondNumber; 
	            break;
	        case "+": 
	            result = firstNumber + secondNumber; 
	            break;
	    }

	    textField.setText(String.valueOf(result)); 
	}
	
	private void onButtonClicked(String label) 
	{
	    switch (label) 
	    {
	        case "C": 
	            textField.setText(""); 
	            break;
	        case "=": 
	            calcularResult(); 
	            break;
	        case "/": 
	        case "*": 
	        case "-": 
	        case "+": 
	            firstNumber = Double.parseDouble(textField.getText()); 
	            operator = label; 
	            textField.setText(""); 
	            break;
	        default: 
	            textField.setText(textField.getText() + label);
	    }
	}

}