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
        testList.add(new TestList(4,"Fifth element",3.333));

        //System.out.println(testList);/** println() accept an ArrayList object */
        //testList.forEach(
        //        (testList1) -> {System.out.println(testList1);}
        //);/** Or use lambda */
        //testList.forEach(System.out::println);

        /** a third way
         * It is a syntactic sugar of SE 8, and it's equivalent to:
         * testList.forEach( (testList1) -> System.out.println(testList1) )
         * More: https://stackoverflow.com/questions/31020269/what-is-the-use-of-system-outprintln-in-java-8
         * https://stackoverflow.com/questions/28023364/what-is-the-equivalent-lambda-expression-for-system-outprintln/28025717#280257172
         * */

        //Collections.sort(testList);

        Collections.sort(testList, new Comparator<TestList>() {
            @Override
            public int compare(TestList o1, TestList o2) {
                if(o1.getVar3() > o2.getVar3()) return 1;
                else if(o1.getVar3() < o2.getVar3()) return -1;
                else return o1.getVar2().compareTo(o2.getVar2());
            }
        });

        testList.forEach(System.out::println);
    }
}
