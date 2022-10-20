package aula11.exercicios;

public class ImprimirNumerosThread
		extends Thread{
	
	public ImprimirNumerosThread() {}
	
	public ImprimirNumerosThread(String nomeT) {
		super(nomeT);
	}
	
	public void run() {
		String nomeThread = getName();
		for(int i=0; i <= 1000000; i++) {
			System.out.println(nomeThread + " " +  i+ "\n");
		}
	}

}
