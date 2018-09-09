package lista3;

public class Pessoa {
	
	private String nome;
	private Integer idade;
	private double altura;
	private double peso;
	
	Pessoa(){
		
	}
	Pessoa(String umNome,Integer umaIdade,double umaAltura, double umPeso ){
		nome = umNome;
		idade = umaIdade;
		altura = umaAltura;
		peso = umPeso;
	}
	
	String getNome() {
		return nome;
	}
	Integer getIdade() {
		return idade;
	}
	double getAltura() {
		return altura;
		
	}
	double getPeso() {
		return peso;
	}
	void setNome(String aNome) {
		nome = aNome;
	}
	void setIdade(Integer aIdade) {
		idade = aIdade;
	}
	void setAltura(double aAltura) {
		altura = aAltura;
		
	}
	void setPeso(double aPeso) {
		peso = aPeso;
	}
	
	double imc() {
		return (peso/Math.pow(altura, 2));
	}
	
	
	void imprimeDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Peso" + peso);
	}
	

}
