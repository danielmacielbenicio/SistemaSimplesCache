package cachePessoa;

public class Pessoa {

	private int id;
	private String nome;
	private int idade;
	
	public Pessoa(int id,String nome,int idade) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setId(int id) {
		this.id = id;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + "]";
	}
	
}
