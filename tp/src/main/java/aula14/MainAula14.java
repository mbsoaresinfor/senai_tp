package aula14;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import javax.swing.JOptionPane;

public class MainAula14 {

	public static void main(String[] args) {
	
		List<Boleto> listaBoleto = new ArrayList<Boleto>();
		EnviaEmailThread enviaEmailThread = new EnviaEmailThread(listaBoleto);
		enviaEmailThread.start();
		
		while(true) {
			String codigo = JOptionPane.showInputDialog("digite codigo boleto");
			String nome = JOptionPane.showInputDialog("digite nome cliente");
			Boleto boleto = new Boleto();
			boleto.setCodigoTitulo(Integer.parseInt(codigo));
			boleto.setNomeCliente(nome);
			listaBoleto.add(boleto);
			
		}

	}

}
