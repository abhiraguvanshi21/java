import java.util.ArrayList;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        // ArrayList<String> studentName = new ArrayList<>();
        // studentName.add("abhi");
        // System.err.println(studentName); 
        // studentName.add(1,"somu");
        // System.out.println(studentName);

        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(80);
        System.out.println(list);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(85);
        newList.add(98);
        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(2));

        list.remove(Integer.valueOf(80));
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        for(Integer element: list)
        {
            System.out.println("foreach element is"+ element);
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
        {
            System.out.println("iterator" + it.next());
        }
    }
}
