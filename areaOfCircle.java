

class area{
    private float r1 = 7;
    private float r2 = 14;
    private float r3 = 21;

    public area(){
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
    }

    public void getarea(){
        float a1 = (float) (2 * 3.141 * r1);
        float a2 = (float) (2 * 3.141 * r2);
        float a3 = (float) (2 * 3.141 * r3);

        System.out.println("The area of the circle having radius "+r1+" is "+a1);
        System.out.println("The area of the circle having radius "+r2+" is "+a2);
        System.out.println("The area of the circle having radius "+r3+" is "+a3);

    }
    

}

public class areaOfCircle {
    public static void main(String[] args) {
        area obj = new area();
        obj.getarea();
        
    }
    
}
