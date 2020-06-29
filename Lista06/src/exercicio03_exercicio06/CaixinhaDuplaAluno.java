package exercicio03_exercicio06;

public class CaixinhaDuplaAluno{
	private Aluno aluno;
	private CaixinhaDuplaAluno anterior;
	private CaixinhaDuplaAluno proximo;
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public CaixinhaDuplaAluno getAnterior() {
		return anterior;
	}
	public void setAnterior(CaixinhaDuplaAluno anterior) {
		this.anterior = anterior;
	}
	public CaixinhaDuplaAluno getProximo() {
		return proximo;
	}
	public void setProximo(CaixinhaDuplaAluno proximo) {
		this.proximo = proximo;
	}
}
