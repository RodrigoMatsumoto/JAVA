package tema04_Construtuores;

public class EmpregadoConstrutor {

	public int id;
	public String primeiroNome;
	public String sobreNome;
	public float salario;
	
	public EmpregadoConstrutor() {
		
	}
	
	public EmpregadoConstrutor(int umId, String umPrimeiroNome, String umSobreNome, float umSalario) {
		
		this.id = umId;
		this.primeiroNome = umPrimeiroNome;
		this.sobreNome = umSobreNome;
		this.salario = umSalario;
	}
}
