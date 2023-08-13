public class Question2 {
    public static void main(String[] args) {
        int[] numbers = {-5, 2, 7, 10, 58, -7, 8, 23};
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i =1;i<numbers.length;i++ ){
            if (numbers[i]> largest){
                largest = numbers[i];

            }
            if (numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("largest number: "+ largest);
        System.out.println("smallest number: "+ smallest);
    }
}
