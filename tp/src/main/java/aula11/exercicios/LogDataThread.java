package aula11.exercicios;

import java.util.Date;

public class LogDataThread extends Thread{

	public void run() {		
		while(true) {
			System.out.println("Executando a thread " + new Date());			
		}
	}
	
}
