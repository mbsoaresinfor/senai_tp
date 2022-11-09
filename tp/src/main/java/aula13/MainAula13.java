package aula13;

import java.util.concurrent.Executors;

public class MainAula13 {

	public static void main(String[] args) throws InterruptedException {
		
		 Executors.newFixedThreadPool(100);
		ImprimirNumero2 imprimirNumero2 = new ImprimirNumero2();
		imprimirNumero2.start();
		//imprimirNumero2.join();

		OutraThreadA outraThreadA = new OutraThreadA();
		outraThreadA.start();
		outraThreadA.join();
		
		for(int i=0; i < 10; i++) {
			System.out.println("main: " + i);
			Thread.sleep(1000);
		}
		
	}

}
