

public class LogicalOperators {

    public static void main(String[] args){

        int a=5;
        int b=10;
        int c=15;
         boolean d=(a<b)&& (a<c);
         boolean e=(a<b) & (a<c); // True and True =True
         boolean m=(a<b)|| (a<c);

         System.out.println(d);
         System.out.println(m);
         System.out.println(e);

    }
    
}
