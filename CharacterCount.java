import java.util.LinkedHashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "a!b@c#123abc";
        characterCount(input);
    }

    public static void characterCount(String input)
    {
       LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

       for(char c : input.toCharArray())
       {
           if(Character.isLetter(c)) {
               map.put(c, map.getOrDefault(c, 0) + 1);
           }
       }
       System.out.println(map.entrySet());
    }
}
