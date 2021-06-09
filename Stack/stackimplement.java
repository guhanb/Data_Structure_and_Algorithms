import java.util.EmptyStackException;

public class stackimplement {
    private listnode top;
    private int length;

    private class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data = data;
        }
    }

    public stackimplement(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }
    // add element in list
    public void push(int data){
        listnode node = new listnode(data);
        node.next = top;
        top = node;
        length++;
    }
    // remove element
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length --;
        return result;
    }
    
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            return top.data;
        }
    }
    public static void main(String[] args) {
        stackimplement stack = new stackimplement();
        stack.push(10);
        stack.push(11);
        stack.push(18);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());


    }
}
