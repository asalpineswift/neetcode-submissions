/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // what should I do?
        Node node = head;

        Map<Node, Node> map = new HashMap<>();
        Node newNode = null;

        while(node !=null){
            map.put(node, new Node(node.val));
            node = node.next;
        }
        node = head;
        // while both are false 
        
        while (node !=null ){
            Node currNode = map.get(node);
            currNode.next = map.get(node.next);
            currNode.random =  map.get(node.random);
            
            node = node.next;
        }
        return map.get(head);
        
    }
}
