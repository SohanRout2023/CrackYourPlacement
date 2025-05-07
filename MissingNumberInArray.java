public class MissingNumberInArray {
    public static int missingNo(int []nums){
        int n = nums.length;
        int expectedsum=n*(n + 1 ) / 2;
        int actualSum=0;
        for(int num : nums){
            actualSum +=num;
        }
        return expectedsum-actualSum;

    }
    public static void main(String[] args) {
        int [] arr ={3,0,1};
        System.out.println("Expected sum is " +missingNo(arr));
    }
    
}
