
public class TrieTest {

	public static void main(String[] args) {
		Trie trie = new Trie();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
        
        System.out.println(trie.isPrefixValid("ca"));
        System.out.println(trie.isPrefixValid("tr"));
        System.out.println(trie.isPrefixValid("de"));
        System.out.println(trie.isPrefixValid("cu"));
        
        System.out.println(trie.isWordValid("car"));
        System.out.println(trie.isWordValid("trie"));
        System.out.println(trie.isWordValid("trys"));
        System.out.println(trie.isWordValid("flat"));
        
        trie.printAllKeys();
	}

}
