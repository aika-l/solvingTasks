package recap.problemSolving;

public class ReverseNumbers {
    // 1234 --> 4321
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(reverseNums(num));
    }

    public static int reverseNums(int num){
        int reverse = 0;
        while(num != 0){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num /10;
         }
        return reverse;
    }
}
