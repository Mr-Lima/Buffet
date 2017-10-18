package code;
import java.util.HashSet;

public class Cliente {
	private String nome;
	private HashSet<Orcamento> listOrcamento = null;
	private String email;
	private int contato;
	private String cpf;
	
	public Cliente() {
		this.setListOrcamento(new HashSet<Orcamento>());
	}
	
	public Cliente(String nome, String email, int contato, String cpf) {
		this();
		this.setNome(nome);
		this.setEmail(email);
		this.setContato(contato);
		this.setCpf(cpf);
	}

	public HashSet<Orcamento> getListOrcamento() {
		return listOrcamento;
	}

	public void setListOrcamento(HashSet<Orcamento> listOrcamento) {
		this.listOrcamento = listOrcamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getContato() {
		return contato;
	}

	public void setContato(int contato) {
		this.contato = contato;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void addListOrcamento(Orcamento i) {
		this.getListOrcamento().add(i);
	}

}
