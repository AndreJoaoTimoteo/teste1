package terc;

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private Integer idade;
	
	public Pessoa(String nome, Integer idade) {
		// TODO Auto-generated constructor stub
		this.setNome(nome);
		this.setIdade(idade);
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Pessoa o) {
		// TODO Auto-generated method stub
		return o.getIdade().compareTo(getIdade());
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

}
