class number{
    private int num = 454;

    public number(){
        this.num = num;
    }

    public void ispallindrome(){

        int newnum = 0;
        int dupnum = num;

        while(dupnum > 0){
            newnum = (newnum * 10) + (dupnum % 10);
            dupnum /= 10;
        }

        if(newnum == num){
            System.out.println(num + " is a pallindrome number");
        }
        else{
            System.out.println(num + " is not a pallindrome number");
        }
    }
}

public class pallindrome {
    public static void main(String[] args) {

        number obj = new number();
        obj.ispallindrome();
        
    }
}
