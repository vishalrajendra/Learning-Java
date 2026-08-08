public class explicit {

    public static void main(String[] args) {
        
        //(int to byte)

        int i=300;
        byte b;

        b=(byte)i;

        System.out.println(b); //(300%256)=44

        //Truncating Conversion

        float f=15.9877f;
        int m;
        m=(int)f;
        System.out.println(m);


        //Type Promotion:

        byte a= 50;
        a=(byte) (a*2);

        System.out.println(a);


    }
    
}
