package exercicio03_exercicio06;

import javax.swing.JOptionPane;

public class QuickSort {

	public void executar(double lista[], int tamanho){
		double lista1[]=new double[tamanho];
		double lista2[]=new double[tamanho];
		double lista3[]=new double[tamanho];

		for(int i=0;i<tamanho;i++) {
			lista1[i]=lista[i];
			lista2[i]=lista[i];
			lista3[i]=lista[i];
		}

		quickSort(lista3,0,(lista2.length)-1);
		for(int i=0;i<lista3.length;i++){
			JOptionPane.showMessageDialog(null, "\nMedia: "+lista3);
		}	
	}
	
	public static void quickSort (double[] lista3, int ini, int fim)
	{
		int divisao; 
		if (ini < fim) { 
			divisao = particao(lista3, ini, fim);
			quickSort (lista3, ini, divisao-1); 
			quickSort (lista3, divisao+1, fim); 
		}
	}
	
	public static int particao (double[] lista3, int ini, int fim)
	{
		int pivo = (int) lista3[ini],i = ini+1, f = fim, aux; 
		while (i<=f) { 
			while (i <= fim && lista3[i] <= pivo) 
				++i; 
			while (pivo < lista3[f]) 
				--f; 
			if (i < f){ 
				aux = (int) lista3[i];
				lista3[i] = lista3[f];
				lista3[f] = aux; 
				++i; 
				--f;
			}	 
		} 
		if (ini != f){
		  lista3[ini] = lista3[f];
		  lista3[f] = pivo;
		} 
		return f; 
	}
}
