package aula7;

import java.util.ArrayList;

public class Aula7Main {

	public static void main(String[] args) {
	
		ConfiguracaoSistema config = ConfiguracaoSistema.getInstance();
		config.setNomeSistema("aula senai");
		System.out.println("nome sistema é: " + config.getNomeSistema());

		ConfiguracaoSistema config1 =  ConfiguracaoSistema.getInstance();
		config1.setNomeSistema("abc");
		System.out.println("nome sistema é: " + config1.getNomeSistema());
		
		CadastroProduto cadastroProduto = new CadastroProduto();
		cadastroProduto.mostrarAlgumaCoisa();
		
		ArrayList<String> listaCarro = new ArrayList<>();
		listaCarro.add("gol");
		listaCarro.add("kwid");
		listaCarro.add("sdsdsdsdsdd");
		
		FabricaVeiculo fabricaVeiculo = new FabricaVeiculo();
		
		for(String carro : listaCarro) {
			Veiculo veiculo = fabricaVeiculo.criarVeiculo(carro);
			veiculo.andar();
			veiculo.parar();
		}
		
		
	}

}
