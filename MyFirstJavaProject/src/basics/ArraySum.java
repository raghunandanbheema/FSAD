package basics;

import java.util.Scanner;

public class ArraySum {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        
	        int[] arr = new int[n];
	        int s = 0;

	        for(int i = 0; i < n; i++){
	            arr[i] = sc.nextInt();
	        }
	        for(int i = 0; i < n; i++){
	            s = s + arr[i];
	        }

	        System.out.println("Sum: " + s);
	        sc.close();
	    }
	}
