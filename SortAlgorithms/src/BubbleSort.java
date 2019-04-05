/**
 * 
 * @author ganesh.shanmugam
 * This is worst. Never recommended to use
 * o(n^2) - quadratic
 * has two loops operating on collection
 * every element compared with every other element
 */
public class BubbleSort {
	
	public static int count = 0;
	
	public static void swap(int[] array, int i, int j)
	{
		if(i == j)
			return;
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void main(String[] args) {
		
		int[] array = {22, 1, 46, 21, 4, 23};
		
		for(int unsort = array.length - 1; unsort > 0 ; unsort--)
		{
			count++;
			for(int i = 0; i<array.length-1; i++)
			{
				count++;
				if(array[i] > array[i+1])
					BubbleSort.swap(array, i, i+1);
			}
		}
		
		for (int i : array) {
			System.out.println(i);
		}
		System.out.println(count);
	}

}
