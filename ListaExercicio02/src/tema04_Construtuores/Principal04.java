package tema04_Construtuores;

import java.util.Scanner;

public class Principal04 {
	
	public static void main(String[] args) {
		testeIOConstrutor();
	}
	
	public static void testeIOConstrutor() {
		
		Scanner scanner = new Scanner(System.in);
		
		float precoConstrutor;
		boolean estaAcesaConstrutor;

		System.out.println("Digite o preço da lâmpada: ");
		precoConstrutor = scanner.nextFloat();
		System.out.println("A lâmpada está acesa? ");
		estaAcesaConstrutor = scanner.nextBoolean();
		System.out.println("");
		
		LampadaConstrutor lampadaConstrutor = new LampadaConstrutor(precoConstrutor, estaAcesaConstrutor);
		
		int idConstrutor;
		String primeiroNomeConstrutor;
		String sobreNomeConstrutor;
		float salarioConstrutor;
		
		System.out.println("Digite o ID do empregado: ");
		idConstrutor = scanner.nextInt();
		System.out.println("Digite o primeiro nome do empregado: ");
		primeiroNomeConstrutor = scanner.next();
		System.out.println("Digite o sobrenome do empregado: ");
		sobreNomeConstrutor = scanner.next();
		System.out.println("Digite o salário do empregado: ");
		salarioConstrutor = scanner.nextFloat();
		System.out.println("");
		
		EmpregadoConstrutor empregadoConstrutor = new EmpregadoConstrutor(idConstrutor, primeiroNomeConstrutor, sobreNomeConstrutor, salarioConstrutor);
		
		float posXConstrutor;
		float posYConstrutor;
		float larguraConstrutor;
		float alturaConstrutor;
		String textoConstrutor;
		int formatoConstrutor;
		
		System.out.println("Digite a posição X do botão: ");
		posXConstrutor = scanner.nextFloat();
		System.out.println("Digite a posição Y do botão: ");
		posYConstrutor = scanner.nextFloat();
		System.out.println("Digite a largura do botão: ");
		larguraConstrutor = scanner.nextFloat();
		System.out.println("Digite a altura do botão: ");
		alturaConstrutor = scanner.nextFloat();
		System.out.println("Digite o texto do botão: ");
		textoConstrutor = scanner.next();
		System.out.println("Digite o formato do botão: ");
		formatoConstrutor = scanner.nextInt();
		
		BotaoConstrutor botaoConstrutor = new BotaoConstrutor(posXConstrutor, posYConstrutor, larguraConstrutor, alturaConstrutor, textoConstrutor, formatoConstrutor);
		
		scanner.close();
		
		imprimir(lampadaConstrutor, empregadoConstrutor, botaoConstrutor);
	}
	
	public static void imprimir(LampadaConstrutor umaLampadaConstrutor, EmpregadoConstrutor umEmpregadoConstrutor, BotaoConstrutor umBotaoConstrutor) {
		
		System.out.println("Preço da lâmpada: R$" + umaLampadaConstrutor.preco);
		System.out.println("Lâmpada acesa? " + umaLampadaConstrutor.estaAcesa);
		System.out.println("");
		
		System.out.println("ID do empregado: " + umEmpregadoConstrutor.id);
		System.out.println("Primeiro nome do empregado: " + umEmpregadoConstrutor.primeiroNome);
		System.out.println("Sobrenome do empregado: " + umEmpregadoConstrutor.sobreNome);
		System.out.println("Salário do empregado: R$" + umEmpregadoConstrutor.salario);
		System.out.println("");
		
		System.out.println("Posição X do botão: " + umBotaoConstrutor.posX);
		System.out.println("Posição Y do botão: " + umBotaoConstrutor.posY);
		System.out.println("Largura do botão: " + umBotaoConstrutor.largura);
		System.out.println("Altura do botão: " + umBotaoConstrutor.altura);
		System.out.println("Texto do botão: " + umBotaoConstrutor.texto);
		System.out.println("Formato do botão: " + umBotaoConstrutor.formato);
	}
}
