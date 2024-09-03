import java.math.*;
public class hcf {
    public static void main(String[] args) {
        int a=12, b=16;
        int min =Math.min(a,b);
        while(min>0)
        {
            if(a%min==0 && b%min==0)
            {
                System.out.println(min);
                return;
            }
            min--;
        }
    }
    
}
