public class BitWiseOprators{
    public static void main(String[] args){

        int a=2; //0010 --> 00000000 00000000 00000000 00000010
        int b=3; //0011---->00000000 00000000 00000000 00000011
        int c= a&b; 
        int d=a|b;
        int e=a^b;
        int f=~a;

        System.out.println(c+" ,"+d+"'"+e+","+f);

        int g=1;
        g=g<<33; //g=g<<33==g<<1
        System.out.println(g);

        byte h=1;
        h=(byte)(h<<1);
        System.out.println(g);
        System.out.println(h);






    }
    
}
      