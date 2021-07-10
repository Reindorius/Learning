package IOPractice.FileOperation;

import java.io.File;
import java.io.IOException;

public class testFile {
    public static void main(String[] args) throws Exception {
        /** A simple way of creating a .txt fle
         *
        File file = new File("F:"+File.separator+"test.txt");
        if(file.exists()) file.delete();
        else System.out.println(file.createNewFile());
         */

        File file = new File("F:" + File.separator + "JAVA_CODE" + File.separator + "Learning" + File.separator +
                "files" + File.separator + "file1.txt");

        if(!file.getParentFile().exists()) file.getParentFile().mkdirs();

        if(file.exists()) file.delete();
        else System.out.println(file.createNewFile());
    }
}

