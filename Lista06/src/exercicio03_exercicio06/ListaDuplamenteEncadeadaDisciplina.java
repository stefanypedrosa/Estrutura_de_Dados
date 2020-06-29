package exercicio03_exercicio06;

import javax.swing.JOptionPane;

public class ListaDuplamenteEncadeadaDisciplina {
	private CaixinhaDuplaDisciplina inicio;
	
	public ListaDuplamenteEncadeadaDisciplina() {
		this.inicio = null;
	}
	
	public boolean isEmpty() {
		return (this.inicio == null);
	}
	
	public void inserirDisciplina(Disciplina disciplina) {
		CaixinhaDuplaDisciplina novo = new CaixinhaDuplaDisciplina();
		novo.setDisciplina(disciplina);
		
		if(isEmpty()) {
			novo.setProximo(novo);
			novo.setAnterior(novo);
			inicio = novo;
		}
		else {
			CaixinhaDuplaDisciplina tmp = inicio;
			while(tmp.getProximo()!=inicio){
				tmp = tmp.getProximo();
			}
			inicio.setAnterior(novo);
			tmp.setProximo(novo);
			novo.setAnterior(tmp);
			novo.setProximo(inicio);
		}
	}
	
	public void exibirDisciplina() {
		CaixinhaDuplaDisciplina tmp = inicio;
		String lista = "";
		do {
			lista += "\nDisciplina "+tmp.getDisciplina().getIdDisc()+": "+tmp.getDisciplina().getNome();
			tmp = tmp.getProximo();
		}while(tmp != inicio);
		JOptionPane.showMessageDialog(null, lista);
		
	}

	public void removerFinal() {
        if(isEmpty()) {
            throw new RuntimeException("Lista Vazia!");
        }
        else {
            CaixinhaDuplaDisciplina tmp = inicio;
            CaixinhaDuplaDisciplina ultimo = null;
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
        	CaixinhaDuplaDisciplina tmp = inicio;
        	CaixinhaDuplaDisciplina novoInicio = tmp.getProximo();
            novoInicio.setAnterior(tmp.getAnterior());
            while (tmp.getProximo() != inicio) {
                tmp = tmp.getProximo();
            }
            tmp.setProximo(novoInicio);
            inicio = novoInicio;
        }
    }
	
	public void inserirInicio(Disciplina disciplina) {
		CaixinhaDuplaDisciplina novo = new CaixinhaDuplaDisciplina();
        novo.setDisciplina(disciplina);
       
        if(isEmpty()) {
            novo.setProximo(novo);
            novo.setAnterior(novo);
            inicio = novo;
        }
        else {
        	CaixinhaDuplaDisciplina tmp = inicio;
            CaixinhaDuplaDisciplina aux = inicio.getAnterior();
            novo.setProximo(inicio);
            novo.setAnterior(inicio.getAnterior());
            tmp.setAnterior(novo);
            aux.setProximo(novo);
            inicio = novo;
        }
    }
}
