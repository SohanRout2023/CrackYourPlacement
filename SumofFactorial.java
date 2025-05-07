public class SumofFactorial {
    public static boolean isOdd(int n){
        if(n %2!=0){
            return true;
        }
        return false;
    }
    public static long factorial(int n){
        long fact =1;
        for(int i =1;i<=n;i++){
            fact*=i;

    }
        return fact;
    }

    public static void main(String[] args) {
        int [] arr ={2,6,11};
        for(int num : arr){
            if(isOdd(num)){
            System.out.println(factorial(num));
        }
    }
    
}
}
