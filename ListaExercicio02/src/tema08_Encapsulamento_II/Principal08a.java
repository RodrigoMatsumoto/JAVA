package tema08_Encapsulamento_II;

import java.util.Scanner;
import tema07_Encapsulamento.BotaoEncapsulado;
import tema07_Encapsulamento.EmpregadoEncapsulado;
import tema07_Encapsulamento.LampadaEncapsulada;

public class Principal08a {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		Principal08a principal08a = new Principal08a();
		principal08a.testeEncapsulado();
	}

	public void testeEncapsulado() {
		
		Principal08a principal08a = new Principal08a();
		
		LampadaEncapsulada lampadaEncapsulada = criarLampadaEncapsulada();
		EmpregadoEncapsulado empregadoEncapsulado = criarEmpregadoEncapsulado();
		BotaoEncapsulado botaoEncapsulado = criarBotaoEncapsulado();
		
		principal08a.imprimir(lampadaEncapsulada, empregadoEncapsulado, botaoEncapsulado);
	}
	
	public LampadaEncapsulada criarLampadaEncapsulada() {
		
		LampadaEncapsulada lampadaEncapsuladaCriada = new LampadaEncapsulada();
		
		System.out.println("Digite o preço da lâmpada: ");
		lampadaEncapsuladaCriada.setPreco(scanner.nextFloat());
		System.out.println("A lâmpada está acesa? ");
		lampadaEncapsuladaCriada.setEstaAcesa(scanner.nextBoolean());
		System.out.println("");
		
		return lampadaEncapsuladaCriada;
	}
	
	public EmpregadoEncapsulado criarEmpregadoEncapsulado() {
		
		EmpregadoEncapsulado empregadoEncapsuladoCriado = new EmpregadoEncapsulado();
		
		System.out.println("Digite o ID do empregado: ");
		empregadoEncapsuladoCriado.setId(scanner.nextInt());
		System.out.println("Digite o primeiro nome do empregado: ");
		empregadoEncapsuladoCriado.setPrimeiroNome(scanner.next());
		System.out.println("Digite o sobrenome do empregado: ");
		empregadoEncapsuladoCriado.setSobreNome(scanner.next());
		System.out.println("Digite o salário do empregado: ");
		empregadoEncapsuladoCriado.setSalario(scanner.nextFloat());
		System.out.println("");
		
		return empregadoEncapsuladoCriado;
	}
	
	public BotaoEncapsulado criarBotaoEncapsulado() {
		
		BotaoEncapsulado botaoEncapsuladoCriado = new BotaoEncapsulado();
		
		System.out.println("Digite a posição X do botão: ");
		botaoEncapsuladoCriado.setPosX(scanner.nextFloat());
		System.out.println("Digite a posição Y do botão: ");
		botaoEncapsuladoCriado.setPosY(scanner.nextFloat());
		System.out.println("Digite a largura do botão: ");
		botaoEncapsuladoCriado.setLargura(scanner.nextFloat());
		System.out.println("Digite a altura do botão: ");
		botaoEncapsuladoCriado.setAltura(scanner.nextFloat());
		System.out.println("Digite o texto do botão: ");
		botaoEncapsuladoCriado.setTexto(scanner.next());
		System.out.println("Digite o formato do botão: ");
		botaoEncapsuladoCriado.setFormato(scanner.nextInt());
		
		return botaoEncapsuladoCriado;
	}
	
	public void imprimir(LampadaEncapsulada umaLampadaEncapsulada, EmpregadoEncapsulado umEmpregadoEncapsulado, BotaoEncapsulado umBotaoEncapsulado) {
		
		System.out.println("Preço da lâmpada: R$" + umaLampadaEncapsulada.getPreco());
		System.out.println("Lâmpada acesa? " + umaLampadaEncapsulada.getEstaAcesa());
		System.out.println("");
		
		System.out.println("ID do empregado: " + umEmpregadoEncapsulado.getId());
		System.out.println("Primeiro nome do empregado: " + umEmpregadoEncapsulado.getPrimeiroNome());
		System.out.println("Sobrenome do empregado: " + umEmpregadoEncapsulado.getSobreNome());
		System.out.println("Salário do empregado: R$" + umEmpregadoEncapsulado.getSalario());
		System.out.println("");
		
		System.out.println("Posição X do botão: " + umBotaoEncapsulado.getPosX());
		System.out.println("Posição Y do botão: " + umBotaoEncapsulado.getPosY());
		System.out.println("Largura do botão: " + umBotaoEncapsulado.getLargura());
		System.out.println("Altura do botão: " + umBotaoEncapsulado.getAltura());
		System.out.println("Texto do botão: " + umBotaoEncapsulado.getTexto());
		System.out.println("Formato do botão: " + umBotaoEncapsulado.getFormato());
	}
}
