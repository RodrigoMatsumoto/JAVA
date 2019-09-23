package tema07_Encapsulamento;

public class LampadaEncapsulada {
	
	private float preco;
	private boolean estaAcesa;
	
	public LampadaEncapsulada() {
		
	}
	
	public LampadaEncapsulada(float umPreco, boolean umaEstaAcesa) {
		
		this.preco = umPreco;
		this.estaAcesa = umaEstaAcesa;
	}
	
	public float getPreco() {
		
		return preco;
	}
	
	public void setPreco(float preco) {
		
		if(preco < 0) {
			System.out.println("O preço não pode ser negativo.");
			
			preco = 0;
		}
		
		this.preco = preco;
	}
	
	public boolean getEstaAcesa() {
		
		return estaAcesa;
	}
	
	public void setEstaAcesa(boolean estaAcesa) {
		
		this.estaAcesa = estaAcesa;
	}
}
