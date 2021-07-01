package StringPractice;

/**
 * To show StringBuffer is faster than String
 * StringBuffer is slightly faster than StringBuilder
 */

public class demo1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String sg = "";
        for(int i = 0; i < 5000; i++) sg+=i;
        long en = System.currentTimeMillis();
        System.out.println(en - start);

        StringBuffer sb = new StringBuffer();
        start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) sb.append(i);
        en = System.currentTimeMillis();
        System.out.println(en - start);

        StringBuilder sr = new StringBuilder();
        start = System.currentTimeMillis();
        for(int i = 0;i < 10000; i++) sr.append(i);
        en = System.currentTimeMillis();
        System.out.println(en - start);
    }
}
