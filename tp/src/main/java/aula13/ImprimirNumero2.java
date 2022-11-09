package aula13;

public class ImprimirNumero2 extends Thread{

	public void run() {
		int i =0;
		while (i < 10) {
			try {
				System.out.println(getName()+ ": " + i);
				Thread.sleep(1000);
				i++;
			}catch (Exception e) {
					e.printStackTrace();
			}
			
		}
		
	}
	
}
