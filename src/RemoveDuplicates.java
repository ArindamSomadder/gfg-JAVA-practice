/*
//remove duplicates from a string
import java.util.Scanner;

public class Main {
    private static boolean[] arr= new boolean[26];

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("String: ");
        String str= sc.nextLine();
        rd(str);
    }
    public static void rd(String str){
        String ns= "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch) && !arr[ch - 'a']) {
                arr[ch - 'a'] = true;
                ns = ns + ch;
            }
        }
        System.out.println(ns);
    }
}
*/



/*
//remove duplicates from a string (1)
class Main {
    public static String removeDuplicates(String input) {
        String ns = new String();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (ns.indexOf(c) < 0) {
                ns += c;
            }
        }

        return ns;

    }

    public static void main(String[] args) {
        String input = "aabbccdd for aabbccdd";
        System.out.println("Input string: " + input);
        System.out.println("Output string: " + removeDuplicates(input));
    }
}
*/


/*
//remove duplicates from a string (2): most efficient
public class Main {
    public static String removeDuplicates(String input) {
        boolean[] hash = new boolean[128];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!hash[c]) {
                hash[c] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "aabbcdcdddddddddddedededddddddddddddd for aabbccddaabbcdcdddddddddddedededdd" +
                "aabbcdcdddddddddddedededddddddddddddd for aabbccddaabbcdcdddddddddddedededddddddddddddd f" +
                "aabbcdcdddddddddddedededddddddddddddd for aabbccddaabbcdcdddddddddddedededddddddvydwgydggggggggggggggggggggggggggggggggggghhhhhhhhhhhhhhhhhhjjjjjjjjjjjjjjjjjjjddddddd for aabbccddbbbbbbor aabbccddaabbcdcdddddddddddedededddddddddddddd for aabbccddddddddddddd for aabbccddaabbcdcdddddddddddedededddddddddddddd for aabbccddaabbcdcdddddddddddedededddddddddddddd for aabbccddaabbcdcdddddddddddedededddddddddddddd for aabbccddaabbcdcdddddddddddedededddddddddddddd for aabbccdd";
        System.out.println("Input string: " + input);
        System.out.println("Output string: " + removeDuplicates(input));

    }
}
 */


/*
//remove duplicates from a string using LinkedHashSet
import java.util.*;
class Main{
    public static void main(String[] args) {
        String str= "abcvwd dvssdg";
        rd(str);
    }

    public static void rd(String str){
       LinkedHashSet<Character> set= new LinkedHashSet<>();
        char[] cha= str.toCharArray();
        String ns= "";

        for(char ch: cha){
            set.add(ch);
        }

        for(Character c: set){
            ns = ns+c;
        }

        System.out.println(ns);
    }
}
 */

/*
//remove duplicates from a string using HashMap
import java.util.*;
class Main{
    public static void main(String[] args) {
        String str= "abcvwd dvs      sdg";
        rd(str);
    }

    public static void rd(String str){
        HashMap<Character, Boolean> map = new HashMap<>();
        String ns= "";
        for(char ch: str.toCharArray()){
            map.put(ch, true);
        }

        for(char ch: map.keySet()){
            ns = ns + ch;
        }

        System.out.println(ns);
    }
}
*/


/*
//remove duplicates from a string using Set
import java.util.*;
class Main{
    public static void main(String[] args) {
        String str= "abcvwd dvssdg";
        rd(str);
    }

    public static void rd(String str){
        Set<Character> set= new HashSet<>();
        char[] cha= str.toCharArray();
        String ns= "";

        for(char ch: cha){
            if(!set.contains(ch)){
                set.add(ch);
                ns = ns + ch;
            }
        }
        System.out.println(ns);
    }
}
*/


/*
//remove duplicates from a string by stream()
import java.util.*;
import java.util.stream.Collectors;
public class RemoveDuplicates {

    public static void main(String[] args) {
        String str= "abcvwd dvsshhhhdg";
        System.out.println(rd(str));
    }
    public static String rd(String str){
        return str.chars().distinct().mapToObj(c -> (char)c).map(Object::toString).collect(Collectors.joining());
    }
}
 */



//remove duplicates from a string by stream(1)
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        Set<Character> set = input.chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(LinkedHashSet::new));
        return set.stream().map(Object::toString).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String input = "aabbccdd";
        System.out.println("Input string: " + input);
        System.out.println("Output string: " + removeDuplicates(input));
    }
}
