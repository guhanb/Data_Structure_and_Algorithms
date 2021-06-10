package stack;

public class stacklinkedlist {
    private listnode head;
    private int length;

    private class listnode{
        private listnode next;
        private int data;

        public listnode(int data){
            this.data = data;
            this.next = next;
        }
    }

    

    public stacklinkedlist(){
        head = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void insert(int value){
        listnode newnode = new listnode(value);
        newnode.next = head;
        head = newnode;
}
    

    public listnode delete(){
        if(head == null){
            return null;
        }
        listnode temp = head;
        head =  head.next;
        temp.next = null;

        return temp;
    
    }

    public void search(int key){
        if(isEmpty()){
            System.out.println("Stack is empty");
        } 
        else{
            listnode temp = head;
            while(temp != null){
                if(temp.data == key){
                    System.out.println("Key is found ");
                }
                temp = temp.next;
            }
        }
    }
     
    public void display(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        listnode current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
        
    }


    public static class Stack{
        stacklinkedlist ListNode;

        public Stack(){
            ListNode = new stacklinkedlist();
        }

        public void push(int value){
            ListNode.insert(value);
            System.out.println("Inserted "+ value+" in stack");
        }

        public int pop(){
            int result = -1;
            result = ListNode.head.data;
            ListNode.delete();
            System.out.println("Successfully poped!! ");
            
            System.out.println("Deleted value ; "+result);
            return result;
            
        }

        public boolean isEmptylist(){
            
            if(ListNode.isEmpty()){
                System.out.println("List is empty");
                return true;
            }
            else{
                System.out.println("List is not empty");
                return false;
            }
        }
    }
  
    public static void main(String[] args) {
        Stack newstack = new Stack();
        newstack.push(10);
        newstack.push(12);
        newstack.push(13);
        newstack.pop();
        newstack.isEmptylist();

    } 
}
