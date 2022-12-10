package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    // 1. All Hashset methods
    // 2. LinkedHashset
    // 3. TreeSet
//done
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();

        //adding into hashset

        for(int i=0;i<11;i++){
            hashSet.add(i);
        }

        //print

        for(int i :hashSet){
           // System.out.print(i+" ");
        }
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.get(0);
        //remove all
        //hashSet.clear();
        for(int i :hashSet){
           System.out.print(i+" ");
        }

        //clone

        Object ob=hashSet.clone();
        System.out.println(ob);

        //contains boolean

        System.out.println(hashSet.contains(3));

        //is empty
        System.out.println(hashSet.isEmpty());

        //iterator
        Iterator<Integer> iterator= hashSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        //remove

        hashSet.remove(0);

        System.out.println();

        for(int i :hashSet){
            System.out.print(i+" ");
        }

        //size int

        System.out.println(hashSet.size());

        //toArray()
        Object[] array= hashSet.toArray();
        for (int j = 0; j < array.length; j++){

            System.out.println(array[j]);
    }


    }


}
