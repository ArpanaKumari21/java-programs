public class ll{
    private node head;
    private node tail;
    private int size;
    public ll(){
        this.size=0;
    }
    //display
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    //search a value
    public boolean getindex(int value){
        node temp=head;
        for(int i=0;i<size;i++){
            if(temp.value==value){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    //get value at an index
     public node get(int index){
        node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    //insert at the begining
    public void insertfirst(int val){
        node node1=new node(val);
        node1.next=head;
        head=node1;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    //insert at the end
    public void insertlast(int val){
        if(tail==null){
        insertfirst(val);
        return;
        }
        node node2=new node(val);
        tail.next=node2;
        tail=node2;
        size++;
    }
    //insert at any position
    public void insert(int val,int index){
        if(index==0){
            insertfirst(val);
            return;
        }
        if(index==size-1){
            insertlast(val);
            return;
        }
        node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        node node3=new node(val,temp.next);
        temp.next=node3;
        size++;
    }
    //delete at the begining
    public void deletefirst(){
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }
    //delete at the end
    public void deletelast(){
        if(head==tail){
            deletefirst();
            return;
        }
        node secondlast=get(size-2);
        tail=secondlast;
        tail.next=null;
    }
    //delete at a particular index
    public void deleteindex(int index){
        if(index==0){
            deletefirst();
        }
        if(index==size-1){
            deletelast();
        }
        node prev=get(index-1);
        prev.next=prev.next.next;
    }
    //define node
    private class node{
        private int value;
        private node next;
        public node(int value){
            this.value=value;
        }
        public node(int value,node next){
            this.value=value;
            this.next=next;
        }
    }
}