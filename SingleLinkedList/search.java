
public class search {
    private listnode head;
    private static class listnode{
        private int data;
        private listnode next;
        
        public listnode(int data){
            this.data = data;
            this.next = null;
        }
    }


public void display(){
    listnode current = head;
    while(current != null){
        System.out.print(current.data + "-->");
        current = current.next;
    }
    System.out.println("Null");
}

public int length(){
    if(head == null){
        return 0;
    }
    listnode current = head;
    int count = 0;
    while(current != null){
        count ++;
        current = current.next;
        
    }
    return count ;  
        
}
// search 
public boolean searchin(int searchkey){
    listnode current = head;
    while(current != null){
        if(current.data == searchkey){
            return true;
        }
        current = current.next;
    }
    return false;
}

public void insert(int position , int value){
    listnode node = new listnode(value);
    if(position == 1){
        node.next = head;
        head = node;
    }
    else{
        listnode previous = head;
        int count = 1;
        while(count < position -1){
            previous = previous.next;
            count ++;
        }
        listnode current = previous.next;
        node.next = current;
        previous.next = node;
    }
}


public static void main(String[] args) {
    search sll = new search();
    sll.insert(1, 10);
    sll.insert(2, 3);
    sll.insert(3, 11);
    sll.insert(4, 12);
    sll.insert(5, 20);
    sll.display();
    System.out.println("length of list:"+sll.length());
    if(sll.searchin(11)){
        System.out.println("key is found!!");
    }
    else{
        System.out.println("key is not found!!");
    }
    

}
}

