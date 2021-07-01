package RegularExpressionPractice;

public class regExDemo {
    public static void main(String[] args) {
        String str = "Auto0000#%";
        String canadaPhoneNO = "+1 7786821347";
        String chinaPhoneNO = "+86 13541223696";

        /**
         * Replace any substring consisting of four continuing 0 or non-digit or non-character
         * '|' means logical OR
         */
        {
            String regex = "[0]{4}" + "|" + "[^a-zA-Z0-9]";
            System.out.println(str.replaceAll(regex, "REPLACED"));
        }

        /**
         * Use regex to determine if a phone number is a Canadian one or a Chinese one
         */
        {
            //1. must begin with +; 2. + followed by 1 and a space; 3. 10 digits
            String canadaRegex = "\\+";
            String chinaRegex = "";
            System.out.println(canadaPhoneNO.replace(canadaRegex,""));
            //System.out.println(canadaPhoneNO.matches(canadaRegex));
        }
    }
}
