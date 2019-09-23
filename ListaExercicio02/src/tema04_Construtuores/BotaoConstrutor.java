package tema04_Construtuores;

public class BotaoConstrutor {

	public float posX;
	public float posY;
	public float largura;
	public float altura;
	public String texto;
	public int formato;
	
	public BotaoConstrutor() {
		
	}
	
	public BotaoConstrutor(float umaPosX, float umaPosY, float umaLargura, float umaAltura, String umTexto, int umFormato) {
		
		this.posX = umaPosX;
		this.posY = umaPosY;
		this.largura = umaLargura;
		this.altura = umaAltura;
		this.texto = umTexto;
		this.formato = umFormato;
	}
}
