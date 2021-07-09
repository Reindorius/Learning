package CollectionPractice.LinkedList;
import CollectionPractice.List.*;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<TestList> testLinkedList = new LinkedList<>();

        testLinkedList.add(new TestList(1,"First",12.56));
        testLinkedList.add(new TestList(2,"Second",34.78));
        testLinkedList.add(new TestList(3,"Third",12.450));

        ListIterator<TestList> litr = testLinkedList.listIterator(0);
        System.out.println(litr.next());
        //testLinkedList.forEach(System.out::println);
    }
}
