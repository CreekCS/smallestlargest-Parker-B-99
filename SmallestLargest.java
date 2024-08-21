//Parker Brunkan
public class SmallestLargest{
    public static void main(String[] args){
        int [] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)((Math.random() * 100) +1);
        }

        int small = smallestValue(numbers);
        int big = largestValue(numbers);
        System.out.print("Largest : " + big + "\nSmallest: " + small + "\n");
    }
    public static int smallestValue(int [] nums){
        int j = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < j)
                j = nums[i];
        }
        return j;

    }
    public static int largestValue(int [] nums){
        int j = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > j)
                j = nums[i];
        }
        return j;
    }
}