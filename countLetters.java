package recap.problemSolving;
import java.util.HashMap;
import java.util.Map;

public class countLetters {
    //count letters in a str

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(countChar(str)); // {r=1, d=1, e=1, W=1, H=1, l=3, o=2}
    }

    public static Map<Character, Integer> countChar(String str){
        Map<Character, Integer> map = new HashMap<>();
        char[] charArr = str.toCharArray();
        for(Character ch : charArr){
            if(ch == ' '){
                continue;
            }
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else {
                map.put(ch, 1);
            }
        }
        return map;
    }
}
