class ciitzen{
    private int age = 50;

    public ciitzen(){
        this.age = age;
    }
    
    public void elegibility(){
        if(age >= 18){
            System.out.println("You are elegible for voting");
        }
        else{
            System.out.println("You are not elegible for voting");
        }
    }
    }


public class votingElegible {
    public static void main(String[] args) {
        ciitzen obj =  new ciitzen();
        obj.elegibility();
    }
}
