package com.primeiroprojeto;

public class PessoaBean {
	
	private String nome;
	private String sobrenome;
	
	public PessoaBean() {
		
	}
	
	public PessoaBean(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	@Override
	public String toString() {
		return "PessoaBean [nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}
	
	

}
