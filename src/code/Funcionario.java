package code;

import java.time.LocalDate;
import java.util.LinkedHashSet;

public class Funcionario {
	private String nome;
	private String cpf;
	private String contato;
	private String usuario;
	private String senha;
	
	private float salario;
	private LocalDate diaPagamento;
	private LinkedHashSet<Presenca> list_de_presenca = null;
	
	public Funcionario(){
		list_de_presenca = new LinkedHashSet<Presenca>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public LocalDate getDiaPagamento() {
		return diaPagamento;
	}

	public void setDiaPagamento(LocalDate diaPagamento) {
		this.diaPagamento = diaPagamento;
	}

	public LinkedHashSet<Presenca> getList_de_presenca() {
		return list_de_presenca;
	}

	public void setList_de_presenca(LinkedHashSet<Presenca> list_de_presenca) {
		this.list_de_presenca = list_de_presenca;
	}
	
	public void AddList_de_presenca(Presenca x) {
		this.getList_de_presenca().add(x);
	}
}
