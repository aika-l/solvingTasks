package recap.problemSolving;

public class ReverseStrButNotSpecChars {
    public static void main(String[] args) {
        String text = "I l<ov$e & You!!";
        //Result should be: "u o<Ye$v & olI!!"

        System.out.println(reverse(text));
    }

    public static String reverse(String str){
        String[] arr = str.split("");
        String regex = "[a-zA-Z]";
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            String temp = "";
            if(arr[start].matches(regex) && arr[end].matches(regex)){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            else if(!arr[start].matches(regex)){
                start++;
            }
            else if(!arr[end].matches(regex)){
                end--;
            }
        }
        String result = "";
        for(int i=0; i<arr.length; i++){
            result+=arr[i];
        }
        return result;
    }
}
