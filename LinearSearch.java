public class LinearSearch {
    public static int lsearch(int[] nums,int target){
        for (int i =0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main (String[] args){
        int [] arr = {2,3,4,5,6,7};
        int index= lsearch(arr,5);
        System.out.print("The elemnt is found in " +index);
    }
    
}
