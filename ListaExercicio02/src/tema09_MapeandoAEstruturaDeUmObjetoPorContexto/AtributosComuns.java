package tema09_MapeandoAEstruturaDeUmObjetoPorContexto;

public class AtributosComuns {
	
	private String cor;
	private float posicaoX;
	private float posicaoY;
	
	public AtributosComuns() {
		
	}
	
	public AtributosComuns(String umaCor, float umaPosicaoX, float umaPosicaoY) {
		this.cor = umaCor;
		this.posicaoX = umaPosicaoX;
		this.posicaoY = umaPosicaoY;
	}

	public String getCor() {
		
		return cor;
	}

	public void setCor(String cor) {
		
		this.cor = cor;
	}

	public float getPosicaoX() {
		
		return posicaoX;
	}

	public void setPosicaoX(float posicaoX) {
		
		this.posicaoX = posicaoX;
	}

	public float getPosicaoY() {
		
		return posicaoY;
	}

	public void setPosicaoY(float posicaoY) {
		
		this.posicaoY = posicaoY;
	}
}
