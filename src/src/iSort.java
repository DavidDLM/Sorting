/**
 * @author Mario de Leon
 *
 */
public interface iSort {
	
	public String[] SelectionSort(String[] list); //Selection sort ordena de menor a mayor una lista comparando dos numeros (i, j) y ordenándolos en orden ascendiente

	public String[] RadixSort(String[] list);
	
	//Recursivos
	public String[] MergeSort(String[] list); //Parte la lista en trozos (hasta llegar a listas de 1 elemento), ordena cada una de los trozos, despues compara y forma una lista grande con los trozos comparados y ordenados de manera ascendiente
	
	public void QuickSort(String[] list); //Usa un pivote para ordenar los items, llegando a una partición izq y una der. 
	
	
}