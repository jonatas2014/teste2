package lista3;

public class Main {

	public static void main(String[] args) {
		
	Pessoa joao = new Pessoa();
	
	joao.setNome("Joao");
	joao.setIdade(29);
	joao.setAltura(1.88);
	joao.setPeso(78);
	
	System.out.println("Imprimindo com get");
	System.out.println(joao.getNome());
	System.out.println(joao.getIdade());
	System.out.println(joao.getAltura());
	System.out.println(joao.getPeso());
	
	System.out.println("IMC: " + joao.imc());
	
	joao.imprimeDados();
	
			

	}

}
