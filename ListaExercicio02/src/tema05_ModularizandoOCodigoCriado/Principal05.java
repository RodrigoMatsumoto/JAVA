package tema05_ModularizandoOCodigoCriado;

import java.util.Scanner;

import tema04_Construtuores.BotaoConstrutor;
import tema04_Construtuores.EmpregadoConstrutor;
import tema04_Construtuores.LampadaConstrutor;

public class Principal05 {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		testeIOConstrutorMod();
	}
	
	public static void testeIOConstrutorMod() {
		
		LampadaConstrutor lampadaConstrutor = criarLampadaConstrutor();
		
		EmpregadoConstrutor empregadoConstrutor = criarEmpregadoConstrutor();
		
		BotaoConstrutor botaoConstrutor = criarBotaoConstrutor();
		
		imprimir(lampadaConstrutor, empregadoConstrutor, botaoConstrutor);		
	}
	
	public static LampadaConstrutor criarLampadaConstrutor() {
		
		float precoConstrutor;
		boolean estaAcesaConstrutor;
		
		System.out.println("Digite o pre�o da l�mpada: ");
		precoConstrutor = scanner.nextFloat();
		System.out.println("A l�mpada est� acesa? ");
		estaAcesaConstrutor = scanner.nextBoolean();
		System.out.println("");
		
		return new LampadaConstrutor(precoConstrutor, estaAcesaConstrutor);
	}
	
	public static EmpregadoConstrutor criarEmpregadoConstrutor() {
		
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
		System.out.println("Digite o sal�rio do empregado: ");
		salarioConstrutor = scanner.nextFloat();
		System.out.println("");
		
		return new EmpregadoConstrutor(idConstrutor, primeiroNomeConstrutor, sobreNomeConstrutor, salarioConstrutor);
	}
	
	public static BotaoConstrutor criarBotaoConstrutor() {
		
		float posXConstrutor;
		float posYConstrutor;
		float larguraConstrutor;
		float alturaConstrutor;
		String textoConstrutor;
		int formatoConstrutor;
		
		System.out.println("Digite a posi��o X do bot�o: ");
		posXConstrutor = scanner.nextFloat();
		System.out.println("Digite a posi��o Y do bot�o: ");
		posYConstrutor = scanner.nextFloat();
		System.out.println("Digite a largura do bot�o: ");
		larguraConstrutor = scanner.nextFloat();
		System.out.println("Digite a altura do bot�o: ");
		alturaConstrutor = scanner.nextFloat();
		System.out.println("Digite o texto do bot�o: ");
		textoConstrutor = scanner.next();
		System.out.println("Digite o formato do bot�o: ");
		formatoConstrutor = scanner.nextInt();
		
		return new BotaoConstrutor(posXConstrutor, posYConstrutor, larguraConstrutor, alturaConstrutor, textoConstrutor, formatoConstrutor);
	}
	
	public static void imprimir(LampadaConstrutor umaLampadaConstrutor, EmpregadoConstrutor umEmpregadoConstrutor, BotaoConstrutor umBotaoConstrutor) {
		
		System.out.println("Pre�o da l�mpada: R$" + umaLampadaConstrutor.preco);
		System.out.println("L�mpada acesa? " + umaLampadaConstrutor.estaAcesa);
		System.out.println("");
		
		System.out.println("ID do empregado: " + umEmpregadoConstrutor.id);
		System.out.println("Primeiro nome do empregado: " + umEmpregadoConstrutor.primeiroNome);
		System.out.println("Sobrenome do empregado: " + umEmpregadoConstrutor.sobreNome);
		System.out.println("Sal�rio do empregado: R$" + umEmpregadoConstrutor.salario);
		System.out.println("");
		
		System.out.println("Posi��o X do bot�o: " + umBotaoConstrutor.posX);
		System.out.println("Posi��o Y do bot�o: " + umBotaoConstrutor.posY);
		System.out.println("Largura do bot�o: " + umBotaoConstrutor.largura);
		System.out.println("Altura do bot�o: " + umBotaoConstrutor.altura);
		System.out.println("Texto do bot�o: " + umBotaoConstrutor.texto);
		System.out.println("Formato do bot�o: " + umBotaoConstrutor.formato);
	}
}
