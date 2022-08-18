import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
      char[]crr =new char[n];
      for(int i=0;i<s.length();i++){
        crr[arr[i]]=s.charAt(i);
      }
      String ans = new String(crr);
      System.out.println(ans);
	}
}