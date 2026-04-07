package workshop.Collection;

import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {
        List l = new ArrayList();
        List a = new LinkedList();
        List b = new Vector();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add("Jay");
        l.add(7.898);
        System.out.println(l);

        ArrayList<String> al = new ArrayList<>();
        System.out.println("ArrayList" + al);
        al.add("aa");
        al.add("bb");
        al.add("cc");
        al.add("dd");
        al.add("dd");
        for(int i = 0; i < al.size(); i++) {
            System.out.println(i);
        }
        System.out.println("Using Each-for loop....");
        for (String s : al) {
            System.out.println(s);

        }

        ArrayList<String> al2 = new Arraylist<>();
        al2.add("1");
        al2.add("2");
        al2.add("3");
        al2.add("4");
        System.out.println(al2);
        al.addAll(al2);
        System.out.println("After adding al2 into al1" + "al");








    }


    


}
