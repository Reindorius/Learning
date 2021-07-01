package CollectionPractice.List;

import java.lang.annotation.Documented;
import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        /** list: allow repeated data
         *
         * */
        //List<TestList> myList = new List<TestList>();
        /** You cannot instantiate a list as above since List is AN INTERFACE
         * Either:
         * 1. use List.of(...)
         * 2. instantiate any subclass of List:
         *      eg. List<MYTYPE> = new ArrayList<MYTYPE>
         * */
        List<TestList> testList = new ArrayList<>();
        testList.add(new TestList(1,"First element",114.514));
        testList.add(new TestList(2,"Second element",19.19));
        testList.add(new TestList(3,"Third element",8.10));
        testList.add(new TestList(4,"Forth element",12.450));

        System.out.println(testList);/** println() accept an ArrayList object */
        testList.forEach(
                (testList1) -> {System.out.println(testList1);}
        );/** Or use lambda */
    }
}
