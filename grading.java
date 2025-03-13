class marks{
    private int m1 = 96;
    private int m2 = 85;
    private int m3 = 79;
    private int m4 = 88;
    private int m5 = 81;

    public marks(){
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;

    }
    public void getgrade(){
        int per = (m1 + m2 + m3 + m4 + m5) / 5;
        per /= 10;
        System.out.println("your cgpa is "+per);
        switch (per) {
            case 10:
                System.out.println("you got O grade");
                break;
            case 9:
                System.out.println("you got O grade");
                break;
            case 8:
                System.out.println("you got E grade");
                break;
            case 7:
                System.out.println("you got A grade");
                break;
            case 6:
                System.out.println("you got B grade");
                break;
            case 5:
                System.out.println("you got C grade");
                break;
            case 4:
                System.out.println("you got D grade");
                break;
            case 3:
                System.out.println("you got D grade");
                break;
            default:
                System.out.println("you are failed");
        }
    }
    
}

public class grading{
    public static void main(String[] args) {

        marks obj = new marks();
        obj.getgrade();


    }
}