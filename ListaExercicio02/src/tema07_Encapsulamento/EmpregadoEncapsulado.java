package tema07_Encapsulamento;

public class EmpregadoEncapsulado {

	private int id;
	private String primeiroNome;
	private String sobreNome;
	private float salario;
	
	public EmpregadoEncapsulado() {
		
	}
	
	public EmpregadoEncapsulado(int umId, String umPrimeiroNome, String umSobreNome, float umSalario) {
		
		this.id = umId;
		this.primeiroNome = umPrimeiroNome;
		this.sobreNome = umSobreNome;
		this.salario = umSalario;
	}
	
	public int getId() {
		
		return id;
	}
	
	public void setId(int id) {
		
		if(id < 0) {
			System.out.println("O ID não pode ser negativo.");
			
			id = 0;
		}
		
		this.id = id;
	}
	
	public String getPrimeiroNome() {
		
		return primeiroNome;
	}
	
	public void setPrimeiroNome(String primeiroNome) {
		
		this.primeiroNome = primeiroNome;
	}
	
	public String getSobreNome() {
		
		return sobreNome;
	}
	
	public void setSobreNome(String sobreNome) {
		
		this.sobreNome = sobreNome;
	}
	
	public float getSalario() {
		
		return salario;
	}
	
	public void setSalario(float salario) {
		
		if(salario < 0) {
			System.out.println("O salário não pode ser negativo.");
			
			salario = 0;
		}
		
		this.salario = salario;
	}
}
