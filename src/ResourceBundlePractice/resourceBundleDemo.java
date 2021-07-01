package ResourceBundlePractice;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class resourceBundleDemo {
    public static void main(String[] args) throws Exception{
        Locale loc = new Locale("en","US");

        //read the resource file depending on the locale read
        ResourceBundle rsb = ResourceBundle.getBundle("ResourceBundlePractice.Messages",loc);

        System.out.println(MessageFormat.format(rsb.getString("edu.info"),"您","界面"));
    }
}
