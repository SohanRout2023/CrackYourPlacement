public class MoveallZeros {
    public static void movezeros(int [] nums){
        int insert=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insert++]= nums[i];
            }
        }
        for(int i =insert;i<nums.length;i++){
            nums[i]=0;
        }
    }
    public static void main (String[] args){
        int [] arr= {2,3,0,8,7,5,0,0,3};
        movezeros(arr);
        for(int num: arr){
            System.out.print(num + " ");
        }
        
    }
    
}
