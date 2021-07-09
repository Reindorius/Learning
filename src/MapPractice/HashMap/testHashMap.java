package MapPractice.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class testHashMap {
    public static void main(String[] args) {
        Map<Key,Value> myHashMap = new HashMap<Key,Value>();

        myHashMap.put(new Key(1,"Reindorius"),new Value(false,88.86,"Mathematics"));
        myHashMap.put(new Key(2,"Sapientiam"),new Value(true,73.54,"Computer Science"));
        myHashMap.put(new Key(3,"Alexander"),new Value(false,79.15,"Physics"));

        //Iterating a hashmap
        Set<Map.Entry<Key,Value>> set = myHashMap.entrySet();//convert map to set
        Iterator<Map.Entry<Key,Value>> itr = set.iterator();

        while(itr.hasNext())
        {
            Map.Entry<Key,Value> entry = itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
