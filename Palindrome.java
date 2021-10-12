package recap.problemSolving;

public class Palindrome {
    // ex: kayak --> true
    //      madam --> true
    //      zeros --> false
    public static void main(String[] args) {
        String str = "madaM";
        int half = 0;
        if (str.length() % 2 == 0) {
            half = str.length() / 2;
        } else {
            half = str.length() / 2 + 1;
        }

        String firstHalf = str.substring(0, str.length()/2);
        String secondHalf = str.substring(half);
        String reversed = "";
        for (int i = secondHalf.length() - 1; i >= 0; i--) {
            reversed += secondHalf.charAt(i);
        }

        if (firstHalf.equals(reversed)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
