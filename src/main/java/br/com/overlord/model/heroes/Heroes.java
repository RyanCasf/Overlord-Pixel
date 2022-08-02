package br.com.overlord.model.heroes;

public class Heroes {
	
	private String nome;
	private String caminhoImagem;

	public Heroes(String nome, String caminhoImagem) {
		this.nome = nome;
		this.caminhoImagem = caminhoImagem;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaminhoImagem() {
		return caminhoImagem;
	}

	public void setCaminhoImagem(String caminhoImagem) {
		this.caminhoImagem = caminhoImagem;
	}
}