import java.util.Scanner;
public class array8 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	System.out.print("Enter the size of array:");
	int n=in.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elements into arry:");
	for(int i=0;i<arr.length;i++) {
		arr[i]=in.nextInt();
	}
	System.out.println("Enter the 2 Succeding elements from the above array:");
	int a =in.nextInt();
	int b=in.nextInt();
	int s=0,t=0,sum=0;
	for(int z=0;z<arr.length;z++) {
		if(arr[z]==a)
			s=z;
		else if(arr[z]==b)
			t=z;
	}
	if(t>s) {
		for(int j=0;j<s;j++) {
			sum=sum+arr[j];
		}
	for(int j=t+1;j<arr.length;j++) {
		sum=sum+arr[j];
	}
	System.out.println(sum);
	}
	else {
		for(int j=0;j<arr.length;j++) {
		sum=sum+arr[j];
		}
	System.out.println(sum);
	}
	}
		
	}


