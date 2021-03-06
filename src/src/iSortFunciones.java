import java.util.*;
import java.io.*;


/**
 * @author Usuario Dell
 *
 */
public class iSortFunciones implements iSort{
	/**
	 * SelectionSort
	 */
	@Override
	public String[] SelectionSort(String[] list) {
		//i,j = valores a comparar mayor o menor uno con el otro; valorMin = valor que resulta menor entre i,j
		//temp solo es una variable temporal que ayuda luego de iterar la lista
		int i, j, indiceMin;
		String temp;
		String valorMin; 
		for(i=0;i<list.length;i++) { //For que compara valores y determina si son menores que 0 (o el minimo)
			valorMin = list[i];
			indiceMin = i;
			for(j = i; j < list.length;j++) { //For que mira si el item en la lista es menor al valor minimo i. Si lo es, el valor m�nimo se vuelve j (nuevo valor)
				if(list[j].compareTo(valorMin) <= -1) {
					valorMin = list[j]; //Si j es menor a i, j se vuelve el nuevo valor m�nimo
					indiceMin = j; //El elemento de la lista se ubica en la posici�n j
				}
			}if(valorMin.compareTo(list[i])<=-1) { //Determina si el valor minimo es el primero (despues de las iteraciones de la lista)
				temp = list[i];
				list[i]= list[indiceMin];
				list[indiceMin] = temp;				
			}
			
		}
		return list;
		
	}

	/**
	 * MergeSort
	 */
	@Override
	public String[] MergeSort(String[] list) {
		
		if (list.length <= 1) {
			return list;
		}
		else {
			int media = list.length / 2;
			String[] trozo1 = new String[media];
			String[] trozo2; //Si el largo es un numero impar, cambian las condiciones
			if(list.length % 2 == 1) {
				trozo2 = new String[media+1];
			}else {
				trozo2 = new String[media];
			}
			
			for(int i = 0; i<media;i++) {
				trozo1[i] = list[i];
			}
			
			for(int j = 0; j<trozo2.length; j++) {
				trozo2[j] = list[media+j];
			}
			
			String[] resultado = new String[list.length];
			
			trozo1 = MergeSort(trozo1); //Se llama a si misma para realizar el mismo proceso en todos los trozos de la lista original
			trozo2 = MergeSort(trozo2);
			
			resultado = merge(trozo1, trozo2);
			
			return resultado;
		}
			
	}
	
	private static String[] merge(String[] trozo1, String[] trozo2) {
		String[] resultado = new String[trozo1.length + trozo2.length];
		
		int pointerI, pointerD, pointerRes;
		pointerI = pointerD = pointerRes = 0;
		
		while(pointerI < trozo1.length || pointerD < trozo2.length) {
			
			//Verifica si hay elementos en ambos trozos 
			if(pointerI < trozo1.length && pointerD < trozo2.length) {
				
				if(trozo1[pointerI].compareTo(trozo2[pointerD])<=-1) {
					resultado[pointerRes++] = trozo1[pointerI++];
					
				}else {
					resultado[pointerRes++] = trozo2[pointerD++];
				}
			}
			//Reitera si solo quedan elementos en el trozo1, o trozo izquierdo
			else if(pointerI < trozo1.length) {
				resultado[pointerRes++] = trozo1[pointerI++];
			}
			//Reitera si solo quedan elementos  en el trozo2, o trozo derecho
			else if(pointerD<trozo2.length) {
				resultado[pointerRes++] = trozo2[pointerD++];
			}
		}
		return resultado;
	}
	

	/**
	 * QuickSort
	 * Codificado con ayuda de Joe James en su explicaci�n acerca del algoritmo QuickSort
	 * https://youtu.be/Fiot5yuwPAg
	 */
	@Override
	public void QuickSort(String[] list) { //Funcion principal
		quickSort(list, 0, list.length-1);
	}
	private void quickSort(String[] list, int primero, int ultimo) {
		if(primero < ultimo+1) {
			int p = division(list, primero, ultimo);
			quickSort(list, primero, p-1);
			quickSort(list, p+1, ultimo);
		}
	}
	private int division(String[] list, int primero, int segundo) { //Mueve todos n<pivote a  la izq y todos n>pivote a la derecha del pivote. retorna el indice del pivote
		intercambio(list, primero, pivote(primero, segundo));
		int borde = primero + 1;
		for(int i = borde; i <= segundo; i++) {
			if(list[i].compareTo(list[primero])<=-1) {
				intercambio(list,i,borde++);
			}
		}
		intercambio(list,primero,borde-1);
		return borde-1;
	}
	private void intercambio(String[] list, int primeroI, int segundoI) {
		String temporal = list[primeroI];
		list[primeroI] = list[segundoI];
		list[segundoI] = temporal;
	}
	private int pivote(int primero, int segundo) { //Pivote generado por un numero random entre el numero mayor y el numero menor (incluyendo ambos)
		Random randInt = new  Random();
		return randInt.nextInt((segundo-primero)+1)+primero;
	}
	
	
	/**
	 * RadixSort
	 */
	@Override
	public String[] RadixSort(String[] list) {
		int x,i,j;
		for(x=Integer.SIZE-1;x>=0;x--) {
			String[] temporal = new String[list.length];
			j=0;
			for(i=0;i<list.length;i++) {
				boolean mover = Integer.parseInt(list[i])<<x>=0;
				if(x==0 ? !mover:mover) {
					temporal[j] = list[i];
					j++;		
				}else {
					list[i-j] = list[i];
				}
			}
			for(i=j;i<temporal.length;i++) {
				temporal[i] = list[i-j];			
			}
			list=temporal;
		}
		return list;
	}
}
