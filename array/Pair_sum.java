
public class Pair_sum {
	public static void findFair(int[] arr,int sum) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]+arr[j] == sum) {
					System.out.println("Pair found at index " + i + " and " + j);
					return;
				}
			}
			
		}
		System.out.println("pair not found");
	}
	public static void main(String[] args) {
		int arr[]= {8,7,6,5,4,3,2};
		int sum = 5;
		
		findFair(arr,sum);
		
		
	}

}
