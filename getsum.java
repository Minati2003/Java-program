class numbere{
    private int num = 4569;

    public numbere(){
        this.num = num;
    }
    public void getsumofdigits(){
        int sum = 0;
        int num1 = num;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum of digits of " + num1 + " is " + sum);
    }
}

public class getsum {
    public static void main(String[] args) {

        numbere obj = new numbere();
        obj.getsumofdigits();
        
    }
}
