

public class Continue_Statement {

    //! Implementation of printing even no.s

    public static void main(String[] args){
        int i;

        for(i=1;i<=17;i++){
            if(i%2==0){
                continue;
            }

            System.out.println(i);
        }
    }
    
}
