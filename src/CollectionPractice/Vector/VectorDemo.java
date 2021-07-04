package CollectionPractice.Vector;
import CollectionPractice.List.*;

import java.util.List;
import java.util.Vector;
//This is comment from Reindorius_Desktop_Home

public class VectorDemo {
    public static void main(String[] args) {
        /**
         * Vector: methods are synchronized, thread safe but less performance, suitable for
         *      multi-thread/process
         * ArrayList: methods are not synchronized, thread non-safe but more performance
         */

        List<TestList> testVector = new Vector<>();
        testVector.add(new TestList(1,"First",12.56));
        testVector.add(new TestList(2,"Second",34.78));
        testVector.add(new TestList(3,"Third",12.450));

        testVector.forEach(System.out::println);
    }
}
