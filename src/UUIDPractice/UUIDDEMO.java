package UUIDPractice;

import java.util.UUID;

/**
 * UUID=Universally Unique Identifier.
 * UUID generates unique encoding based on time stamp etc...
 */

public class UUIDDEMO {
    public static void main(String[] args) {
        UUID uid1 = UUID.randomUUID();
        UUID uid2 = UUID.randomUUID();

        System.out.println(uid1.equals(uid2));
        System.out.println(uid1.toString());
        System.out.println(uid2.toString());
        //The output is different
    }
}
