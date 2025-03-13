
class defaultvalue{
    int integer;
    char character;
    float floatingpoint;
    double doublefloating;
    byte bytee;

    void getdefaultvalue(){
        System.out.println("default value of integer is : " + integer);
        System.out.println("default value of character is : " + character);
        System.out.println("default value of float is : " + floatingpoint);
        System.out.println("default value of double is : " + doublefloating);
        System.out.println("default value of byte is : " + bytee);

    }
}

public class defVar {
    public static void main(String[] args) {
        defaultvalue a = new defaultvalue();
        a.getdefaultvalue();
    }
}
