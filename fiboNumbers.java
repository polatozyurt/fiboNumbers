import java.util.Scanner ;
public class fiboNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n0, n1, nextNumber, i, j, count ;
		n0= 0;
		n1=1;
		System.out.print("Enter the number of items you want to see in the Fibonacci Series: ");
		i = input.nextInt();
		System.out.print("0 1 ");
		for(count=0; count<=i-2; count++) {
			j = n0+n1 ;
			n0=n1 ;
			n1=j;
			System.out.print(j+" ");
		}
		
		
		
	}

}
