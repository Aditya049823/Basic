import java.util.*;
public class main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    long res = 1;
    while(b!=0){
      res = res*a;
      b--;
    }System.out.println(res);
  }
}
