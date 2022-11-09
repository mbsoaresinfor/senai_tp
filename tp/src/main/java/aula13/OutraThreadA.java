package aula13;

public class OutraThreadA extends Thread{

	public void run() {
		int i =0;
		while (i < 4) {
			try {
				System.out.println(getName()+ "-" + i);
				Thread.sleep(1000);
				i++;
			}catch (Exception e) {
					e.printStackTrace();
			}
			
		}
	}
}
