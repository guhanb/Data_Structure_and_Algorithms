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

    
    public static void main(String[] args) {
        trie TrieNode = new trie();
        
    }
}
