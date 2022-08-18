import java.util.*;
public class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String hr = s.substring(0,2);
        String min = s.substring(3,5);
        String sec = s.substring(6,8);
            if(s.charAt(8)=='A')
            {
                if(hr.equals("12"))
                {
                    hr="00";
                }
            }
                else
                {
                if(!hr.equals("12"))
                {
                    hr=String.valueOf(Integer.parseInt(hr)+12);
                }
                }
            String ans =hr + ":" + min + ":" + sec;
            System.out.println(ans);
        }
}