package ArrayList;
//done
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //arrayList
        ArrayList<Integer> arrayList=new ArrayList<>();

        //1.add

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        //2.clear arrayList.clear(); ->clear all the stored data

        //3.addAll -> adding collection
        ArrayList<Integer> abc=new ArrayList<>();
        abc.add(1);
        abc.add(5);
        abc.add(6);
        abc.add(7);
        abc.add(8);

        arrayList.addAll(abc);
        System.out.println(arrayList);

        //3 clone
        Object clone= arrayList.clone();
        System.out.println(clone);

        //4. contains ->check existance
        System.out.println(arrayList.contains(3));

        //5. get() -> get the value by passing index
        System.out.println(arrayList.get(0));

        //6. indexOf -> return the index (first occuring element)
        System.out.println(arrayList.indexOf(9));

        //7. lastIndexOf -> return last index;
        System.out.println(arrayList.lastIndexOf(9));

        //8.remove all ->for removing collection
        arrayList.removeAll(abc);
        System.out.println(arrayList);

        //9. remove() -> remove element only
        arrayList.remove(0);
        Object ob=2;
        arrayList.remove(ob);
        System.out.println(arrayList);

        //10.size()
        int sz=arrayList.size();
        System.out.println(sz);

        //11. isEmpty();
        boolean b=arrayList.isEmpty();
        System.out.println(b);

        //12. sublist -> return portion of list from index(include) to toindex(exclude)
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList);
        System.out.println(arrayList.subList(1,3));

        //13. set() -> replacement purpose element
        arrayList.set(0,1); //set element 1 at index 0
        System.out.println(arrayList);

        //14.sort() -> sort the array according to specified order
        arrayList.sort(Comparator.reverseOrder());
        System.out.println(arrayList); //can use natuaralorder, nullfisrt null last

        //15. arrayList to Array
        Integer[] a=new Integer[10];
        arrayList.toArray(a);
        System.out.println(a[2]);
        for(Integer i: a){
            System.out.print(i+" ");
        }
        System.out.println();


        //16. toString() fot only printing purpose
        String list=arrayList.toString();
        System.out.println(list);

        //17.ensureCapacity -> set the size of arrayList
        arrayList.ensureCapacity(5);

        //18. retainAll() -> retain only commom element
        arrayList.addAll(abc);
        System.out.println(abc);
        System.out.println(arrayList);
        arrayList.retainAll(abc); //common element from abc get added into arraylist
        System.out.println(arrayList);

        //19. containsAll() -> check if collection present
        System.out.println(arrayList.containsAll(abc));

        //20. trimToSize()
        arrayList.trimToSize(); //-> it set the capacity to current size

        //21. removeRange() -> not available here

        //22. replaceAll() -> replace all element with given change
        arrayList.replaceAll(e -> e+1); //formula ->can manipulate every element
        System.out.println(arrayList);

        //23 removeIf() -> remove element if satisfy element
        arrayList.removeIf(Predicate.isEqual(2));
        //or
        arrayList.removeIf(e->e%2==0);
        System.out.println(arrayList);

        //24. forEach() -> perform for all elements
        arrayList.forEach((e) -> {
            e=e-2;
            System.out.print(e+" ");
        });
        System.out.println();

        //25.arryList.iterator
        Iterator<Integer> iterator=arrayList.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }






        }
    }

