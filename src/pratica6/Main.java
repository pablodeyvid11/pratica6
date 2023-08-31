package pratica6;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		// GIOVANNA
		Prova gioP1 = new Prova(10.0, 10.0);
		Prova gioP2 = new Prova(8.0, 9.0);

		List<Prova> provasGio = new ArrayList<>();
		provasGio.add(gioP1);
		provasGio.add(gioP2);

		Aluno giovanna = new Aluno("Giovanna", provasGio);

		// BRUNO
		Prova brunoP1 = new Prova(7.5, 9.5);
		Prova brunoP2 = new Prova(5.9, 8.3);

		List<Prova> provasBruno = new ArrayList<>();
		provasBruno.add(brunoP1);
		provasBruno.add(brunoP2);

		Aluno bruno = new Aluno("Bruno", provasBruno);

		// BRUNO
		Prova pabloP1 = new Prova(5.4, 10.0);
		Prova pabloP2 = new Prova(8.7, 8.8);

		List<Prova> provasPablo = new ArrayList<>();
		provasPablo.add(pabloP1);
		provasPablo.add(pabloP2);

		Aluno pablo = new Aluno("Pablo", provasPablo);

		// Turma

		List<Aluno> alunos = new ArrayList<>();
		alunos.add(giovanna);
		alunos.add(bruno);
		alunos.add(pablo);

		Turma turma = new Turma(alunos);

		turma.imprimir();
	}
}
