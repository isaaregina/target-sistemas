package application;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Program4 {
	
	public static void main(String[] args) {
		
		double distancia = 100;
		double velocidadeCarro = 110;
		double velocidadeCaminhao = 80;
		double pedagio;
		double tempoDoCarro;
		double tempodoCaminhao;
		double conta1, conta2, conta3, conta4;
		
		// calculando pedagio e convertendo para horas
		pedagio = 5 * 2 / 60.0;
		
		//calculo da distância do carro e caminhão
		tempoDoCarro = distancia / velocidadeCarro;
		tempodoCaminhao = (distancia / velocidadeCaminhao);
		
		conta1 = tempodoCaminhao + pedagio; 
		conta2 = 100 / conta1;
		conta3 = 100 / tempoDoCarro;
		
		conta4 = (conta3 * distancia) / (conta3 + conta2);
		
		
		// Esta é a distância em 
		System.out.println("Distância da cidade de Ribeirão Preto em que o carro e o caminhão se cruzam: " +
		String.format("%.2f", conta4) + "km");
		
		
		/*
		 * Resposta: Quando se cruzam, logicamente, então na mesma distância. Para encontrar a distância, foi feita a primeira conta
		 * onde foi somado o tempo do caminhão (dividindo a distância pelos seus km/h) mais o pedagio. Na segunda conta 
		 * foi feita a velocidade média do caminhão (dividindo a primeira conta pela distância). Na terceira conta, foi feita a 
		 * velocidade média do carro (dividindo a distância pelos seus km/h). Já na quarta conta, foi feito o calculo da distância 
		 * que os dois estariam de Ribeirão Preto, onde foi
		 * calculado: velocidade média do carro vezes a distância, dividido pela velocidade média do carro mais a velocidade média do 
		 * caminhão.
		 */
		
		
		
	}

}
