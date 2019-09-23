package tema09_MapeandoAEstruturaDeUmObjetoPorContexto;

public class Retangulo {

	private float largura;
	private float altura;
	
	public Retangulo() {
		
	}
	
	public Retangulo(float umaLargura, float umaAltura) {
		
		this.largura = umaLargura;
		this.altura = umaAltura;
	}

	public float getLargura() {
		
		return largura;
	}

	public void setLargura(float largura) {
		
		this.largura = largura;
	}

	public float getAltura() {
		
		return altura;
	}

	public void setAltura(float altura) {
		
		this.altura = altura;
	}
	
	public float calcularPerimetroRetangulo(float umaLargura, float umaAltura) {
		
		return ((2 * umaLargura) + (2 * umaAltura));
	}
	
	public float calcularAreaRetangulo(float umaLargura, float umaAltura) {
		
		return (umaLargura * umaAltura);
	}
}
