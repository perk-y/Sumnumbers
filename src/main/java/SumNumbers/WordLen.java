package SumNumbers;

import java.util.HashMap;
import java.util.Map;

public class WordLen {
    public Map<String, Integer> wordLen(String[] strings) {
        int size= strings.length;
        Map<String,Integer> hm = new HashMap<>();
        int i =0;
        while(i<size){
           if(!hm.containsKey(strings[i])){
               hm.put(strings[i],strings[i].length());}
           i++;
        }
        return hm;
    }

}
