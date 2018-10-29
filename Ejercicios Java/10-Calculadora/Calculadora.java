/*
 * Calculadora.java
 * 
 * Copyright 2018 Nicxon Márquez <nicxon@gmail.com>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * Calculadora Simple con las cuatro operaciones básicas:
 * Suma
 * Resta
 * Multiplicación
 * División
 * 
 * EL programa cuenta con Insterfaz gráfica de usuario
 */

import javax.swing.*; //Librería Gráfica de Java
import java.awt.event.*; //Librería para interactuar con el usuario

public class Calculadora extends JFrame implements ActionListener{
	private JLabel titulo, numero1label1, numero2label2, resultadolabel;
	private JTextField textnumero1, textnumero2;
	private JButton botonmas, botonmenos, botonpor, botonentre;
	
	public Calculadora(){
		setLayout(null);
		titulo = new JLabel("Calculadora Bodeguera 1G");
		titulo.setBounds(50,10,200,50);
		add(titulo);
		
		numero1label1 = new JLabel("Número uno:");
		numero1label1.setBounds(10,45,200,20);
		add(numero1label1);
		
		textnumero1 = new JTextField();
		textnumero1.setBounds(10,70,280,25);
		add(textnumero1);
		
		botonmas = new JButton("+");
		botonmas.setBounds(10,100,50,25);
		add(botonmas);
		botonmas.addActionListener(this);
		
		botonmenos = new JButton("-");
		botonmenos.setBounds(90,100,50,25);
		add(botonmenos);
		botonmenos.addActionListener(this);
		
		botonpor = new JButton("X");
		botonpor.setBounds(165,100,50,25);
		add(botonpor);
		botonpor.addActionListener(this);
		
		botonentre = new JButton("%");
		botonentre.setBounds(240,100,50,25);
		add(botonentre);
		botonentre.addActionListener(this);
		
		numero2label2 = new JLabel("Número dos:");
		numero2label2.setBounds(10,125,200,20);
		add(numero2label2);
		
		textnumero2 = new JTextField();
		textnumero2.setBounds(10,145,280,25);
		add(textnumero2);
		
		resultadolabel = new JLabel("Resultado:");
		resultadolabel.setBounds(10,170,200,20);
		add(resultadolabel);
	}
	
	public void actionPerformed(ActionEvent e){
		
		int numero1 = 0, numero2 = 0;
		float resultado = 0;
		if(e.getSource() == botonmas){
			numero1 = Integer.parseInt(textnumero1.getText());
			numero2 = Integer.parseInt(textnumero2.getText());
			resultado = numero1 + numero2;
			resultadolabel.setText("Resultado: " + resultado);
		}
		
		if(e.getSource() == botonmenos){
			numero1 = Integer.parseInt(textnumero1.getText());
			numero2 = Integer.parseInt(textnumero2.getText());
			resultado = numero1 - numero2;
			resultadolabel.setText("Resultado: " + resultado);
		}
		
		if(e.getSource() == botonpor){
			numero1 = Integer.parseInt(textnumero1.getText());
			numero2 = Integer.parseInt(textnumero2.getText());
			resultado = numero1 * numero2;
			resultadolabel.setText("Resultado: " + resultado);
		}
		
		if(e.getSource() == botonentre){
			numero1 = Integer.parseInt(textnumero1.getText());
			numero2 = Integer.parseInt(textnumero2.getText());
			resultado = numero1 / numero2;
			resultadolabel.setText("Resultado: " + resultado);
		}
	}
	
	public static void main(String args[]){
		Calculadora calculadora = new Calculadora();
		calculadora.setBounds(0,0,300,300);
		calculadora.setVisible(true);
		calculadora.setResizable(false);
		calculadora.setLocationRelativeTo(null);
	}
}

