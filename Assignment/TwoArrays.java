package week1.Home.Assignment;

public class TwoArrays {
	public static void main(String[] args) {  
		int[] a = {3, 2, 11, 4, 6, 7};  
		int[] b = {1, 2, 8, 4, 9, 7};  

		int m = a.length;  
		int n = b.length;  

		System.out.print("Union of two arrays: ");  
		printUnion(a, b, m, n);  
	}  

	public static void printUnion(int[] a, int[] b, int m, int n) {  
		int i = 0, j = 0;   
		while (i < m && j < n) {  
			if (a[i] < b[j]) {  
				System.out.print(a[i++] + " ");  
			} else if (a[i] > b[j]) {  
	  
				System.out.print(b[j++] + " ");  
			} else {  
				System.out.print(a[i++] + " ");  
				j++;  
			}  
		}  
		while (i < m) {  
			System.out.print(a[i++] + " ");  
		}  

		while (j < n) {  
			System.out.print(b[j++] + " ");  
		}  
	}  

}
