import java.util.Set;
public class Trie {
	public Node root;
    
    public Trie() {
        this.root = new Node();
    }
    
    public void insertWord(String word) {
        Node currentNode = this.root;
        
        for(int i = 0; i < word.length(); i++) {
            Character currentLetter = word.charAt(i);
            Node child = currentNode.children.get(currentLetter);
            
            if(child == null) {
                child = new Node();
                currentNode.children.put(currentLetter, child); 
            } 
            
            currentNode = child;
        }
        
        currentNode.isCompleteWord = true;
    }
    
    public Boolean isPrefixValid(String prefix) {
    	Node currentNode = this.root;
    	
        for(int i = 0; i < prefix.length(); i++) {
        	Character currentLetter = prefix.charAt(i);
        	Node child = currentNode.children.get(currentLetter);
        	
        	if(child == null) {
        		return false;
        	}
        	
        	currentNode = child;
        }
        
        return true;
    }
    
    public Boolean isWordValid(String word) {
    	Node currentNode = this.root;
    	
        for(int i = 0; i < word.length(); i++) {
        	Character currentLetter = word.charAt(i);
        	Node child = currentNode.children.get(currentLetter);
        	
        	if(child == null) {
        		return false;
        	}
        	
        	currentNode = child;
        	
        	if(i == word.length() - 1) {
	        	if(child.isCompleteWord == true) {
	    			return true;
	    		}
        	}
        }
        return false;
    }
    
    public void printAllKeys() {
    	Set<Character> keys = this.root.children.get('c').children.keySet();
    	for(Character key : keys) {
    		System.out.println(key);
    	}
    }
}
