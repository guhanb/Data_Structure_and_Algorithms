package trie;

public class trie {

    private trienode root;

    private trie(){
        root = new trienode();  // root is empty
    }

    private class trienode{
        private trienode[] children;
        private boolean isword;

        public trienode(){
            this.children = new trienode[26];  // stroring a - z
            this.isword = false;
        }
    }

    public void insert(String word){
        if(word == null || word.isEmpty()){
            throw new IllegalArgumentException("Invalid Input");
        }
        word = word.toLowerCase();
        trienode current = root;
        for(int i = 0 ; i < word.length() ; i++){
            char c = word.charAt(i);
            int index = c - 'a';
            if(current.children[index] == null){
                trienode node = new trienode();
                current.children[index] = node;
                current = node;
            }
            else{
                current = current.children[index];
            }
        }
        current.isword = true;
        System.out.println("the Word: "+word+" is successfully inserted");
    }

    public boolean search(String word){
        trienode current = root;
        for(int i = 0 ; i < word.length() ; i++){
            char c = word.charAt(i);
            int index = c - 'a';
            if(current.children[index] == null){
                System.out.println("word does not exist");
                return false;
            }
            current = current.children[index];
        }
        if(current.isword == true){
            System.out.println("the Word : "+word+" exist in trie");
            return true;
        }
        else{
            System.out.println("Word ; "+word+" does not exist in trie but it is prefix of another String");

        }
        return current.isword;
    }
    
    public static void main(String[] args) {
        trie TrieNode = new trie();
        TrieNode.insert("cat");
        TrieNode.insert("mat");
        TrieNode.insert("there");
        TrieNode.search("cat");
        TrieNode.search("list");
    }
}
