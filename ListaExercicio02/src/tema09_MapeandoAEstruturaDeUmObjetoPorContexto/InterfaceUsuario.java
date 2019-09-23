package tema09_MapeandoAEstruturaDeUmObjetoPorContexto;

import java.util.Scanner;

public class InterfaceUsuario {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		teste();
	}
	
	public static void teste() {
		
		opcaoCriacao();
	}
	
	public static void opcaoCriacao() {
		
		char opcao;
		
		System.out.println("Deseja criar um C�rculo(C) ou um Ret�ngulo(R)? ");
		opcao = scanner.next().charAt(0);
		
		while(opcao != 'c' && opcao != 'C' && opcao != 'r' && opcao != 'R') {
			System.out.println("Deseja criar um C�rculo(C) ou um Ret�ngulo(R)? ");
			opcao = scanner.next().charAt(0);
		}
		
		switch(opcao) {
			case 'c':
				imprimirCirculo(criarAtributosComuns(), criarCirculo());
				break;
			case 'C':
				imprimirCirculo(criarAtributosComuns(), criarCirculo());
				break;
			case 'r':
				imprimirRetangulo(criarAtributosComuns(), criarRetangulo());
				break;
			case 'R':
				imprimirRetangulo(criarAtributosComuns(), criarRetangulo());
				break;
		}
	}
	
	public static Circulo criarCirculo() {
		
		Circulo circuloCriado = new Circulo();
		
		System.out.println("Digite o raio do c�rculo: ");
		float raio = scanner.nextFloat();
		circuloCriado.setRaio(raio);
		
		return circuloCriado;
	}
	
	public static Retangulo criarRetangulo() {
		
		Retangulo retanguloCriado = new Retangulo();
		
		System.out.println("Digite a largura do ret�ngulo: ");
		float largura = scanner.nextFloat();
		retanguloCriado.setLargura(largura);
		
		System.out.println("Digite a altura do ret�ngulo: ");
		float altura = scanner.nextFloat();
		retanguloCriado.setAltura(altura);
		
		return retanguloCriado;
	}
	
	public static AtributosComuns criarAtributosComuns() {
		
		AtributosComuns atributosComunsCriados = new AtributosComuns();
		
		System.out.println("Digite a cor: ");
		String cor = scanner.next();
		atributosComunsCriados.setCor(cor);
		
		System.out.println("Digite a posi��o X: ");
		float posicaoX = scanner.nextFloat();
		atributosComunsCriados.setPosicaoX(posicaoX);
		
		System.out.println("Digite a posi��o Y: ");
		float posicaoY = scanner.nextFloat();
		atributosComunsCriados.setPosicaoY(posicaoY);
		
		return atributosComunsCriados;
	}
	
	public static void imprimirCirculo(AtributosComuns umAtributosComuns, Circulo umCirculo) {
		
		System.out.println("");
		System.out.println("Cor: " + umAtributosComuns.getCor());
		System.out.println("Posi��o X: " + umAtributosComuns.getPosicaoX());
		System.out.println("Posi��o Y: " + umAtributosComuns.getPosicaoY());
		System.out.println("Raio: " + umCirculo.getRaio());
		System.out.println("Per�metro do c�rculo: " + umCirculo.calcularPerimetroCirculo(umCirculo.getRaio()));
		System.out.println("�rea do c�rculo: " + umCirculo.calcularAreaCirculo(umCirculo.getRaio()));
		System.out.println("");
	}
	
	public static void imprimirRetangulo(AtributosComuns umAtributosComuns, Retangulo umRetangulo) {
		
		System.out.println("");
		System.out.println("Cor: " + umAtributosComuns.getCor());
		System.out.println("Posi��o X: " + umAtributosComuns.getPosicaoX());
		System.out.println("Posi��o Y: " + umAtributosComuns.getPosicaoY());
		System.out.println("Largura: " + umRetangulo.getLargura());
		System.out.println("Altura: " + umRetangulo.getAltura());
		System.out.println("Per�metro do ret�ngulo: " + umRetangulo.calcularPerimetroRetangulo(umRetangulo.getLargura(), umRetangulo.getAltura()));
		System.out.println("�rea do ret�ngulo: " + umRetangulo.calcularAreaRetangulo(umRetangulo.getLargura(), umRetangulo.getAltura()));
		System.out.println("");
	}
}
