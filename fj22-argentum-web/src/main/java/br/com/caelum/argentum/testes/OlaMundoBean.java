package br.com.caelum.argentum.testes;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaMundoBean {
	private String mensagem = "Quem � voc�?";
	private String nome;

	public void nomeFoiDigitado() {
		System.out.println("\nChamou o bot�o");
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
