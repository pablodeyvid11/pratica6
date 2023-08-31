package pratica6;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private List<Aluno> alunos;

	public Turma() {
		this.alunos = new ArrayList<>();
	}

	public Turma(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Double calcularMedia() {
		if (alunos.size() == 0)
			return 0.0;
		Double soma = 0.0;
		for (Aluno aluno : alunos) {
			soma += aluno.calcularMedia();
		}
		return soma / alunos.size();
	}

	public void imprimir() {
		System.out.println("Turma");
		for (Aluno aluno : alunos) {
			aluno.imprimir();
		}
		System.out.println("Média: " + calcularMedia());
	}
}
