

class rectangle{
    int length;
    int breadth;

    int perimeteer(){
        int pr = 2 * (length + breadth);
        return pr;
    }
}

public class peri {
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        rect.length = 10;
        rect.breadth = 8;
        int per = rect.perimeteer();

        System.out.println("The perimeter of the rectangle is : " + per);
        
    }
}

