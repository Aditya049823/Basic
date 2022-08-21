import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr= new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		selection(arr,n);
		for(int i=n-1;i>=0;i--){
		    System.out.print(arr[i] + " ");
		}
	}
	public static void selection(int[]arr,int n){
	n =arr.length;
	for(int i=0;i<n-1;i++){
	    int min=i;
	    for(int j=i+1;j<n;j++){
	        if(arr[j]>arr[min]){
	            int swap = arr[min];
	            arr[min]=arr[j];
	            arr[j]=swap;
	        }
	    }
	}
	return;
}
}