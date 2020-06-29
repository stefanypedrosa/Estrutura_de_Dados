package exercicio03_exercicio06;

import javax.swing.JOptionPane;

public class ListaDuplamenteEncadeadaAluno {
	private CaixinhaDuplaAluno inicio;
	
	public ListaDuplamenteEncadeadaAluno() {
		this.inicio = null;
	}
	
	public boolean isEmpty() {
		return (this.inicio == null);
	}
	
	public void inserirAluno(Aluno aluno) {
		CaixinhaDuplaAluno novo = new CaixinhaDuplaAluno();
		novo.setAluno(aluno);
		
		if(isEmpty()) {
			novo.setProximo(novo);
			novo.setAnterior(novo);
			inicio = novo;
		}
		else {
			CaixinhaDuplaAluno tmp = inicio;
			while(tmp.getProximo()!=inicio){
				tmp = tmp.getProximo();
			}
			inicio.setAnterior(novo);
			tmp.setProximo(novo);
			novo.setAnterior(tmp);
			novo.setProximo(inicio);
		}
	}
	
	public void exibirAluno() {
		CaixinhaDuplaAluno tmp = inicio;
		String lista = "";
		do {
			lista += "\nAluno "+tmp.getAluno().getIdAluno()+"\n"+tmp.getAluno().getNome()+" - "+tmp.getAluno().getCurso()+" - "+tmp.getAluno().getSemestre();
			tmp = tmp.getProximo();
		}while(tmp != inicio);
		JOptionPane.showMessageDialog(null, lista);
		
	}

	public void removerFinal() {
        if(isEmpty()) {
            throw new RuntimeException("Lista Vazia!");
        }
        else {
            CaixinhaDuplaAluno tmp = inicio;
            CaixinhaDuplaAluno ultimo = null;
            while (tmp.getProximo() != inicio) {
                tmp = tmp.getProximo();
                ultimo = tmp.getAnterior();
            }
           
            inicio.setAnterior(ultimo);
            ultimo.setProximo(inicio);
           
        }
    }
	
	public void removerInicio() {
        if(isEmpty()) {
            throw new RuntimeException("Lista Vazia!");
        }
        else {
            CaixinhaDuplaAluno tmp = inicio;
            CaixinhaDuplaAluno novoInicio = tmp.getProximo();
            novoInicio.setAnterior(tmp.getAnterior());
            while (tmp.getProximo() != inicio) {
                tmp = tmp.getProximo();
            }
            tmp.setProximo(novoInicio);
            inicio = novoInicio;
        }
    }
	
	public void inserirInicio(Aluno aluno) {
        CaixinhaDuplaAluno novo = new CaixinhaDuplaAluno();
        novo.setAluno(aluno);
       
        if(isEmpty()) {
            novo.setProximo(novo);
            novo.setAnterior(novo);
            inicio = novo;
        }
        else {
            CaixinhaDuplaAluno tmp = inicio;
            CaixinhaDuplaAluno aux = inicio.getAnterior();
            novo.setProximo(inicio);
            novo.setAnterior(inicio.getAnterior());
            tmp.setAnterior(novo);
            aux.setProximo(novo);
            inicio = novo;
        }
    }
	
	
}
