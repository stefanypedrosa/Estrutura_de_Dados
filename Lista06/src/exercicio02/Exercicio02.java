package exercicio02;

public class Exercicio02{
	public static void mergeSort(int origem[]){
		int n=origem.length;
		int lista1[] = new int[n];
		int lista2[] = new int[n];
		int temp[];
		int i,j;
		
		System.arraycopy(origem,0,lista1,0,lista1.length);

		for (i=1;i<n;i*=2){
			for (j=0;j<n;j+=2*i){
				merge(lista1,lista2,j,i);
			}
			temp = lista1; lista1 = lista2; lista2 = temp;
		}		

		System.arraycopy(lista1, 0, origem, 0, lista1.length);
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

	public static void mergeSortRecursivo(int lista[], int inicio,
			int fim){

		if (inicio < fim){
			int meio = (inicio + fim) / 2;
			mergeSortRecursivo(lista,inicio, meio);
			mergeSortRecursivo(lista,meio + 1, fim);
			mesclar(lista,inicio, meio, meio+1,fim); 
		}
	}	

	public static void mesclar(int lista[], int inicioA, int fimA,
			int inicioB, int fimB){
		int i1 = inicioA; 
		int i2 = inicioB;
		int iaux = inicioA;
		int aux[] = new int[lista.length];
		while (i1 <= fimA && i2 <= fimB){
			if(lista[i1] <= lista[i2])
				aux[iaux++]=lista[i1++];
			else
				aux[iaux++]=lista[i2++];
		}	
		while (i1 <=fimA)
			aux[iaux++]=lista[i1++];
		while (i2 <=fimB)
			aux[iaux++]=lista[i2++];
		for (int i=inicioA;i<=fimB;i++)
			lista[i] = aux[i];
	}


	public static void main(String args[]){
		int lista[]={29, 69, 25, 53, 59, 27, 41, 0, 33, 16, 35, 43};
		int lista2[]=new int[12];
		int lista3[]=new int[12];

		System.out.println("Lista Recebida:");
		for(int i=0;i<12;i++) {
			lista2[i]=lista[i];
			lista3[i]=lista[i];
			System.out.print(lista[i]+"  ");
		}
		mergeSort(lista);

		System.out.println("\n\nLista Ordenada com Merge Sort");
		mergeSortRecursivo(lista2,0,(lista2.length)-1);
		for(int i=0;i<lista2.length;i++){
			System.out.print(lista2[i]+"  ");
		}
	}
}