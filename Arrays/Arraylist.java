import java.util.*;
public class Arraylist{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(10);
        list.add(66);
        list.add(5);
        list.add(100);
        list.add(6);
        list.add(50);
        list.add(1);
        list.add(606);
        list.add(51);
        list.add(103);
        list.add(686);
        list.add(53);
        System.out.println(list);
        System.out.println(list.contain(20));
        list.set(1,99);
        list.remove(5);
        System.out.println(list);
        System.out.println(list.get(3));

}
}