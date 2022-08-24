import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int a[] = new int[m];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        int n = sc.nextInt();
        int b[] = new int[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int c[] = new int[m+n];
        merge(a,b,c,m,n);
        System.out.println(Arrays.toString(c));
	}
    public static void merge(int a[], int []b,int[]c,int m,int n){
      int i=0;
      int j=0;
      int k=0;
      while(i<m && j<n){
        if(a[i]<=b[j]){
          c[k]=a[i];
          k++;
          i++;
        }
        else{
          c[k]=b[j];
          k++;
          j++;
        }
      }
      while(i<m){
        c[k]=a[i];
        k++;
        i++;
      }
      while(j<n){
        c[k]=b[j];
        k++;
        j++;
      }
    }
}