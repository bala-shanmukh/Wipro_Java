public class Prime13 {
    public static boolean isPrime(int n){
        for (int i=2;i<Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        for (int i=10;i<=99;i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}

