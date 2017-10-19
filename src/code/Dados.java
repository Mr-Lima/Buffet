package code;

import java.util.HashSet;

public class Dados {
	private HashSet<Funcionario> list_Funcionario = null;
	private HashSet<Orcamento> list_Orcamento = null;
	
	public Dados() {
		list_Funcionario = new HashSet<Funcionario>();
		list_Orcamento = new HashSet<Orcamento>();
	}
	
	public void AddFuncionario(Funcionario x) {
		this.list_Funcionario.add(x);
	}
	
	public void AddOrcamento(Orcamento x) {
		this.list_Orcamento.add(x);
	}
	
	public void clearFuncionario() {
		this.list_Funcionario.clear();
	}
	
	public void clearOrcamento() {
		this.list_Orcamento.clear();
	}
	
	public boolean removeFuncionario(Funcionario x) {
		if(this.list_Funcionario.contains(x)) {
			this.list_Funcionario.remove(x);
			return true;
		}else 
			return false;
	}
	
	public boolean removeOrcamento(Orcamento x) {
		if(this.list_Orcamento.contains(x)) {
			this.list_Orcamento.remove(x);
			return true;
		}else
			return false;
	}
	
}
