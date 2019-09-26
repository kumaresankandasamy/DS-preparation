package arrays;

import java.util.Scanner;

public class Deletion {
	public static void main(String[] args) {
		int n = 5, flag = 1,x = 9,pos = 0;
		Scanner s = new Scanner(System.in);
		int arr[] = new int[n];
		Scanner sc = new Scanner(System.in);
		System.out.println("print elements : ");
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();		
	   }
		System.out.println("before insertion");
		for(int i = 0;i < n;i++) {
			System.out.println(arr[i]+ " ");	
	   }
		for(int i = 0;i < n;i++) {
			if(arr[i] == x) {
				flag = 1;
				pos = i;
				break;
			}
			else {
				flag = 0;
			}
		}
		if(flag == 1) {
			for(int i = pos+1;i<n;i++) {
				arr[i] = arr[i-1];
			}
			System.out.println("after deleting : ");
			for(int i = 0; i < n-2;i++) {
				System.out.println(arr[i]+" ");
			}
			System.out.println(arr[n-2]+" ");
		}else {
			System.out.println("element not found ");
		}
}
}