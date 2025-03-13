class numbers{
    private int num1 = 15;
    private int num2 = 12;
    private int num3 = 65;

    public numbers(){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;

    }

    public void getsmallest(){
        if(num1 < num2){
            if(num1 < num3){
                System.out.println(num1 + " is the smallest number");
            }
            else{
                System.out.println(num3 + " is the smallest number");
            }
        }
        else{
            if(num2 < num3){
                System.out.println(num2 + " is the smallest number");
            }
            else{
                System.out.println(num3 + " is the smallest number");
            }
        }
    }
}


public class smallest {
    public static void main(String[] args) {
        numbers obj = new numbers();
        obj.getsmallest();
        
    }
}
