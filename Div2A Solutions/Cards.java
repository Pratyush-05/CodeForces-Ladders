//| 1 | [Cards](https://codeforces.com/problemset/problem/1220/A) | 600 | Yes |
import java.util.*;
public class Cards {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();

        int arr[] = new int[n];
        String str = sc.next();
        int countz=0;
        int countn= 0;

        for (int i = 0; i < arr.length; i++) {
            if(str.charAt(i) =='z' ){
                countz++;
            }
           else if(str.charAt(i) == 'n'){
                countn++;
            }
        }
        String res = ""       ;
        for(int i = 0; i< countn; i++){
            res=res+1+" ";
        }

        for(int i = 0; i< countz; i++){
            res=res+0+" ";
        }

        System.out.println(res);

       
    }
    
}