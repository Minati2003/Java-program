class letter{
    private char c = 'e';

    public letter(){
        this.c = c;

    }

    public void isvowel(){
        switch (c) {
            case 'a':
                System.out.println("It is a vowel");
                
                break;
            case 'e':
                System.out.println("It is a vowel");
                
                break;
            case 'i':
                System.out.println("It is a vowel");
                
                break;
            case 'o':
                System.out.println("It is a vowel");
                
                break;
            case 'u':
                System.out.println("It is a vowel");
                
                break;
            case 'A':
                System.out.println("It is a vowel");
                
                break;
            case 'E':
                System.out.println("It is a vowel");
                
                break;
            case 'I':
                System.out.println("It is a vowel");
                
                break;
            case 'O':
                System.out.println("It is a vowel");
                
                break;
            case 'U':
                System.out.println("It is a vowel");
                
                break;
                
            default:
                System.out.println("it is a consonant");
        }
    }
}


public class vowel {
    public static void main(String[] args) {

        letter obj = new letter();
        obj.isvowel();
        
    }
}
