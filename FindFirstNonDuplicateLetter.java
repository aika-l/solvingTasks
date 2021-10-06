package recap.problemSolving;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonDuplicateLetter {

//    Ex:   "aabcdee" ---> b
//          "aabcbef" ---> c
//            "a" ---> a
    public static void main(String[] args){
        String str = "aabcdee";

        System.out.println(firstUnique(str));
    }

    public static char firstUnique(String str) {
        Character unique= '\u0000';
        char[] arr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(Character ch : arr){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                 unique= entry.getKey();
                 break;
            }
        }
        return unique;
    }
}
