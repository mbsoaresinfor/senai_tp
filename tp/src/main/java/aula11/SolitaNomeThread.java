package aula11;

import javax.swing.JOptionPane;

public class SolitaNomeThread extends
		Thread{
	
	public void run() {
		setName("Thread que solicita nome usuario");
		while(true) {
			String nome = JOptionPane.showInputDialog("digite seu nome");
			JOptionPane.showMessageDialog(null, "seu nome é: " + nome);
		}
	}

}
