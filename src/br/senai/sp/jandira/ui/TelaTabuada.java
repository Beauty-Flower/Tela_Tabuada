package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaTabuada {
	
	public void criarTela() {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tabuada");
		frame.setSize(450, 370);
		frame.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Tabuada");
		lblTitulo.setBounds(20, 20, 100, 50);
		lblTitulo.setFont(new Font ("Roboto", Font.BOLD, 23));
		lblTitulo.setForeground(Color.BLUE);
		
		JLabel lblMultiplicando = new JLabel("Multiplicando:");
		lblMultiplicando.setBounds(70, 70, 90, 30);
		lblMultiplicando.setFont(new Font ("Lato", Font.PLAIN, 15));
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(170, 70, 60, 30);
		
		JLabel lblMaximoMultiplicador = new JLabel("Máximo Multiplicador:");
		lblMaximoMultiplicador.setBounds(20, 100, 150, 30);
		lblMaximoMultiplicador.setFont(new Font ("Lato", Font.PLAIN, 15));
		
		JTextField txtMaximoMultiplicador = new JTextField();
		txtMaximoMultiplicador.setBounds(170, 105, 60, 30);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(20, 170, 212, 50);
		btnCalcular.setBackground(Color.GREEN);
		btnCalcular.setFont(new Font ("Arial", Font.BOLD, 25));
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(20, 240, 212, 50);
		btnLimpar.setBackground(Color.RED);
		btnLimpar.setFont(new Font ("Arial", Font.BOLD, 25));
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(270, 50, 100, 50);
		lblResultado.setFont(new Font ("Roboto", Font.BOLD, 17));
		lblResultado.setForeground(Color.BLUE);
		
		JScrollPane scroll = new JScrollPane();
	    scroll.setBounds(270, 100, 75, 150);
		
		frame.getContentPane().add(lblTitulo);
		frame.getContentPane().add(lblMultiplicando);
		frame.getContentPane().add(txtMultiplicando);
		frame.getContentPane().add(lblMaximoMultiplicador);
		frame.getContentPane().add(txtMaximoMultiplicador);
		frame.getContentPane().add(btnCalcular);
		frame.getContentPane().add(btnLimpar);
		frame.getContentPane().add(lblResultado);
		frame.getContentPane().add(scroll);
		
		frame.setVisible(true);
	}
	
}
