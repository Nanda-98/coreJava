package String;

import java.util.HashMap;
import java.util.Map;

public class OccouranceOfCharacter {
    public static void main(String[] args) {
        String name = "nanda";
        Map<Character,Integer> charCount = new HashMap<>();
        char[] charName = name.toCharArray();
        for(Character c : charName){
            if(charCount.containsKey(c)){
                charCount.put(c,charCount.get(c)+1);
            }else{
                charCount.put(c,1);
            }
        }
        System.out.println(charCount);
    }
}
