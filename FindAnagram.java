package recap.problemSolving;

import java.util.*;
public class FindAnagram {
    // verify is words are anagrams
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "bba";

        if(obj(str1).equals(obj(str2))){
            System.out.println("they are anagrams");
        }else{
            System.out.println("they are not anagrams");
        }

    }

    public static Map<Character, Integer> obj(String a){
        Map<Character, Integer> map = new HashMap<>();
        char[] charArr = a.toCharArray();
        for(Character c : charArr){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        return map;
    }

}
