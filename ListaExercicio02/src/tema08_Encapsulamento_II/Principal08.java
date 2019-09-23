package tema08_Encapsulamento_II;

import java.util.Scanner;
import tema07_Encapsulamento.BotaoEncapsulado;
import tema07_Encapsulamento.EmpregadoEncapsulado;
import tema07_Encapsulamento.LampadaEncapsulada;

public class Principal08 {

	public LampadaEncapsulada lampadaEncapsulada = new LampadaEncapsulada();
	public EmpregadoEncapsulado empregadoEncapsulado = new EmpregadoEncapsulado();
	public BotaoEncapsulado botaoEncapsulado = new BotaoEncapsulado();
	
	public static Scanner scanner = new Scanner(System.in);
	
	public Principal08() {
		
	}
	
	public Principal08(LampadaEncapsulada umaLampadaEncapsulada, EmpregadoEncapsulado umEmpregadoEncapsulado, BotaoEncapsulado umBotaoEncapsulado) {
		
		this.lampadaEncapsulada = umaLampadaEncapsulada;
		this.empregadoEncapsulado = umEmpregadoEncapsulado;
		this.botaoEncapsulado = umBotaoEncapsulado;
	}
	
	public static void main(String[] args) {

		Principal08 principal08 = new Principal08();
		principal08.testeEncapsulado();
	}

	public void testeEncapsulado() {
		
		Principal08 principal = new Principal08(lampadaEncapsulada, empregadoEncapsulado, botaoEncapsulado);
		
		lampadaEncapsulada = criarLampadaEncapsulada();
		empregadoEncapsulado = criarEmpregadoEncapsulado();
		botaoEncapsulado = criarBotaoEncapsulado();
		
		principal.imprimir(lampadaEncapsulada, empregadoEncapsulado, botaoEncapsulado);
	}
	
	public LampadaEncapsulada criarLampadaEncapsulada() {
		
		System.out.println("Digite o preço da lâmpada: ");
		lampadaEncapsulada.setPreco(scanner.nextFloat());
		System.out.println("A lâmpada está acesa? ");
		lampadaEncapsulada.setEstaAcesa(scanner.nextBoolean());
		System.out.println("");
		
		return lampadaEncapsulada;
	}
	
	public EmpregadoEncapsulado criarEmpregadoEncapsulado() {
		
		System.out.println("Digite o ID do empregado: ");
		empregadoEncapsulado.setId(scanner.nextInt());
		System.out.println("Digite o primeiro nome do empregado: ");
		empregadoEncapsulado.setPrimeiroNome(scanner.next());
		System.out.println("Digite o sobrenome do empregado: ");
		empregadoEncapsulado.setSobreNome(scanner.next());
		System.out.println("Digite o salário do empregado: ");
		empregadoEncapsulado.setSalario(scanner.nextFloat());
		System.out.println("");
		
		return empregadoEncapsulado;
	}
	
	public BotaoEncapsulado criarBotaoEncapsulado() {
		
		System.out.println("Digite a posição X do botão: ");
		botaoEncapsulado.setPosX(scanner.nextFloat());
		System.out.println("Digite a posição Y do botão: ");
		botaoEncapsulado.setPosY(scanner.nextFloat());
		System.out.println("Digite a largura do botão: ");
		botaoEncapsulado.setLargura(scanner.nextFloat());
		System.out.println("Digite a altura do botão: ");
		botaoEncapsulado.setAltura(scanner.nextFloat());
		System.out.println("Digite o texto do botão: ");
		botaoEncapsulado.setTexto(scanner.next());
		System.out.println("Digite o formato do botão: ");
		botaoEncapsulado.setFormato(scanner.nextInt());
		
		return botaoEncapsulado;
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