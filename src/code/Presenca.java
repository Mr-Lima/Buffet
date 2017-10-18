package code;

import java.time.LocalDateTime;

public class Presenca {
	private LocalDateTime dia = LocalDateTime.now();
	private LocalDateTime entrada, saida;
	private LocalDateTime padraoEntrada = LocalDateTime.now().withHour(8).withMinute(16);
	
	private boolean presente = false,atrasado = false;
	
	public Presenca(LocalDateTime entrada, LocalDateTime saida) {
		this.setEntrada(entrada);
		this.setSaida(saida);
	}
	
	public LocalDateTime getPadraoEntrada() {
		return padraoEntrada;
	}

	public void setPadraoEntrada(LocalDateTime padraoEntrada) {
		this.padraoEntrada = padraoEntrada;
	}


	public LocalDateTime getSaida() {
		return saida;
	}

	public void setSaida(LocalDateTime saida) {
		this.saida = saida;
	}

	public LocalDateTime getEntrada() {
		return entrada;
	}

	public void setEntrada(LocalDateTime entrada) {
		this.entrada = entrada;
	}

	public boolean isPresente() {
		return presente;
	}

	public boolean isAtrasado() {
		return atrasado;
	}

	public void setAtrasado(boolean atrasado) {
		this.atrasado = atrasado;
	}

	public void setPresente(boolean isPresente) {
		this.presente = isPresente;
	}

	public LocalDateTime getDia() {
		return dia;
	}
	
	public void falta_atrasado(LocalDateTime entrada) {
		if(this.getEntrada().isBefore(getPadraoEntrada())) {
			this.setPresente(true);
		} else if(this.getEntrada().isAfter(getPadraoEntrada())) {
			this.setPresente(true);
			this.setAtrasado(true);
		}
	}
	
}
