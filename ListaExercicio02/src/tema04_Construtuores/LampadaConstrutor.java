package tema04_Construtuores;

public class LampadaConstrutor {

	public float preco;
	public boolean estaAcesa;
	
	public LampadaConstrutor(){
		
	}
	
	public LampadaConstrutor(float umPreco, boolean umaEstaAcesa){
		
		this.preco = umPreco;
		this.estaAcesa = umaEstaAcesa;
	}
}
