package aula14;

import java.util.List;

public class EnviaEmailThread extends Thread{

	private List<Boleto> listaBoleto;
	
	public EnviaEmailThread(List<Boleto> listaBoleto) {
		this.listaBoleto = listaBoleto;
	}
	
	public void run() {
		while(true) {
			boolean todosBoletosJaFoiEnviadoEmail =
					listaBoleto.stream()
					.allMatch(boleto -> boleto.isBoletoEnviado());
			if(todosBoletosJaFoiEnviadoEmail) {
				System.out.println("não tem boleto para enviar aos clientes");
			}else{
				listaBoleto.stream()
					.filter(boleto -> boleto.isBoletoEnviado() == false)
					.forEach(boleto -> {
						System.out.println("enviado o email para o cliente X, referente ao boleto " + boleto.getCodigoTitulo());
						boleto.setBoletoEnviado(true);
					});;
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
}
