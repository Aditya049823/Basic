
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner newsc = new Scanner(System.in);
	    int n = newsc.nextInt();
	    int rev=0;
	    int rem=1;
		while(n!=0){
		     rem = n%10;
		     rev = rev*10+rem;
		     n/=10;
		}System.out.println(rev);
	}
}
