import java.util.*;
public class InfinityGauntlet {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();


        String[] avail = new String[n];
        for (int i = 0; i < avail.length; i++) {
            avail[i]= sc.next();
        }
       // System.out.println(avail.length);
        //System.out.println(avail[0]);
       // String[] miss = new String[6-n];
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("purple","Power");
        hmap.put("green","Time" );
        hmap.put("blue" ,"Space" );
        hmap.put("orange","Soul" );
        hmap.put("red","Reality" );
        hmap.put("yellow", "Mind" );
        
        for (int i = 0; i < n; i++) {
               hmap.remove(avail[i])        ;
        }
        System.out.println(6-n);
       // System.out.println(hmap);
       hmap.forEach((k, v) -> System.out.println(v)); 
    } 
} 

    
