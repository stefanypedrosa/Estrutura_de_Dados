package exercicio03_exercicio06;

public class Aluno {
	int idAluno;
	String nome;
	String curso;
	int semestre;
	
	public Aluno(int idAluno, String nome, String curso, int semestre) {
		this.idAluno = idAluno;
		this.nome = nome;
		this.curso = curso;
		this.semestre = semestre;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	
}
