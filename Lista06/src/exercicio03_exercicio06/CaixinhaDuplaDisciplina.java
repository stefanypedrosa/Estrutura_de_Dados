package exercicio03_exercicio06;

public class CaixinhaDuplaDisciplina{
	private Disciplina disciplina;
	private CaixinhaDuplaDisciplina anterior;
	private CaixinhaDuplaDisciplina proximo;
	
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public CaixinhaDuplaDisciplina getAnterior() {
		return anterior;
	}
	public void setAnterior(CaixinhaDuplaDisciplina anterior) {
		this.anterior = anterior;
	}
	public CaixinhaDuplaDisciplina getProximo() {
		return proximo;
	}
	public void setProximo(CaixinhaDuplaDisciplina proximo) {
		this.proximo = proximo;
	}
}
