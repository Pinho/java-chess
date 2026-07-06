package main;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[]args) {

		JFrame window = new JFrame("Xadrez");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		//adicionando o painel na janela
		GamePanel gp = new GamePanel();// instancia o painel
		window.add(gp);// coloco o painel na janela
		window.pack();// pack ajusta a janela pro tamanho do painel
		
		window.setLocationRelativeTo(null);//coloca a janela no meio
		window.setVisible(true);
		
		gp.launchGame();	
	}
}
