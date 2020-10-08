package cadastrocliente;

public class pessoas {
private int id;
	private String nome;
	private float cpf;
	private String endereco;
	private String cidade;
	private String estado;
	
	public pessoas(String nome, float cpf, String endereco, String cidade, String estado) {
			this.nome = nome;
			this.cpf = cpf;
			this.endereco = endereco;
			this.cidade = cidade;
			this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getCpf() {
		return cpf;
	}

	public void setCpf(float cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}