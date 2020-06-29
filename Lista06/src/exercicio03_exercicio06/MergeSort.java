package exercicio03_exercicio06;

import javax.swing.JOptionPane;

public class MergeSort {
	
	
	public void executar(double lista[], int tamanho){		
		double lista1[]=new double[tamanho];
		double lista2[]=new double[tamanho];
		double lista3[]=new double[tamanho];

		for(int i=0;i<tamanho;i++) {
			lista1[i]=lista[i];
			lista2[i]=lista[i];
			lista3[i]=lista[i];
		}
		mergeSort(lista);

		mergeSortRecursivo(lista2,0,(lista2.length)-1);
		for(int i=0;i<lista2.length;i++){
			JOptionPane.showMessageDialog(null, "\nMedia: "+lista2);
		}
	}

	
	public static void mergeSort(double[] lista){
		int n=lista.length;
		int lista1[] = new int[n];
		int lista2[] = new int[n];
		int temp[];
		int i,j;
		
		System.arraycopy(lista,0,lista1,0,lista1.length);

		for (i=1;i<n;i*=2){
			for (j=0;j<n;j+=2*i){
				merge(lista1,lista2,j,i);
			}
			temp = lista1; 
			lista1 = lista2; 
			lista2 = temp;
		}		

		System.arraycopy(lista1, 0, lista, 0, lista1.length);
	}

	protected static void merge(int lista1[], int lista2[], int inicio, int inc){
		int x=inicio;
		int fim1=Math.min(inicio+inc, lista1.length);
		int fim2=Math.min(inicio+2*inc, lista1.length);
		int y=inicio+inc;
		int z=inicio;
		while((x<fim1)&&(y<fim2)){
			if(lista1[x]<lista1[y]){
				lista2[z++]=lista1[x++];
			} else {
				lista2[z++]=lista1[y++];
			}
		}

		if (x<fim1){
			System.arraycopy(lista1, x, lista2, z, fim1-x);
		}else {
			System.arraycopy(lista1, y, lista2, z, fim2-y);
		}

	}	

	public static void mergeSortRecursivo(double lista2[], int inicio,
			int fim){

		if (inicio < fim){
			int meio = (inicio + fim) / 2;
			mergeSortRecursivo(lista2,inicio, meio);
			mergeSortRecursivo(lista2,meio + 1, fim);
			mesclar(lista2,inicio, meio, meio+1,fim); 
		}
	}	

	public static void mesclar(double lista2[], int inicioA, int fimA,
			int inicioB, int fimB){
		int i1 = inicioA; 
		int i2 = inicioB;
		int iaux = inicioA;
		double aux[] = new double[lista2.length];
		while (i1 <= fimA && i2 <= fimB){
			if(lista2[i1] <= lista2[i2])
				aux[iaux++]=lista2[i1++];
			else
				aux[iaux++]=lista2[i2++];
		}	
		while (i1 <=fimA)
			aux[iaux++]=lista2[i1++];
		while (i2 <=fimB)
			aux[iaux++]=lista2[i2++];
		for (int i=inicioA;i<=fimB;i++)
			lista2[i] = aux[i];
	}
}
