public class ListaDuplamenteEncadeada {
	private CaixinhaDupla inicio;
	
	public ListaDuplamenteEncadeada() {
		this.inicio = null;
	}
	
	public boolean isEmpty() {
		return (this.inicio == null);
	}
	
	public void inserirElemento(int elemento) {
		CaixinhaDupla novo = new CaixinhaDupla();
		novo.setElemento(elemento);
		
		if(isEmpty()) {
			novo.setProximo(novo);
			novo.setAnterior(novo);
			inicio = novo;
		}
		else {
			CaixinhaDupla tmp = inicio;
			while(tmp.getProximo()!=inicio){
				tmp = tmp.getProximo();
			}
			inicio.setAnterior(novo);
			tmp.setProximo(novo);
			novo.setAnterior(tmp);
			novo.setProximo(inicio);
		}
	}
	
	public void exibir() {
		CaixinhaDupla tmp = inicio;
		String lista = "Lista Duplamente encadeada\n";
		do {
			lista += tmp.getElemento()+"\n";
			tmp = tmp.getProximo();
		}while(tmp != inicio);
		System.out.println(lista);
		
	}

	public void removerFinal() {
        if(isEmpty()) {
            throw new RuntimeException("Lista Vazia!");
        }
        else {
            CaixinhaDupla tmp = inicio;
            CaixinhaDupla ultimo = null;
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
            CaixinhaDupla tmp = inicio;
            CaixinhaDupla novoInicio = tmp.getProximo();
            novoInicio.setAnterior(tmp.getAnterior());
            while (tmp.getProximo() != inicio) {
                tmp = tmp.getProximo();
            }
            tmp.setProximo(novoInicio);
            inicio = novoInicio;
        }
    }
	
	public void inserirInicio(int elemento) {
        CaixinhaDupla novo = new CaixinhaDupla();
        novo.setElemento(elemento);
       
        if(isEmpty()) {
            novo.setProximo(novo);
            novo.setAnterior(novo);
            inicio = novo;
        }
        else {
            CaixinhaDupla tmp = inicio;
            CaixinhaDupla aux = inicio.getAnterior();
            novo.setProximo(inicio);
            novo.setAnterior(inicio.getAnterior());
            tmp.setAnterior(novo);
            aux.setProximo(novo);
            inicio = novo;
        }
    }
	public int exibirTamanho() {
		CaixinhaDupla tmp = inicio;
		int cont = 1;
		while(tmp.getProximo()!=inicio){
			tmp = tmp.getProximo();
			cont++;
		}
		return cont;
	}

	public int[] converteLista() {
		CaixinhaDupla tmp = inicio;
		int i=0;
		int lista[] = new int[exibirTamanho()];
		do {
			lista[i] = tmp.getElemento();
			tmp = tmp.getProximo();
			i++;
		}while(tmp != inicio);
		return lista;
	}
}
