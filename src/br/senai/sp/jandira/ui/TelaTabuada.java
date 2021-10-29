package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.senai.sp.jandira.model.Tabuada;

public class TelaTabuada {
	
	public void criarTela() {
		
		//Fontes do projeto
		Font titulo = new Font("Arial", Font.BOLD, 40);
		Font labels = new Font("Arial", Font.PLAIN, 20);
		Font buttons = new Font("Arial", Font.BOLD, 16);
		
		//Cores do projeto
		Color green = new Color(156, 197, 35);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tabuada");
		frame.setSize(600, 600);
		frame.setLayout(null);
		
		//Header do frame
		JPanel header = new JPanel();
		header.setBounds(0, 0, 600, 100);
		header.setBackground(Color.WHITE);
		header.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Tabuada");
		lblTitulo.setBounds(10, 10, 300, 40);
		lblTitulo.setFont(titulo);
		lblTitulo.setForeground(Color.BLUE);
		 
		 JPanel panelFormulario = new JPanel();
		 panelFormulario.setBounds(10, 20, 340, 400);
		 panelFormulario.setLayout(null);
		
		JLabel lblMultiplicando = new JLabel("Multiplicando:");
		lblMultiplicando.setBounds(20, 110, 200, 30);
		lblMultiplicando.setFont(labels);
		lblMultiplicando.setHorizontalAlignment(SwingConstants.RIGHT);
		panelFormulario.add(lblMultiplicando);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(225, 110, 100, 30);
		panelFormulario.add(txtMultiplicando);
		
		JLabel lblMultiplicador = new JLabel("Máximo Multiplicador:");
		lblMultiplicador.setBounds(20, 170, 200, 30);
		lblMultiplicador.setFont(labels);
		lblMultiplicador.setHorizontalAlignment(SwingConstants.RIGHT);
		panelFormulario.add(lblMultiplicador);
		
		JTextField txtMultiplicador = new JTextField();
		txtMultiplicador.setBounds(225, 170, 100, 30);
		panelFormulario.add(txtMultiplicador);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(20, 230, 305, 40);
		btnCalcular.setBackground(green);
		btnCalcular.setFont(buttons);
		btnCalcular.setForeground(Color.WHITE);
		btnCalcular.setFont(buttons);
		panelFormulario.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(20, 290, 305, 40);
		btnLimpar.setBackground(Color.RED);
		btnLimpar.setFont(buttons);
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setFont(buttons);
		panelFormulario.add(btnLimpar);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(360, 120, 150, 30);
		lblResultado.setFont(labels);
		lblResultado.setForeground(Color.BLUE);
		
		ImageIcon iconCalculator = new ImageIcon((getClass().getResource("/br/senai/sp/jandira/images/calculator.png")));
		JLabel lblIcon = new JLabel(iconCalculator);
		lblIcon.setBounds(470, 10, 64, 64);
		
		//JList
		JScrollPane scroll = new JScrollPane();
	    scroll.setBounds(360, 155, 200, 300);
	    
	   DefaultListModel<String> tabuadaModel = new DefaultListModel<String>();
	   Tabuada tabuada = new Tabuada();
	   
	   JList<String> tabuadaList = new JList<String>();
	    scroll.getViewport().add(tabuadaList);
	    
	   tabuadaList.setModel(tabuadaModel);
	    
	    frame.getContentPane().add(header);
	    header.add(lblTitulo);
	    header.add(lblIcon);
	    frame.getContentPane().add(panelFormulario);
		frame.getContentPane().add(lblResultado);
		frame.getContentPane().add(scroll);
		
		frame.setVisible(true);
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int multiplicando = Integer.parseInt(txtMultiplicando.getText());
				int multiplicador = Integer.parseInt(txtMultiplicador.getText());
				
				tabuada.setMultiplicando(multiplicando);
				tabuada.setMultiplcador(multiplicador);
				
				String[] resultadoTabuada = tabuada.calcular();

				   for (int i = 0; i < resultadoTabuada.length; i++) {
					   tabuadaModel.addElement(resultadoTabuada[i]);
				   }
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtMultiplicador.setText("");
				txtMultiplicando.setText("");
				txtMultiplicando.requestFocus();
				
				tabuadaModel.clear();
				
			}
		});
	}
	
}
