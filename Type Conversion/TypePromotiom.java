public class TypePromotiom {
    public static void main(String[] args) {
        byte b=43;
        char c='a';
        short s=1024;
        int i=5000;
        float f=5.76f;
        double d=0.325262;

        double result = (f*b)+(i/c)-(d*s);

        //f*b-->float
        //i/c-->integer
        //d*s-->double


        //float + integer--->float + double--->double

        System.out.println((f*b+"+"+(i/c)+"-"+(d*s)));
        System.out.println("result ="+ result);
        
    }
    
}
