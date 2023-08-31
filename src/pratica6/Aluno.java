package pratica6;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nome;
	private List<Prova> provas;

	public Aluno() {
		this.nome = "";
		this.provas = new ArrayList<>();
	}

	public Aluno(String nome, List<Prova> provas) {
		this.nome = nome;
		this.provas = provas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Prova> getProvas() {
		return provas;
	}

	public void setProvas(List<Prova> provas) {
		this.provas = provas;
	}

	public Double calcularMedia() {
		if (provas.size() == 0)
			return 0.0;
		Double soma = 0.0;
		for (Prova prova : provas) {
			soma += prova.calcularMedia();
		}
		return soma / provas.size();
	}

	public void imprimir() {
		System.out.println("\tNome: " + nome);
		for (Prova prova : provas) {
			prova.imprimir();
		}
		System.out.println("\tMédia: " + calcularMedia());
	}
}
