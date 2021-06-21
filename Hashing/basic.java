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

    

    public static void main(String[] args) {
        hashtable HNode = new hashtable();

    }
}
