package String_General;

import java.util.Arrays;
//donee
public class Main {
    public static void main(String[] args) {
        // 1. All string methods -> general -> current class

        // 2. Using String Builder and String  Buffer

        String s="abcdefg";
        String b="abc def ghi jkl";

        //1. split("format")-> split the string to array;
        String[] strArray=b.split(" ");
        System.out.println(Arrays.toString(strArray));

        //2. compareTo() -> compares the string in the dictionary order
        //3. compareToIgnoreCase() -> compare string without considering case
        String strCopy="abcd";
        String cap="ABCD";
        System.out.println(s.compareTo(strCopy)); //-> return -1 if false and 0 if true
        System.out.println(s.compareToIgnoreCase(cap)); //-> 0 it true otherwise -1 ->fasle

        //4. equals()
        //5. equalsIgnoreCase() ->
//        String strCopy="abcd";
//        String cap="ABCD";
        System.out.println(s.equals(strCopy)); // return true or false only
        System.out.println(s.equalsIgnoreCase(cap));

        //6. length() -> String length
        int len=s.length();

        //7. replace() -> replace all matching text / char
        s.replace('a','b');
        s.replace("abc","xyx");
        System.out.println(s);

        //8. replaceAll()-> replace all subString matching with regex pattern
        String reg="xy";
        s.replaceAll(reg,"abc");
        System.out.println(s);

        //9. substring-> extract string from the string-> index from to to
        String c=s.substring(1);//-> abcdefg->defg -> upto last
        System.out.println(c);
        String d= s.substring(0,2);//-> abcdefg-> ab -> between o to 2
        System.out.println(d);

        //10. s.contains() -> check if present
        System.out.println(s.contains("ab"));

        //11. indexOf() -> index of char or substring
        System.out.println(s.indexOf('c'));//-> 2
        System.out.println(s.indexOf("cde"));//-> 2

        //12. trim() -> remove any leading or trailing space
        String sample="  abc def ghi ";
        String trimmed=sample.trim(); //-> remove leading and trailing white space;
        System.out.println(sample);
        System.out.println(trimmed);
       // sample.stripTrailing(); // -> remove starting white space
       // sample.stripLeading();// -> remove ending white space
       // sample.strip(); //same as trim() // -> remove white spaces from begining and ending
        String k=sample.stripIndent(); //same as trim or strip
        System.out.println(k);

        //13. charAt() -> return char at given index
        System.out.println(s.charAt(0));

        //14. toLowercase() && toUpperCase() -> conersion
        s=s.toUpperCase();
        System.out.println(s);
        s=s.toLowerCase();
        System.out.println(s);

        //15. concat -> appending string to another string
        s=s.concat("hij");
        System.out.println(s);

        //16. String.valueOf() -> String representation of any value
        String.valueOf(s);

        //17.matches()-> check if string matches eith given regex
        String regex="^J..a$"; // or "^A..Z$ "
        System.out.println("Java".matches(regex));//-> true

        //18. startsWith() & endsWith()-> true or false
        System.out.println(s.startsWith("a"));
        System.out.println(s.endsWith("j")); //offset part skipped

        //19. isEmpty() -> check if string has length 0 or it is empty
        s.isEmpty();
        s.isBlank(); //-> same as blank

        //19. intern()
        String str1 = new String("xyz");
        String str2 = new String("xyz");

        // str1 and str2 doesn't share the same memory pool
        System.out.println(str1 == str2); // false

        // using the intern() method
        // now both str1 and str2 share the same memory pool
        str1 = str1.intern();
        str2 = str2.intern();

        System.out.println(str1 == str2); // true

        //20. getBytes() -> encodes the string and store it in bytearray

        System.out.println(Arrays.toString(s.getBytes()));

        //or string.getBytes(Charset charset) or string.getBytes(String charsetName)
        //byteArray = str.getBytes(Charset.forName("UTF-8")); or  byteArray = str.getBytes("UTF-8");

        // 21. contentEquals() -> skipped
        //string.contentEquals(StringBuffer sb) //string builder part
        //string.contentEquals(charSequence cs)

        //22. hashcode() -> return the hashcode of string
        System.out.println(s.hashCode());

        //23. join()
        String a="abc";
        String z="xyz";
        String j=String.join(a,b,z);
        System.out.println(j);

        //24. replacefirst() -> replace the first matching substring
        System.out.println(s);
       s= s.replaceFirst("abc","xyx");
        System.out.println(s);

        //25. subSequence()-> retrun subsequence
        System.out.println(s.subSequence(0,3)); //include,exclude

        //26. toCharArray() ->
        char[] result=s.toCharArray();
        System.out.println(Arrays.toString(result));

        //27. format() -> string format based on argument
        String str = "Java";

        // format string
        String formatStr = String.format("Language: %s %.2f", str,0.3);
        //-> Java 0.30

        //  %b, %B	"true" or "false" based on the argument
        //%s, %S	a string
        //%c, %C	a Unicode character
        //%d	a decimal integer (used for integers only)
        //%o	an octal integer (used for integers only)
        //%x, %X	a hexadecimal integer (used for integers only)
        //%e, %E	for scientific notation (used for floating-point numbers)
        //%f	for decimal numbers (used for floating-point numbers)

        System.out.println(formatStr);

    }
}
