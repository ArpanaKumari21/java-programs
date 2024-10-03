public class custom{
    public static void main(String[] args){
        ll list=new ll();
        list.insertfirst(99);
        list.insertfirst(20);
        list.insertfirst(29);
        list.insertfirst(77);
        list.insertfirst(100);
        list.display();
        list.insertfirst(1);
        list.insertfirst(17);
        list.display();
        list.insertafter(1,100);
        list.display();
    }
}