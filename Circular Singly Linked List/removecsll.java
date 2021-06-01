package circularsll;

import java.util.NoSuchElementException;

public class removecsll {
    private listnode last;
    private int length;

    private class listnode{
        private listnode next;
        private int data;

        public listnode(int data){
            this.data = data;
        }
    }

public removecsll(){
    last = null;
    length = 0;
}

public int length(){
    return length;
}

public boolean isEmpty(){
    return length == 0;
}
// insert node at first
public void insertnode(int value){
    listnode node = new listnode(value);
    if(isEmpty()){
        last = node;
    }
    else{
        node.next = last.next;   
    }
    last.next = node;
    length ++;
}
// remove first node in list
public listnode removefirst(){
    if(isEmpty()){
        throw new NoSuchElementException();
    }
    listnode temp = last.next;
    if(last.next == last){
        last = null;
    }
    else{
        last.next = temp.next;
    }
    temp.next = null;
    length --;
    return temp;
}


public void display(){
    if(isEmpty()){
        return;
    }
    listnode first = last.next;
    while(first != last){
        System.out.print(first.data + "-->");
        first = first.next;
    }
    System.out.println(first.data);
}

public static void main(String[] args) {
    removecsll csll = new removecsll();
    csll.insertnode(1);
    csll.insertnode(2);
    csll.insertnode(3);
    csll.insertnode(4);
    csll.display();
    System.out.println("length of list:"+csll.length);
    csll.removefirst();
    csll.display();
    System.out.println("length of list:"+csll.length);
    
}
}

