package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//done
public class Main {
    public static void main(String[] args) {

        HashMap<Integer,Integer> hm=new HashMap<>();

        //1. put()-> adding element in the form of key and value
        hm.put(1,1);
        hm.put(2,2);
        System.out.println(hm); //gives the key=value pair o/p

        // 2. clear()
//        hm.clear();
        //-> clear complete map

        //3. clone() -> make a copy
        HashMap<Integer,Integer> hmCopy=(HashMap<Integer, Integer>)hm.clone();
        System.out.println(hmCopy);

        //4. isEmpty() -> check if it is empty or not
        System.out.println(hm.isEmpty());

        //5. size() -> return the size
        System.out.println(hm.size());

        //6.putAll() -> add collection
        hmCopy.put(10,12); //for ref
        hm.putAll(hmCopy);
        System.out.println(hm);

        //7. putIfAbsent() -> put element if not present ->key only
        hm.putIfAbsent(4,6); //will add
        hm.putIfAbsent(1,10); // will skipped
        System.out.println(hm);

        //8. remove()-> remove the specific mapping ->wrt key
        hm.remove(1);
        System.out.println(hm);

        //9.containsKey() -> for key existance
        System.out.println(hm.containsKey(1));

        //10. containsValue() -> for value existance
        System.out.println(hm.containsValue(2));

        //11. replace -> replace specific value
        hm.replace(1,1,10);
        hm.replace(2,20);
        System.out.println(hm);

        // 12. replaceAll() -> replcae all values -> lambda
        hm.replaceAll((key,value)->(value+1));
        System.out.println(hm);

        //13. get() -> retun the value using specified key
        //System.out.println(hm.get(1));

        //14. getOrDefault() -> return the default value if key not prsent
        hm.getOrDefault(1,hm.put(1,1));
        hm.getOrDefault(1,hm.put(1,1+hm.get(1)));
        System.out.println(hm);

        //15. forEach -> perform action on each entries //does not change the map only perfom action
        hm.forEach((k,v)-> {
            v=v+10;
            System.out.print(k+" "+v);
            System.out.println();
        });

        //16. entrySet() -> gives key value pair
        System.out.println(hm.entrySet());

        //17. keySet() -> return all keys
        System.out.println(hm.keySet());

        //18. values() -> return all values from map
        System.out.println(hm.values());

        //19. merge() -> merge the mapping to specific hashmap -> rempping in short
        hm.merge(1,6,(k,v)->k*v);
        System.out.println(hm);

        //20. compute() -> changes / compute the value
        hm.compute(1,(k,v)->v=v/2);
        System.out.println(hm);

        //21.computeIfAbsent -> same as putIfAbsent
        hm.computeIfAbsent(1,value->20);
        hm.computeIfAbsent(100,value->20);
        System.out.println(hm);

        //22. computeIfPresent -> if present-> compute
        hm.computeIfPresent(1,(k,v)->v=v/2);
        System.out.println(hm);

        //23. loop
        for(Map.Entry<Integer,Integer> mp: hm.entrySet()){
            System.out.println(mp);
        }
        //or we can iterate with values and keys separately






    }
}
