public class SecondLargest {
    public static int scndlargest(int [] arr){
        int largest = arr[0];
        int slargest = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;
        
    }
    public static void main (String[] args){
        int [] number ={4,5,6,7,7,2};
        int sslargest = scndlargest(number);
        System.out.println("The second largest element is" +sslargest);


    }
    
}
