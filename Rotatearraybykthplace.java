public class Rotatearraybykthplace {
    public static void rotate (int [] nums, int k){
        int temp = nums[0];
        for(int i =1;i<nums.length;i++){
            nums[i-1]= nums[i];
        }
        nums[nums.length-1]= temp;
    }
    public static void main (String[] args){
        int arr[] = {2,3,4,5,6,7};
        int k = 1;
        rotate(arr, k);
        System.out.println("The roated array is");
        for(int num: arr){
            System.out.print(num+ " ");
        }

    }
    
}
