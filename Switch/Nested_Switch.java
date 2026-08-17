

public class Nested_Switch {
    public static void main(String[] args){
        int j=5;
        int k=4;

        switch(j){
            case 4:
                System.out.println("j is 4");
                break;

                case 5:
                    switch(k){

                        case 1:
                            switch(j){

                            }
                            case 2:
                                break;

                    }

                    default :
                    System.out.println("j is not 4&5");
                    break;
        }
    }
}
