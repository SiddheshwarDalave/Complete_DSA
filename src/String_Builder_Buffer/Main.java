package String_Builder_Buffer;

public class Main {
    public static void main(String[] args) {

        //StringBuilder()

        //Constructor ->
        // StringBuilder() -> create an empty builder
        //StringBuilder(String str) -> create string with specified string
        //StringBuilder(int length)-> create an empty string with capacity as length

        //Methods->

        /*important ->
        String to string builder
        and
        StringBuilder to string
         */

        //use toString method
        StringBuilder sample=new StringBuilder("1234");
        System.out.println(sample);
        int i=Integer.parseInt(String.valueOf(sample));
        System.out.println(i+1);

        //StringBuffer() -> same as stringBuilder
        //StringBuilder is more efficient than StringBuffer.
        //StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.

        StringBuffer sf=new StringBuffer("buffer");
        System.out.println(sf);

        //All method are same for buffer and builder

        StringBuilder sb=new StringBuilder(); //-> created empty string
        sb=new StringBuilder("ABCD");
        System.out.println(sb);

        //1. append() -> adding string to sting -> like concat
        sb.append("EFG");
        System.out.println(sb); //-> ABCDEFG

        //2. insert() -> insert the string at given position //on;y insert not remove or replace anything

        sb.insert(7,"H");
        sb.insert(3,"H");
        System.out.println(sb);

        //3. replace() -> replce the string specified start and end index
        sb.replace(0,sb.length(),"abcd");
        System.out.println(sb);//sb-> abcd now

        //4. delete() -> remove from string
        sb.delete(0,2); //include, exclude
        System.out.println(sb);

        //5. reverse() -> reverse the string
        sb.reverse();

        //6. capacity -> not more concern

        // 7. ensureCapacity()

        //8. charAt() -> return char
        System.out.println(sb.charAt(0));

        //9. length() -> return length
        System.out.println(sb.length());

        //10. substring() -> extract string
        sb.append("abcd");
        System.out.println(sb);
        sb.substring(3);
        System.out.println(sb);

        //can apply most of methods of string to string builder

    }
}
