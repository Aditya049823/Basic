import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		insert(arr,n);
		for(int i=0;i<n;i++){
		    System.out.print(arr[i] + " ");
		}
	}
	public static void insert(int[]arr,int n){
	    n=arr.length;
	    for(int i=1;i<n;i++){
	        for(int j=i-1;j>=0;j--){
	            if(arr[j]>arr[j+1]){
	                int swap = arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=swap;
	            }
	        }
	    }
	    return;
	}
}