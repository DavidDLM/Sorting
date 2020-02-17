import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * 
 */

/**
 * @author Usuario Dell
 *
 */
public class Sorting {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		RandomGenerator rand = new RandomGenerator();
		iSortFunciones funciones = new iSortFunciones();
		
		String[] lista = rand.list();
		String[] lista2 = rand.list();
		String[] lista3 = rand.list();
		String[] lista4 = rand.list();
		
		/**
		 * NANO TIME
		 * long startTime = System.nanoTime();
		 * 	/... the code being measured starts .../ 
		 */
		
		String[] SelectionSort = funciones.SelectionSort(lista);
		String[] MergeSort = funciones.MergeSort(lista2);
		funciones.QuickSort(lista3);
		String[] RadixSort = funciones.RadixSort(lista4);
		
		
		/** ... the code being measured ends ... 
		
		long endTime = System.nanoTime();
		
		//Diferencia en Ns
		long timeElapsed = endTime - startTime;
		
		System.out.println("Tiempo de ejecucion en nanosegundos  : " + timeElapsed);

		System.out.println("Tiempo de ejecucion en milisegundos : " + timeElapsed / 1000000);
		
		*/
		
		/**
		 * NANO TIME YA ORDENADO
		 */
		
		/**
		long startTime1 = System.nanoTime();
		
		/* ... the code being measured starts ... 
		
		int[] SelectionSort1 = funciones.SelectionSort(lista);
		//int[] MergeSort1 = funciones.MergeSort(lista2);
		//funciones.QuickSort(lista3);
		//int[] RadixSort1 = funciones.RadixSort(lista4);
		
		
		/* ... the code being measured ends ... 
		long endTime1 = System.nanoTime();
		
		//Diferencia en Ns
		long timeElapsed1 = endTime1 - startTime1;
		
		System.out.println("Tiempo de ejecucion en nanosegundos  : " + timeElapsed1);

		System.out.println("Tiempo de ejecucion en milisegundos : " + timeElapsed1 / 1000000);
		*/
		

		//Print lista ordenada con funcion SelectionSort
		System.out.print("SelectionSort: ");
		for(int i=0;i<SelectionSort.length;i++){
		    System.out.print(SelectionSort[i]);
		}
	
	
		//Print lista ordenada con funcion MergeSort
		System.out.print(" MergeSort: ");
		for(int i=0;i<MergeSort.length;i++){
		    System.out.print(MergeSort[i]);
		}
		
		
		//Print lista ordenada con funcion QuickSort
		System.out.print(" QuickSort: ");
		System.out.println(Arrays.toString(lista3));
		
		
		//Print lista ordenada con funcion RadixSort
		System.out.print(" RadixSort: ");
		//System.out.println(Arrays.toString(lista4));
		for(int i=0;i<RadixSort.length;i++){
		    System.out.print(RadixSort[i]);
		}
	
		
	}
		
}

