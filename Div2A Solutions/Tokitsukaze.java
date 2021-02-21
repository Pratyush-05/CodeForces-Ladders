import java.util.*;
public class Tokitsukaze {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = sc.nextInt();
        if(tc%4 == 0){
            System.out.println(1+" A");
        }
        else if(tc%4 == 1){
            System.out.println(0+" A");
        }
        else if(tc%4 == 2){
            System.out.println(1+" B");
        }
        else{
            System.out.println(2+" A");   
        }
    }
    
}