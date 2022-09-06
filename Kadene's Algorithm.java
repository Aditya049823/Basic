//KADENCE ALGORITHM
//TIME COMPLEXITY: O(n) i.e. Linear time complexity
//Code to find the maximum sum of subarray
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		int ans=largestSum(a);
		System.out.println(ans);
	}
	public static int largestSum(int[]a)
	{
	    int currentmax=a[0];
	    int globalmax=a[0];
	    int n =a.length;
	    for(int i=1;i<n;i++)
	    {
	        if(currentmax<0)
	        {
	            currentmax=a[i];
	        }
	        else{
	            currentmax+=a[i];
	        }
	    if(currentmax>globalmax)
	    {
	        globalmax=currentmax;
	    }
	    }
	    return globalmax;
	}
}
