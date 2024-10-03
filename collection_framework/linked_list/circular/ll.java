public class ll{
    private node head;
    private node tail;
    public void display(){
        node node1=head;
        if(head!=null){
        do{
            System.out.print(node1.value+"->");
            node1=node1.next;
        }while(node1!=head);
        }System.out.println("head");
    }
    public void insert(int val){
        node node1=new node(val);
        if(head==null){
            head=node1;
            tail=node1;
            return;
        }
        node1.next=head;
        tail.next=node1;
        tail=node1;
    }
    public void delete(int val){
        node node1=head;
        if(node1==null){
            return;
        }
        if(node1.value==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do {
            node node2 = node1.next;
            if (node2.value == val) {
                node1.next = node2.next;
                break;
            }
            node1 = node1.next;
        } while (node1 != head);

    }
    public class node{
        int value;
        node next;
        public node(int value){
            this.value=value;
        }
    }
}