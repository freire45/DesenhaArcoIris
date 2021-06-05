package br.com.erickfreire.desenhaarcoiris;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Programa em Java que desenha um arco iris
 * @author Erick Freire
 * @version 1 - Criado em 05-06-2021 as 15:45
 */

public class DesenhaArcoIris extends JPanel {
	
	private final static Color VIOLETA = new Color(128, 0, 128);
	private final static Color INDIGO = new Color(75, 0, 130);
	
	private Color[] cores = { Color.WHITE, Color.WHITE, VIOLETA, INDIGO, Color.BLUE,
			Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };
	
	public DesenhaArcoIris() {
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		int raio = 20;
		
		int centroX = getWidth() / 2;
		int centroY = getHeight() - 10;
		
		for (int contador = cores.length; contador > 0; contador--) {
			
			g.setColor(cores[contador - 1]);
			
			g.fillArc(centroX - contador * raio,
					centroY - contador * raio,
					contador * raio * 2, contador * raio * 2, 0, 180);
			
		}
		
		
	}
	
	
	

}
