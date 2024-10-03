public class custom{
    public static void main(String[] args){
        ll list=new ll();
        list.insertfirst(3);
        list.insertfirst(5);
        list.insertfirst(2);
        list.insertfirst(8);
        list.insertfirst(17);
        list.insertlast(99);
        list.insert(100,3);
        list.display();
        list.deletefirst();
        list.display();
        list.deletelast();
        list.display();
        list.deleteindex(1);
        list.display();
        System.out.println(list.getindex(100));
    }
}