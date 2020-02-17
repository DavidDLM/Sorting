import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
/**
 * @author Mario de Leon
 *
 */
class SortFuncionesTest {
	iSortFunciones funciones = new iSortFunciones();
	String[] list = {"2","3","1","5","4"};
	String[] list1 = {"2","3","1","5","4"};
	
	String[] listO = {"1","2","3","4","5"};
	String listaOrdenada = Arrays.toString(listO);
	
	@Test
	public void SelectionSortTest() {
		assertEquals(listaOrdenada, Arrays.toString(funciones.SelectionSort(list)));
		}
	@Test	
	public void MergeSortTest() {
		assertEquals(listaOrdenada, Arrays.toString(funciones.MergeSort(list)));
	}
	@Test
	public void QuickSortTest() {
		funciones.QuickSort(list1);
		assertEquals(listaOrdenada, Arrays.toString(list1));
	}
	@Test
	public void RadixSortTest() {
		assertEquals(listaOrdenada, Arrays.toString(funciones.RadixSort(list)));
	}
	
	
	
}

