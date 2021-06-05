package br.com.erickfreire.desenhaarcoiris;

import javax.swing.JFrame;

public class Teste {
	public static void main(String[] args) {
		
		DesenhaArcoIris painel = new DesenhaArcoIris();
		JFrame aplicacao = new JFrame();
		
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(painel);
		aplicacao.setSize(400,250);
		aplicacao.setVisible(true);
		
	}

}
