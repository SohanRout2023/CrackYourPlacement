public class Productofprimenumbers {
    public static boolean IsPrime(int num){
        if(num<2){
            return false;
        }
        int product=1;
        for(int i =2;i<=Math.sqrt(num);i++){
            if(num %i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr={1,7};
        int product =1;
        boolean hasprime=false;
        System.out.println("The prime numbers in array:");
        for(int num : arr){
            if(IsPrime(num)){
                // System.out.println(num + " ");
                product*=num;
                hasprime =true;
            }
        }
        if(hasprime){
            System.out.println(product+ " ");
        }
    }
    
}
