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
		
		System.out.println("Digite o pre�o da l�mpada: ");
		lampadaEncapsulada.setPreco(scanner.nextFloat());
		System.out.println("A l�mpada est� acesa? ");
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
		System.out.println("Digite o sal�rio do empregado: ");
		empregadoEncapsulado.setSalario(scanner.nextFloat());
		System.out.println("");
		
		return empregadoEncapsulado;
	}
	
	public BotaoEncapsulado criarBotaoEncapsulado() {
		
		System.out.println("Digite a posi��o X do bot�o: ");
		botaoEncapsulado.setPosX(scanner.nextFloat());
		System.out.println("Digite a posi��o Y do bot�o: ");
		botaoEncapsulado.setPosY(scanner.nextFloat());
		System.out.println("Digite a largura do bot�o: ");
		botaoEncapsulado.setLargura(scanner.nextFloat());
		System.out.println("Digite a altura do bot�o: ");
		botaoEncapsulado.setAltura(scanner.nextFloat());
		System.out.println("Digite o texto do bot�o: ");
		botaoEncapsulado.setTexto(scanner.next());
		System.out.println("Digite o formato do bot�o: ");
		botaoEncapsulado.setFormato(scanner.nextInt());
		
		return botaoEncapsulado;
	}
	
	public void imprimir(LampadaEncapsulada umaLampadaEncapsulada, EmpregadoEncapsulado umEmpregadoEncapsulado, BotaoEncapsulado umBotaoEncapsulado) {
		
		System.out.println("Pre�o da l�mpada: R$" + umaLampadaEncapsulada.getPreco());
		System.out.println("L�mpada acesa? " + umaLampadaEncapsulada.getEstaAcesa());
		System.out.println("");
		
		System.out.println("ID do empregado: " + umEmpregadoEncapsulado.getId());
		System.out.println("Primeiro nome do empregado: " + umEmpregadoEncapsulado.getPrimeiroNome());
		System.out.println("Sobrenome do empregado: " + umEmpregadoEncapsulado.getSobreNome());
		System.out.println("Sal�rio do empregado: R$" + umEmpregadoEncapsulado.getSalario());
		System.out.println("");
		
		System.out.println("Posi��o X do bot�o: " + umBotaoEncapsulado.getPosX());
		System.out.println("Posi��o Y do bot�o: " + umBotaoEncapsulado.getPosY());
		System.out.println("Largura do bot�o: " + umBotaoEncapsulado.getLargura());
		System.out.println("Altura do bot�o: " + umBotaoEncapsulado.getAltura());
		System.out.println("Texto do bot�o: " + umBotaoEncapsulado.getTexto());
		System.out.println("Formato do bot�o: " + umBotaoEncapsulado.getFormato());
	}
}