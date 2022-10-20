package aula11;

public class MinhaThreadBaixarArquivo
			extends Thread{

	private String nomeArquivo;
	
	public MinhaThreadBaixarArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public void run() {
		// colocar o codigo para ser executado
		System.out.println("baixando arquivo.." + nomeArquivo);
		System.out.println(teste());
	}
	
	private String teste() {
		return "marcelo";
	}
	
}
