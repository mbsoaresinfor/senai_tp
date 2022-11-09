package aula11;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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
//		
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
		
//		LogDataThread logDataThread = new LogDataThread();
//		logDataThread.start();
//		
//		
//		SolitaNomeThread nomeThread = new SolitaNomeThread();
//		nomeThread.start();
		
		
//		Date date1 = new Date(1666309264994l);
//		System.out.println(date1.toGMTString());
//		
//		String pattern = "MM/dd/yyyy";
//		SimpleDateFormat simpleDateFormat 
//		= new SimpleDateFormat(pattern);
//		String resultado = simpleDateFormat.format(date1);
//		System.out.println(resultado);
		
		
		List<String> nomes = Arrays.asList("ma","bate");
		List<Integer>listaTamnho = nomes
			.stream()
			.map(v -> v.length())
			.collect(Collectors.toList());
		
		System.out.println(listaTamnho);
		System.out.println(UUID.randomUUID().toString());

	}

}
