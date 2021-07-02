package CollectionPractice.SetOutput;

import CollectionPractice.List.TestList;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSetOutput {
    public static void main(String[] args) {
        Set<TestList> testSet = new HashSet<>();
        /** The order of storing elements in a HashSet is not the same as they are input */
        testSet.add(new TestList(1,"First", 12.56));
        testSet.add(new TestList(1,"Secondary First",34.78));
        testSet.add(new TestList(2,"Second",12.450));
        testSet.add(new TestList(3,"Third",-56.36));

        testSet.forEach(System.out::println);

        Set<TestList> testSet2 = new TreeSet<>();
        /** A TreeSet orders its elements by the override compareTo() method */
        testSet2.add(new TestList(1,"First", 12.56));
        testSet2.add(new TestList(1,"Secondary First",34.78));
        testSet2.add(new TestList(2,"Second",12.450));
        testSet2.add(new TestList(3,"Third",-56.36));

        testSet2.forEach(System.out::println);
    }
}
