package br.com.fiap.Model;

public class Editora {

	private int Id;
	
	private String Nome;
	
	private String NomeFantasia;
	
	private String Cpnj;
	
	private String Endere�o;
	
	private String Email;

	public Editora(int id, String nome, String nomeFantasia, String cpnj, String endere�o, String email) {
		super();
		this.Id = id;
		Nome = nome;
		NomeFantasia = nomeFantasia;
		Cpnj = cpnj;
		Endere�o = endere�o;
		Email = email;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getNomeFantasia() {
		return NomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		NomeFantasia = nomeFantasia;
	}

	public String getCpnj() {
		return Cpnj;
	}

	public void setCpnj(String cpnj) {
		Cpnj = cpnj;
	}

	public String getEndere�o() {
		return Endere�o;
	}

	public void setEndere�o(String endere�o) {
		Endere�o = endere�o;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	
}
