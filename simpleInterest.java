class loan{
    private float p = 10000;
    private float t = 5;
    private float r = 3;

    public loan(){
        this.p = p;
        this.t = t;
        this.r = r;
    }

    public void getinterest(){
        float si = (p * t * r)/100;
        System.out.println("The simple interest of the given values is "+si);
    }
    }


public class simpleInterest {
    public static void main(String[] args) {
        loan obj = new loan();
        obj.getinterest();


        
    }
}
