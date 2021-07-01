package StringPractice;
import java.io.IOException;
import java.lang.StringBuffer;

/**
 * StringBuffer
 * 1. More effective than String
 * 2. Save more memory than String
 * 3. Thread safe
 */

public class testStringBuffer{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("First phrase");
        System.out.println(sb.toString());
        sb.insert(0,"Insert from 0");
        System.out.println(sb.toString());
        sb.insert(1,"Insert from 1");
        System.out.println(sb.toString());

        StringBuffer sb2 = new StringBuffer("Second phrase");
        sb2.replace(1,sb2.toString().length()-1,"Replaced here");
        System.out.println(sb2.toString());
        sb2.delete(0,sb2.toString().length());
    }
}
