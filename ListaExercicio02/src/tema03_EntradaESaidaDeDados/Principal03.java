package tema03_EntradaESaidaDeDados;

import java.util.Scanner;
import tema01_ImplementacaoDeDiagramasDeClasses.Botao;
import tema01_ImplementacaoDeDiagramasDeClasses.Empregado;
import tema01_ImplementacaoDeDiagramasDeClasses.Lampada;

public class Principal03 {

	public static void main(String[] args) {
		
		testeIO();
	}
	
	public static void testeIO() {
		
		Scanner scanner = new Scanner(System.in);
		
		Lampada lampada = new Lampada();
		System.out.println("Digite o pre�o da l�mpada: ");
		lampada.preco = scanner.nextFloat();
		System.out.println("A l�mpada est� acesa? ");
		lampada.estaAcesa = scanner.nextBoolean();
		System.out.println("");
		
		Empregado empregado = new Empregado();
		System.out.println("Digite o ID do empregado: ");
		empregado.id = scanner.nextInt();
		System.out.println("Digite o primeiro nome do empregado: ");
		empregado.primeiroNome = scanner.next();
		System.out.println("Digite o sobrenome do empregado: ");
		empregado.sobreNome = scanner.next();
		System.out.println("Digite o sal�rio do empregado: ");
		empregado.salario = scanner.nextFloat();
		System.out.println("");
		
		Botao botao = new Botao();
		System.out.println("Digite a posi��o X do bot�o: ");
		botao.posX = scanner.nextFloat();
		System.out.println("Digite a posi��o Y do bot�o: ");
		botao.posY = scanner.nextFloat();
		System.out.println("Digite a largura do bot�o: ");
		botao.largura = scanner.nextFloat();
		System.out.println("Digite a altura do bot�o: ");
		botao.altura = scanner.nextFloat();
		System.out.println("Digite o texto do bot�o: ");
		botao.texto = scanner.next();
		System.out.println("Digite o formato do bot�o: ");
		botao.formato = scanner.nextInt();
				
		scanner.close();
		
		imprimir(lampada, empregado, botao);
	}
	
	public static void imprimir(Lampada umaLampada, Empregado umEmpregado, Botao umBotao) {
		
		System.out.println("Pre�o da l�mpada: R$" + umaLampada.preco);
		System.out.println("L�mpada acesa? " + umaLampada.estaAcesa);
		System.out.println("");
		
		System.out.println("ID do empregado: " + umEmpregado.id);
		System.out.println("Primeiro nome do empregado: " + umEmpregado.primeiroNome);
		System.out.println("Sobrenome do empregado: " + umEmpregado.sobreNome);
		System.out.println("Sal�rio do empregado: R$" + umEmpregado.salario);
		System.out.println("");
		
		System.out.println("Posi��o X do bot�o: " + umBotao.posX);
		System.out.println("Posi��o Y do bot�o: " + umBotao.posY);
		System.out.println("Largura do bot�o: " + umBotao.largura);
		System.out.println("Altura do bot�o: " + umBotao.altura);
		System.out.println("Texto do bot�o: " + umBotao.texto);
		System.out.println("Formato do bot�o: " + umBotao.formato);
	}
}
