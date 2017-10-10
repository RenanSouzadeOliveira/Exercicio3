package exercicio3;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface extends JFrame {
double fahrenheit, celsius;
	
	Calculo calc = new Calculo();
	JLabel lblcelsius = new JLabel("Celsius");
	JLabel lblfahrenheit = new JLabel("Fahrenheit");
	
	JTextField txtfahrenheit = new JTextField();
	JTextField txtcelsius = new JTextField();
	
	JButton btnCalculo = new JButton("Calcular");
	
	public Interface(){
		super("Conversão de graus");
		Container paine = this.getContentPane();
		
		paine.add(lblcelsius);
		lblcelsius.setBounds(20,20,245,40);
		
		paine.add(lblfahrenheit);
		lblfahrenheit.setBounds(20, 90, 245, 40);
		
		paine.add(txtcelsius);
		txtcelsius.setBounds(100,30,140,20);
		
		paine.add(txtfahrenheit);
		txtfahrenheit.setBounds(100,100,140,20);
		
		paine.add(btnCalculo);
		btnCalculo.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 celsius = Double.parseDouble(txtcelsius.getText());
				 txtfahrenheit.setText("" + calc.graus(celsius));
			 }
		 });
		btnCalculo.setBounds(110,160,100,40);
		
		txtfahrenheit.setEditable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(350, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){
		Interface cad = new Interface();
		
	}
}
