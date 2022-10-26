package aula11.exercicios;

import java.util.Date;

public class LogDataThread extends Thread{

	private final long UM_SEGUNDO = 1000;
	public void run() {	
		setName("Thread que loga na console");
		
		while(true) {
			try {
				Thread.sleep(UM_SEGUNDO);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Executando a thread " + new Date());			
		}
	}
	
}
