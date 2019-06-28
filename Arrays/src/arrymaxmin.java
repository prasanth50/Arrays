import java.util.Arrays;
import java.util.Scanner;
public class arrymaxmin {
	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.print("Enter the size of an Array:");
int n=in.nextInt();
int arr[]=new int[n];
System.out.println("Enter the "+n+" elements of an Array: ");
for(int i=0;i<arr.length;i++)
{
	arr[i]=in.nextInt();
}
Arrays.sort(arr);
System.out.println("Minimum = " + arr[0]);
System.out.println("Maximum = " + arr[arr.length-1]);
	}
}
