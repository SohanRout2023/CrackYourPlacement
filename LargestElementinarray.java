public class LargestElementinarray {
    public static int  largestElement(int [] nums){
        int largest =nums[0];
        for(int i =0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        return largest;
    }
    public static void main (String [] args){
        int [] number ={12,45,67,23,89};
        int max = largestElement(number);
        System.out.println("The largest element is "+ max);
        
    }
    
}