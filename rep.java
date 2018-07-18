import java.util.*;
import java.util.ArrayList;
public class rep{
      public static void main(String aa[]){
            int t;
            int f=0;
             Scanner s=new Scanner(System.in);
             t=s.nextInt();
             int pp=0;
             int count=0;
             int a[]=new int[t];
               ArrayList<Integer>d=new ArrayList<Integer>();
             for(int i=0;i<t;i++){
                 a[i]=s.nextInt();
             }
             for(int i=0;i<t;i++){
                 if(a[i]==i){
                    d.add(i);
                    f=1;
                 }
             }
         Collections.sort(d);

             if(f==0){
                 System.out.println("-1");
             }
         for(int y:d){
             System.out.print(y);
         }
         

    }
}
