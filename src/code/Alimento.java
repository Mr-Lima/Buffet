package code;

public class Alimento {
	private String nome;
	private float custo;
	private boolean salgado = false;
	private boolean doce = false;

	public Alimento(String nome, float valor) {
		this.setNome(nome);
		this.setCusto(valor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	public boolean isSalgado() {
		return salgado;
	}

	public void setSalgado(boolean salgado) {
		this.salgado = salgado;
	}

	public boolean isDoce() {
		return doce;
	}

	public void setDoce(boolean doce) {
		this.doce = doce;
	}

}
