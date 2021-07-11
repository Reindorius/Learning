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

        /**
         * Create a .txt file under the designated directory
         * If the directory does not exist yet, the directory, under which the .txt file should be created, will be
         * created first. Here the parent directory is relative to the .txt file.
        File file = new File("F:" + File.separator + "JAVA_CODE" + File.separator + "Learning" + File.separator +
                "files" + File.separator + "file1.txt");

        if(!file.getParentFile().exists()) file.getParentFile().mkdirs();

        if(file.exists()) file.delete();
        else System.out.println(file.createNewFile());
         */

        /**
         * obtain all sub-files of the designated directory
        File file = new File("f:" + File.separator);
        if(file.isDirectory())
        {
            File allFiles[] = file.listFiles();
            for(int i = 0; i < allFiles.length; i++)
                System.out.println(allFiles[i]);
        }
         */

        /**
         * Printing all files under the path F:/JAVA_CODE/Learning/src
        File file = new File("F:" + File.separator + "JAVA_CODE" + File.separator +
                "Learning" + File.separator + "src");
        listFile(file);
         */


    }

    public static void listFile(File file)
    {
        /**
         * A method listing all sub-files of the designated file path recursively
         */
        if(file.isDirectory())
        {
            File subFiles[] = file.listFiles();

            if(subFiles!=null)
            {
                for(int i = 0; i < subFiles.length; i++)
                {
                    listFile(subFiles[i]);
                }
            }
        }
        else
            System.out.println(file);
    }
}


