package finals;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
    String[] strs ={"eat","tea","tan","ate","nat","bat"}; //[["bat"],["nat","tan"],["ate","eat","tea"]]
//        String[] strs ={""}; //[[""]]
        System.out.println(group(strs));
}
    public static List<List<String>> group(String[] strs) {
        Map<String,List<String>> result = new HashMap<>();

        for(String value : strs){
            char [] current = value.toCharArray();
            Arrays.sort(current);
            String key = String.valueOf(current);
            if(!result.containsKey(key)){
                result.put(key,new ArrayList<>());
            }
            result.get(key).add(value);
        }
        return new ArrayList<>(result.values());
    }
}
