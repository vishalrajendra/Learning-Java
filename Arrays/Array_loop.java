public class Array_loop {

    public static void main(String[] args){

        int rollnum[]= new int[3];

        int x=101;

        for(int i=0;i<rollnum.length;i++){
            rollnum[i]=x;
            x++;
        }
        for(int i=0;i<rollnum.length;i++){
             System.out.println(rollnum[i]);

    }
    
}
}
