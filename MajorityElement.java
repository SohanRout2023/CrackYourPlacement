public class MajorityElement { 
    public static int majorityElem(int [] arr){
        int count =0;
        int cand =0;
        for(int i =0;i< arr.length;i++){
            if(count ==0){
                cand+= arr[i];
            }
            if(arr[i]== cand){
                count++;
            }
        }
        return cand;
    }
    public static void main(String[] args) {
        int []arr = {3,0,3};
        System.out.println(majorityElem(arr));

        
    }
    
}
