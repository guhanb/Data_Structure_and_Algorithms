package Hashting;


public class hashtable {
    private static int capacity;
    private hashnode[] buckets;
    private int numofBuckets;  //capacity
    private int size;    //number of key value pairs in hashtable or no of hashnodes in hashtable

    public hashtable(){
        this(capacity = 10);
    }



    public hashtable(int capacity){
        this.numofBuckets = capacity;
        buckets = new hashnode[numofBuckets];
        this.size = 0;
    }

  

    public class hashnode{
        private Integer key;
        private String value;
        private hashnode next;

        public hashnode(Integer key , String value){
            this.key = key;
            this.value = value;
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int getbucketIndex(Integer key){
        return key % numofBuckets;
    }

    public void put(Integer key , String value){
        int bucketIndex = getbucketIndex(key);
        hashnode head = buckets[bucketIndex];
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        hashnode node = new hashnode(key, value);
        node.next = head;
        buckets[bucketIndex] = node;
        System.out.println("the "+value+" is successfully inserted");
    }

    public String get(Integer key){
        int bucketIndex = getbucketIndex(key);
        hashnode head = buckets[bucketIndex];
        while(head!= null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }



    public static void main(String[] args) {
        hashtable HNode = new hashtable();
        HNode.put(1, "Guhan");
        HNode.put(5, "Tharun");

        System.out.println(HNode.get(5));     

    }
}
