import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedHashSet; 
public class arrayduplicare
{
    public static void main(String[] args)
    {
    	Scanner in=new Scanner(System.in);
    	int n=in.nextInt();
        Integer[] numbers = new Integer[n];
        for(int i=0;i<numbers.length;i++) {
        	numbers[i]=in.nextInt();
        }
        System.out.println( Arrays.toString(numbers) );
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers));
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
    }
}


