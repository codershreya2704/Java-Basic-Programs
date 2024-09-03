import java.util.*;
public class consonants {
    public static void main(String[] args) {
        //if consonant print it is or it is not
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("enter character: ");
        ch=sc.next().toLowerCase().charAt(0);
        
        if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
        {
            System.out.println("It is consonant");
        }
        else
        {
            System.out.println("It is not a consonant");
        }
        
    }
    
}
