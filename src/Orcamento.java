import java.time.LocalDate;
import java.time.LocalDateTime;

public class Orcamento {
	private String cliente;
	private LocalDate data;
	private LocalDateTime hora;
	private int duracao;
	private Evento tipo;

	private int qtdPessoa;
	private int qtdDoce;
	private int qtdSalgado;

	private float valorTotal;

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalDateTime getHora() {
		return hora;
	}

	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}

	public Evento getTipo() {
		return tipo;
	}

	public void setTipo(Evento tipo) {
		this.tipo = tipo;
	}

	public int getQtdPessoa() {
		return qtdPessoa;
	}

	public void setQtdPessoa(int qtdPessoa) {
		this.qtdPessoa = qtdPessoa;
	}

	public int getQtdDoce() {
		return qtdDoce;
	}

	public void setQtdDoce(int qtdDoce) {
		this.qtdDoce = qtdDoce;
	}

	public int getQtdSalgado() {
		return qtdSalgado;
	}

	public void setQtdSalgado(int qtdSalgado) {
		this.qtdSalgado = qtdSalgado;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public void funcaoSalgado() {
		if (getDuracao() > 5) {
			setQtdSalgado(12 * getQtdPessoa());
		} else if (getDuracao() < 4) {
			setQtdSalgado(8 * getQtdPessoa());
		} else
			setQtdSalgado(10 * getQtdPessoa());
	}

}