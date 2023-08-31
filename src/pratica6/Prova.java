package pratica6;

public class Prova {
	private Double nota1;
	private Double nota2;

	public Prova() {
		this.nota1 = 0.0;
		this.nota2 = 0.0;
	}

	public Prova(Double nota1, Double nota2) {
		if (nota1 >= 10) {
			this.nota1 = 10.0;
		} else if (nota1 <= 0) {
			this.nota1 = 0.0;
		} else {
			this.nota1 = nota1;
		}

		if (nota2 >= 10) {
			this.nota2 = 10.0;
		} else if (nota2 <= 0) {
			this.nota2 = 0.0;
		} else {
			this.nota2 = nota2;
		}
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		if (nota1 >= 10) {
			this.nota1 = 10.0;
		} else if (nota1 <= 0) {
			this.nota1 = 0.0;
		} else {
			this.nota1 = nota1;
		}
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		if (nota2 >= 10) {
			this.nota2 = 10.0;
		} else if (nota2 <= 0) {
			this.nota2 = 0.0;
		} else {
			this.nota2 = nota2;
		}
	}

	public Double calcularMedia() {
		if (getNota1() == null || getNota2() == null)
			return 0.0;
		return (getNota1() + getNota2()) / 2.0;
	}

	public void imprimir() {
		System.out.println(
				"\t\tNota 1 = " + nota1 + "; Nota 2 = " + nota2 + "; Média = " + String.format("%.2f", calcularMedia()));
	}
}
