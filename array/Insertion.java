package arrays;

import java.util.Scanner;

public class Insertion {
public static void main(String[] args) {
	int n = 5,pos,x;
	int[] arr = new int[n+1];
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the elements");
	for(int i = 0;i < n;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println("before insertion ");
	for(int i = 0;i < n ; i++) {
		System.out.println(arr[i]+" ");
	}
	pos = 4;
	x = 20;
	for(int i = (n - 1);i >= (pos - 1);i--) {
		arr[i+1] = arr[i];
	}
	arr[pos - 1] = x;
	System.out.println("after insertion ");
	for(int i = 0;i < n; i++) {
		System.out.println(arr[i]+" ");
	}
	System.out.println(arr[n] + " ");
}
    
}
