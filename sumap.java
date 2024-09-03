public class sumap {
    static int sumOfap(int a, int d, int n)
    {
        int sum=0;
        for(int i=0; i<n;i++)
        {
            sum=sum+a;
            a=a+d;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        int a=1, d=4;
        System.out.println(sumOfap(a, d, n));
    }
    
}
//sum of arithmetic progression