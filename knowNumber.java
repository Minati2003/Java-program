class number{
    private int num = -21;


    public number(){
        this.num = num;
    }

    public void knowthenumber(){
        if(num >= 0){
            if((num % 2) == 0){
                System.out.println(num + " is a positive even number");
            }
            else{
                System.out.println(num + " is a positive odd number");

            }
        }
        else{
            if((num % 2) == 0){
                System.out.println(num + " is a negative even number");
            }
            else{
                System.out.println(num + " is a negative odd number");

            }

        }
    }
    }



public class knowNumber {
    public static void main(String[] args) {

        number obj = new number();
        obj.knowthenumber();
        
    }
}
