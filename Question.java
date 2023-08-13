public class Question {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        
        int[] revArray = new int[nums.length];
        for (int i = 0;i < nums.length; i++){
            revArray[i] = nums[nums.length -1 -i];

        }
        nums = revArray;
        for (int num : nums){
            System.out.println(num + " ");
        }


    } 
}
