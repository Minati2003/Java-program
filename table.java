class tablenumber{
    private int n = 5;

    public tablenumber(){
        this.n = n;
    }

    public void gettable(){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }

}


public class table {
    public static void main(String[] args) {
        
        tablenumber obj = new tablenumber();
        obj.gettable();
        
    }
}
