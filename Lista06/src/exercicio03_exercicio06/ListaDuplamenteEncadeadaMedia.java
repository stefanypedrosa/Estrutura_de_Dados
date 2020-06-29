package exercicio03_exercicio06;

import javax.swing.JOptionPane;

public class ListaDuplamenteEncadeadaMedia {
	private CaixinhaDuplaMedia inicio;
	
	public ListaDuplamenteEncadeadaMedia() {
		this.inicio = null;
	}
	
	public boolean isEmpty() {
		return (this.inicio == null);
	}
	
	public void inserirMedia(Media media) {
		CaixinhaDuplaMedia novo = new CaixinhaDuplaMedia();
		novo.setMedia(media);
		
		if(isEmpty()) {
			novo.setProximo(novo);
			novo.setAnterior(novo);
			inicio = novo;
		}
		else {
			CaixinhaDuplaMedia tmp = inicio;
			while(tmp.getProximo()!=inicio){
				tmp = tmp.getProximo();
			}
			inicio.setAnterior(novo);
			tmp.setProximo(novo);
			novo.setAnterior(tmp);
			novo.setProximo(inicio);
		}
	}
	
	public void exibirMedia() {
		CaixinhaDuplaMedia tmp = inicio;
		String lista = "";
		do {
			lista += "\nAluno "+tmp.getMedia().getIdAluno()+" - Disciplina: "+tmp.getMedia().getIdDisc()+" - Media: "+tmp.getMedia().getMedia();
			tmp = tmp.getProximo();
		}while(tmp != inicio);
		JOptionPane.showMessageDialog(null, lista);
		
	}
	
	public int exibirTamanho() {
		CaixinhaDuplaMedia tmp = inicio;
		int cont = 1;
		while(tmp.getProximo()!=inicio){
			tmp = tmp.getProximo();
			cont++;
		}
		return cont;
	}

	public double[] converteLista() {
		CaixinhaDuplaMedia tmp = inicio;
		int i=0;
		double lista[] = new double[exibirTamanho()];
		do {
			lista[i] = tmp.getMedia().getMedia();
			tmp = tmp.getProximo();
			i++;
		}while(tmp != inicio);
		return lista;
	}
	
	public Media[] enviaLista() {
		CaixinhaDuplaMedia tmp = inicio;
		int i=0;
		Media lista[] = new Media[exibirTamanho()];
		do {
			lista[i] = tmp.getMedia();
			tmp = tmp.getProximo();
			i++;
		}while(tmp != inicio);
		return lista;
	}
	
	public void removerFinal() {
        if(isEmpty()) {
            throw new RuntimeException("Lista Vazia!");
        }
        else {
            CaixinhaDuplaMedia tmp = inicio;
            CaixinhaDuplaMedia ultimo = null;
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
        	CaixinhaDuplaMedia tmp = inicio;
        	CaixinhaDuplaMedia novoInicio = tmp.getProximo();
            novoInicio.setAnterior(tmp.getAnterior());
            while (tmp.getProximo() != inicio) {
                tmp = tmp.getProximo();
            }
            tmp.setProximo(novoInicio);
            inicio = novoInicio;
        }
    }
	
	public void inserirInicio(Media media) {
		CaixinhaDuplaMedia novo = new CaixinhaDuplaMedia();
        novo.setMedia(media);
       
        if(isEmpty()) {
            novo.setProximo(novo);
            novo.setAnterior(novo);
            inicio = novo;
        }
        else {
        	CaixinhaDuplaMedia tmp = inicio;
        	CaixinhaDuplaMedia aux = inicio.getAnterior();
            novo.setProximo(inicio);
            novo.setAnterior(inicio.getAnterior());
            tmp.setAnterior(novo);
            aux.setProximo(novo);
            inicio = novo;
        }
    }
	
	public void reprovadosAprovados() {
		int aprovados=1, reprovados=1;
		double[] lista = converteLista();
		int tamanho = exibirTamanho();
		for(int i=0; i<=tamanho; i++) {
			if(lista[i]>=6) {
				aprovados++;
			}
			else {
				reprovados++;
			}
		}
		JOptionPane.showMessageDialog(null, "Aprovados "+aprovados+"\nReprovados "+reprovados);
	}
}
