import java.util.*;
public class Scarborough {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
    
        int a = sc.nextInt();
        String str = sc.next();
        char ch[] = str.toCharArray();
        
        while(a!=0){
            a--;
            int l= sc.nextInt();
            int r = sc.nextInt();
            char c1 = sc.next().charAt(0);
            char c2 = sc.next().charAt(0);

            for(int i = l-1; i<= r-1;i++){
                if(ch[i] == c1){
                    ch[i]= c2;
                }
            }
        }
        System.out.println(String.copyValueOf(ch));  
        
    }

}