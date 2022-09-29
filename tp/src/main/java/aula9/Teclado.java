package aula9;

import java.util.Scanner;

public class Teclado {

	Scanner teclado = new Scanner(System.in);
	
	public int lerInteiro() {
		while(true) {
			try {
				return teclado.nextInt();
			}catch (Exception e) {
	
			}
		}
	}
}
