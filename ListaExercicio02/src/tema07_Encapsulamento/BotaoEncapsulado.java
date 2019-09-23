package tema07_Encapsulamento;

public class BotaoEncapsulado {

	private float posX;
	private float posY;
	private float largura;
	private float altura;
	private String texto;
	private int formato;
	
	public BotaoEncapsulado() {
		
	}
	
	public BotaoEncapsulado(float umaPosX, float umaPosY, float umaLargura, float umaAltura, String umTexto, int umFormato) {
		
		this.posX = umaPosX;
		this.posY = umaPosY;
		this.largura = umaLargura;
		this.altura = umaAltura;
		this.texto = umTexto;
		this.formato = umFormato;
	}
	
	public float getPosX() {
		
		return posX;
	}
	
	public void setPosX(float posX) {
		
		if(posX < 0) {
			System.out.println("A posição X não pode ser negativa.");
			
			posX = 0;
		}
		
		this.posX = posX;
	}
	
	public float getPosY() {
		
		return posY;
	}
	
	public void setPosY(float posY) {
		
		if(posY < 0) {
			System.out.println("A posição Y não pode ser negativa.");
			
			posY = 0;
		}
		
		this.posY = posY;
	}
	
	public float getLargura() {
		
		return largura;
	}
	
	public void setLargura(float largura) {
		
		if(largura < 0) {
			System.out.println("A largura não pode ser negativa.");
			
			largura = 0;
		}
		
		this.largura = largura;
	}
	
	public float getAltura() {
		
		return altura;
	}
	
	public void setAltura(float altura) {
		
		if(altura < 0) {
			System.out.println("A altura não pode ser negativa.");
			
			altura = 0;
		}
		
		this.altura = altura;
	}
	
	public String getTexto() {
		
		return texto;
	}
	
	public void setTexto(String texto) {
		
		this.texto = texto;
	}
	
	public int getFormato() {
		
		return formato;
	}
	
	public void setFormato(int formato) {
		
		if(formato < 0) {
			System.out.println("O formato não pode ser negativo.");
			
			formato = 0;
		}
		
		this.formato = formato;
	}
}
