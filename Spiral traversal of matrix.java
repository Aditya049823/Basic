import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
      	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][]mat = new int[n][m];
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            mat[i][j]=sc.nextInt();
          }
        }
      int startRow =0, endRow=n-1 , startCol=0, endCol=m-1;
      while(startRow<=endRow && startCol <= endCol){
        for(int i=startCol;i<=endCol;i++) {
          System.out.print(mat[startRow][i] +" ");
        }
        startRow++;
        for(int i=startRow;i<=endRow;i++){
          System.out.print(mat[i][endCol] + " ");
        }
        endCol--;
        if(startRow <= endRow) {
          for(int i=endCol;i>=startCol;i--) {
            System.out.print(mat[endRow][i] + " ");
          }
        }
        endRow--;
        if(startCol <= endCol) {
          for(int i=endRow;i>=startRow;i--) {
            System.out.print(mat[i][startCol] + " ");
          }
        }
        startCol++;
      }
    }
}