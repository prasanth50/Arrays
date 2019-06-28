import java.util.*;
public class array5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("first 2 large numbers are: "+arr[0]+" "+arr[1]);
		System.out.println("Last 2 smallest numbers are: "+arr[arr.length-2]+" "+arr[arr.length-1]);
	}

}
