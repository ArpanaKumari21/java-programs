public class ll{
    node head;
    node tail;
    int size;
    //diplay elements
    public void display(){
        node node1=head;
        while(node1!=null){
            System.out.print(node1.value+"->");
            node1=node1.next;
        }
        System.out.println("end");
    }
    //search
    public node get(int value){
        node node1=head;
        while(node1!=null){
            if(node1.value==value){
                return node1;
            }node1=node1.next;
        }return null;
    }
    //insert at the begining
    public void insertfirst(int val){
        node node1=new node(val);
        node1.next=head;
        node1.prev=null;
        if(head!=null){
            head.prev=node1;
        }
        head=node1;
        size++;
    }
    //inset at the end
    public void insertlast(int val){
        node node1=new node(val);
        if(head==tail){
            insertfirst(val);
            return;
        }
        tail.next=node1;
        node1.prev=tail;
        node1.next=null;
        tail=node1;
        size++;
    }
    //insert after x
    public void insertafter(int val,int prevval){
    node previous=get(prevval);
    if(previous.next==null){
        insertlast();
        return;
    }
    node node1=new node(val);
    node1.prev=previous;
    node1.next=previous.next;
    previous.next.prev=node1;
    previous.next=node1;
    size++;
    }

    //find tail
    public node t(){
        node node1=head;
            while(node1.next!=null){
                node1=node1.next;
            }
        return node1;}
    public class node{
        int value;
        node next;
        node prev;
        public node(int val){
            this.value=val;
        }
        public node(int val,node next,node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
}