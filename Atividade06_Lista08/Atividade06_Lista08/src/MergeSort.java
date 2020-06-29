public class MergeSort {
    public void executar(int lista[], int tamanho) {
        mergeSort(lista, 0, tamanho);
        String mostra = "Lista Duplamente Encadeada ordenada usando MergeSort\n";
       
        for (int z = 0; z < lista.length; z++) {
            mostra += lista[z]+"\n";
        }
        System.out.println(mostra);
    }
 
    public static void mergeSort(int lista[], int inicio, int fim) {
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeSort(lista, inicio, meio);
            mergeSort(lista, meio + 1, fim);
            intercala(lista, inicio, meio, fim);
        }
    }
 
    public static void intercala(int lista[], int inicio, int meio, int fim) {
        int i, j, k;
        int vetorB[] = new int[fim];
        
        for (i = inicio; i < meio; i++) {
            vetorB[i] = lista[i];
        }
        
        for (j = meio; j < fim; j++) {
            vetorB[fim + meio - 1 - j] = lista[j];
        }
        
        i = inicio;
        j = fim-1;
        for (k = inicio; k < fim; k++) {
            if (vetorB[i] <= vetorB[j]) {
            	lista[k] = vetorB[i];
                i = i + 1;  
                
            } 
            else {
            	lista[k] = vetorB[j];
                j = j - 1;
                
            }
        }
    }
 
}