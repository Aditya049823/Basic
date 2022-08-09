import java.util.*;
public class reverse {
        public static void main(String[] args){
            Scanner newsc = new Scanner(System.in);
            int n = newsc.nextInt();
            int rem=0;
            int rev=0;
            while(n!=0){
                rem = n%10;
                rev=rev*10+rem;
                n/=10;
            }System.out.println(rev);
        }
    }

