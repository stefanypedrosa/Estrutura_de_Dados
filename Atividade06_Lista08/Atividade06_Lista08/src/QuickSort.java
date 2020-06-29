public class QuickSort {

	public void executar(int lista[], int tamanho){
		quickSort(lista, 0, tamanho-1);
		String mostra = "Lista Duplamente Encadeada ordenada usando QuickSort\n";
		for (int i = 0; i < tamanho; i++) {
			mostra += lista[i]+"\n";
		}
		System.out.println(mostra);
	}
		
	public static void quickSort(int[] lista, int esquerda, int direita) {
			int esq = esquerda;
			int dir = direita;
			int pivo = lista[(esq + dir) / 2];
			int troca;

			while (esq <= dir) {
				while (lista[esq] < pivo) {
					esq = esq + 1;
				}
				while (lista[dir] > pivo) {
					dir = dir - 1;
				}
				if (esq <= dir) {
					troca = lista[esq];
					lista[esq] = lista[dir];
					lista[dir] = troca;
					esq = esq + 1;
					dir = dir - 1;
				}
			}
			if (dir > esquerda)
				quickSort(lista, esquerda, dir);

			if (esq < direita)
				quickSort(lista, esq, direita);

		}
	}
