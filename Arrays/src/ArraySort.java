import java.util.*;
public class ArraySort {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the "+n+" elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		
		Arrays.sort(arr);
		for(int x:arr) {
       System.out.print(x+" ");
		}
	}

}
