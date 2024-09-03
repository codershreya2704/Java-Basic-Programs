public class ap {
    static int arith(int a,int d,int n)
    {
         
       int res=(n/2*(2*a+(n-1)*d));
       return res;
    }
    public static void main(String[] args) {
       int a=1,d=2,n=4;
       System.out.println("The arithmetic progression is "+arith(a,d,n)+".");
    
    }
    
}
//to find AP 