class day{
    private int d = 5;

    public day(){
        this.d = d;
    }

    public void getday(){
        switch (d) {
            case 0:
                System.out.println("Today is sunday");
                
                break;
            case 1:
                System.out.println("Today is monday");
                
                break;
            case 2:
                System.out.println("Today is tuesday");
                
                break;
            case 3:
                System.out.println("Today is wednesday");
                
                break;
            case 4:
                System.out.println("Today is thusday");
                
                break;
            case 5:
                System.out.println("Today is friday");
                
                break;
            case 6:
                System.out.println("Today is saturday");
                
                break;
            default:
                System.out.println("Enter between 0 to 6");
        }
    }
}

public class dayName {
    public static void main(String[] args) {

        day obj = new day();
        obj.getday();
        
    }
}
