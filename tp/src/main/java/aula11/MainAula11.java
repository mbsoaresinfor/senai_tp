package aula11;

import java.util.Date;

import javax.swing.JOptionPane;

import aula11.exercicios.ImprimirNumerosThread;
import aula11.exercicios.LogDataThread;

public class MainAula11 {

	public static void main(String[] args) {

//		MinhaThreadBaixarArquivo thread1 = 
//				new MinhaThreadBaixarArquivo("ARQUIVO_1");
//		
//		MinhaThreadBaixarArquivo thread2 = 
//				new MinhaThreadBaixarArquivo("ARQUIVO_2");
//		
//		MinhaThreadBaixarArquivo thread3 = 
//				new MinhaThreadBaixarArquivo("ARQUIVO_3");
//		
//		thread1.start();
//		thread2.start();
//		thread3.start();
		
//		for(int i=0; i < 100; i++) {
//			MinhaThreadBaixarArquivo t = 
//					new MinhaThreadBaixarArquivo("TESTE_" +i);
//			t.start();
//		}
		
		// EXERCICIOS
//		ImprimirNumerosThread imprimir = new ImprimirNumerosThread("A");
//		imprimir.start();
//		
//		ImprimirNumerosThread imprimir2 = new ImprimirNumerosThread("B");
//		imprimir2.start();
//		
//		ImprimirNumerosThread imprimir3 = new ImprimirNumerosThread("C");
//		imprimir3.start();
		
		LogDataThread logDataThread = new LogDataThread();
		logDataThread.start();
		
		while(true) {
			String nome = JOptionPane.showInputDialog("digite seu nome");
			JOptionPane.showMessageDialog(null, "seu nome é: " + nome);
		}
		
		
		
		
		

	}

}
