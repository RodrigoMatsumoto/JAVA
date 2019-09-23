package tema02_InstanciasDeObjetos;

import tema01_ImplementacaoDeDiagramasDeClasses.Botao;
import tema01_ImplementacaoDeDiagramasDeClasses.Empregado;
import tema01_ImplementacaoDeDiagramasDeClasses.Lampada;

public class Principal02 {

	public static void main(String[] args) {
		
		teste();
	}

	public static void teste() {
		
		Lampada lampada = new Lampada();
		lampada.preco = 1.50f;
		lampada.estaAcesa = true;
		
		Empregado empregado = new Empregado();
		empregado.id = 21280768;
		empregado.primeiroNome = "Rodrigo";
		empregado.sobreNome = "Matsumoto";
		empregado.salario = 10000.00f;
		
		Botao botao = new Botao();
		botao.posX = 10.0f;
		botao.posY = 10.0f;
		botao.largura = 5.0f;
		botao.altura = 2.5f;
		botao.texto = "BOTÃO";
		botao.formato = 2;	
		
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
