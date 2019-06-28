import java.util.Scanner;
public class SumAvg {
	public static void main(String[] args) {
		int sum=0;
		float avg=0;
Scanner in=new Scanner(System.in);
System.out.print("Enter the size of an Array:");
int n=in.nextInt();
int arr[]=new int[n];
System.out.println("Enter the "+n+" elements of an Array: ");
for(int i=0;i<arr.length;i++)
{
	arr[i]=in.nextInt();
	sum+=arr[i];
}
avg=(float)sum/n;
System.out.println("sum of "+n+" elements is "+sum);
System.out.println("Average of "+n+" elements is "+avg);
	}
}
