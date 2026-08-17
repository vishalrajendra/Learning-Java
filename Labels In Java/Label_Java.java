//Labels--> Means Giving names To Loops According to their functioning

public class Label_Java {

   

    public static void main(String[] args){

        

        inner: for(int i=1;i<=10;i++){
            outer:  for(int j=1;j<=i;j++){

                System.out.print("* ");

                if(i==5){
                    break outer; // using labels to terminate
                }

            }
            System.out.println();
        }
    }
    


    
}
