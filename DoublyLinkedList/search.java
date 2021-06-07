package doublyLInkedLIst;

public class search {
    private listnode head;
    private listnode tail;
    private int length;

    private class listnode{
        private int data;
        private listnode next;
        private listnode previous;

        private listnode(int data){
            this.data = data;
        }

    }

    public search(){
        head = null;
        tail = null;
        length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }
    
    public int length(){
        return length;
    }
    
    public void display(){
        if(head == null){
            return;
        }
        listnode current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    
    }

    public void searchvalue(int key){
        if(head != null){
            listnode temp = head;
            for(int i = 1 ; i < length ; i++){
                
                if(temp.data == key){
                    System.out.println("key is found " + i);
                }
                temp = temp.next;
                
            }
        }
        else{
            System.out.println("key not found");
        }
    }

    public void insertlast(int value){
        listnode node = new listnode(value);
        if(isEmpty()){
            head = node;
        }
        else{
            tail.next = node;
            node.previous = tail;
        }
        
        tail = node;
        length ++;
    }

    public static void main(String[] args) {
        search dll = new search();
        dll.insertlast(2);
        dll.insertlast(5);
        dll.insertlast(8);
        dll.insertlast(10);
        dll.display();
        dll.searchvalue(8);
    }
}
