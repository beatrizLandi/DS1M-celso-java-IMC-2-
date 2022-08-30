package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.temporal.JulianFields;

import javax.print.attribute.standard.PagesPerMinuteColor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;

public class FrameCalculoImc {
	
	public String titulo;
	public int largura;
	public int altura;
	public Color CorDeFundo;
	public Font fonteDosLabels;
	public Color corDoBotao;
	
	
	public void criarTela() {
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		
		
		
		Container painel = tela.getContentPane();
		painel.setBackground(CorDeFundo);
		
		
		
		JLabel labelImc = new JLabel();
		labelImc.setText("IMC");
		labelImc.setBounds(30,0,50,50); 
		labelImc.setFont(new Font("Courier new", Font.BOLD, 20));
		labelImc.setForeground(new Color(141, 2, 2));
		
		JLabel labelNome = new JLabel();
		labelNome.setText("NOME");
		labelNome.setBounds(30, 40,100, 30);
		labelNome.setForeground(new Color(141, 2, 2));
		
		JTextField textFieldNome = new JTextField();
		textFieldNome.setBounds(30, 70, 300, 30);
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(30, 110, 100, 30);
		labelAltura.setForeground(new Color(141, 2, 2));
		
		JTextField textFieldAltura = new JTextField();
		textFieldAltura.setBounds(30, 140, 50, 30);
		
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setBounds(30, 180, 50, 30);
		labelPeso.setForeground(new Color(141, 2, 2));
		
		JTextField textFieldPeso = new JTextField();
		textFieldPeso.setBounds(30, 210, 50, 30);
		
		JLabel jLabelIdade = new JLabel();
		jLabelIdade.setText("Idade :");
		jLabelIdade.setBounds(30, 250, 50, 30);
		jLabelIdade.setForeground(new Color(141, 2, 2));
		
		JTextField jTextFieldIdade = new JTextField();
		jTextFieldIdade.setBounds(30, 280, 100, 30);
		
		JLabel JLabelValorImc = new JLabel();
		JLabelValorImc.setBounds(30, 300, 100, 30);
		JLabelValorImc.setText("valor imc");
		
		JLabel JLabelStatus = new JLabel();
		JLabelStatus.setText("seu imc é");
		JLabelStatus.setBounds(30, 320, 500, 30);
		
	
		
	
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("calcular");
		buttonCalcular.setBounds(30, 500, 110, 30);
		buttonCalcular.setForeground(CorDeFundo);
		buttonCalcular.setBackground(corDoBotao);
		
		
		//eventos click
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			Cliente cliente = new Cliente();
			cliente.nome = textFieldNome.getText();
			cliente.peso = Double.parseDouble(textFieldPeso.getText());
			cliente.altura = Double.parseDouble(textFieldAltura.getText());
			
			//labelResultadoImc.setText(cliente.nome "seu imc é :" + cliente.getImc());
				
			}
		});
		
		textFieldNome.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "vai digitar nao");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			
				
				
				
				
			}
		});
		
		painel.add(labelImc);
		painel.add(buttonCalcular);
		painel.add(labelNome);
		painel.add(textFieldNome);
		painel.add(labelAltura);
		painel.add(textFieldAltura);
		painel.add(labelPeso);
		painel.add(textFieldPeso);
		painel.add(jLabelIdade);
		painel.add(jTextFieldIdade);
		painel.add(buttonCalcular);
		painel.add(JLabelStatus);
		painel.add(JLabelValorImc);
		
		
		tela.setVisible(true);
		
		
	}
	


}
