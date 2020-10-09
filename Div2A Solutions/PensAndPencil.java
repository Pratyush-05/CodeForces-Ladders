import java.util.*;


public class PensAndPencil {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = sc.nextInt();
        while(tc != 0){
            funct();
           
            tc--;
        }  
    }
    public static void funct(){
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), k = sc.nextInt();
        int pens= (int)Math.ceil(a/(c*1.0)), pencils= (int)Math.ceil((b*1.0)/d);
        if((pens+pencils) > k){
            System.out.println(-1);
        }
        else{
            System.out.println(pens+" "+pencils);
        }

    

    }
}