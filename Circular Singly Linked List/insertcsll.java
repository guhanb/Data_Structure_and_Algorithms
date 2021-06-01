package circularsll;

public class insertcsll {
    private listnode last;
    private int length;

    private class listnode{
        private listnode next;
        private int data;

        public listnode(int data){
            this.data = data;
        }
    }

public insertcsll(){
    last = null;
    length = 0;
}

public int length(){
    return length;
}

public boolean isEmpty(){
    return length == 0;
}

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
    insertcsll csll = new insertcsll();
    csll.insertnode(1);
    csll.insertnode(2);
    csll.insertnode(3);
    csll.display();
    System.out.println("length of list:"+csll.length);

}
}
