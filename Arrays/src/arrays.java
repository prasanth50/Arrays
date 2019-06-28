import java.util.Scanner;
public class arrays {
public static void main(String args[]) {
int[] arr= {6,8,3,17,54,69,11,47};
Scanner in=new Scanner(System.in);
System.out.print("Enter the element you want to search:");
int m=in.nextInt();
int c=1;
boolean b=false;
for(int x:arr) {
	if(x==m)
	{
		b=true;
		break;
	}
	else
		c++;
	
}
if(b)
	System.out.println(m+" is found in the array at "+c+" position.");
else
	System.out.println(-1);
}
}
