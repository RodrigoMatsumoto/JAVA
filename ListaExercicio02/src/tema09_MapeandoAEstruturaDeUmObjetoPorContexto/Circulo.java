package tema09_MapeandoAEstruturaDeUmObjetoPorContexto;

public class Circulo {
	
	private float raio;
	
	public Circulo() {
		
	}
	
	public Circulo(float umRaio) {
		
		this.raio = umRaio;
	}

	public float getRaio() {
		
		return raio;
	}

	public void setRaio(float raio) {
		
		this.raio = raio;
	}
	
	public float calcularPerimetroCirculo(float umRaio) {
		
		return (2 * 3.14f * umRaio); 
	}
	
	public float calcularAreaCirculo(float umRaio) {
		
		return (3.14f * umRaio * umRaio);
	}
}

