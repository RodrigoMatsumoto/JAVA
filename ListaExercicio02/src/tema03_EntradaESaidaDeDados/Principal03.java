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
		System.out.println("Digite o preço da lâmpada: ");
		lampada.preco = scanner.nextFloat();
		System.out.println("A lâmpada está acesa? ");
		lampada.estaAcesa = scanner.nextBoolean();
		System.out.println("");
		
		Empregado empregado = new Empregado();
		System.out.println("Digite o ID do empregado: ");
		empregado.id = scanner.nextInt();
		System.out.println("Digite o primeiro nome do empregado: ");
		empregado.primeiroNome = scanner.next();
		System.out.println("Digite o sobrenome do empregado: ");
		empregado.sobreNome = scanner.next();
		System.out.println("Digite o salário do empregado: ");
		empregado.salario = scanner.nextFloat();
		System.out.println("");
		
		Botao botao = new Botao();
		System.out.println("Digite a posição X do botão: ");
		botao.posX = scanner.nextFloat();
		System.out.println("Digite a posição Y do botão: ");
		botao.posY = scanner.nextFloat();
		System.out.println("Digite a largura do botão: ");
		botao.largura = scanner.nextFloat();
		System.out.println("Digite a altura do botão: ");
		botao.altura = scanner.nextFloat();
		System.out.println("Digite o texto do botão: ");
		botao.texto = scanner.next();
		System.out.println("Digite o formato do botão: ");
		botao.formato = scanner.nextInt();
				
		scanner.close();
		
		imprimir(lampada, empregado, botao);
	}
	
	public static void imprimir(Lampada umaLampada, Empregado umEmpregado, Botao umBotao) {
		
		System.out.println("Preço da lâmpada: R$" + umaLampada.preco);
		System.out.println("Lâmpada acesa? " + umaLampada.estaAcesa);
		System.out.println("");
		
		System.out.println("ID do empregado: " + umEmpregado.id);
		System.out.println("Primeiro nome do empregado: " + umEmpregado.primeiroNome);
		System.out.println("Sobrenome do empregado: " + umEmpregado.sobreNome);
		System.out.println("Salário do empregado: R$" + umEmpregado.salario);
		System.out.println("");
		
		System.out.println("Posição X do botão: " + umBotao.posX);
		System.out.println("Posição Y do botão: " + umBotao.posY);
		System.out.println("Largura do botão: " + umBotao.largura);
		System.out.println("Altura do botão: " + umBotao.altura);
		System.out.println("Texto do botão: " + umBotao.texto);
		System.out.println("Formato do botão: " + umBotao.formato);
	}
}
