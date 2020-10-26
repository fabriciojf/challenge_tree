package fabriciojf.com;

import java.util.*;

/**
 * Code Challenge 
 * @since 2020/09/30
 * @version 0.1
 * @author Fabricio S Costa fabriciojf@gmail.com
 */
public class BinaryTree {

    public int run(Node leftNode, Node righNode, String rootOperator)  throws Exception  {
        
        switch (rootOperator) {
            case "+":
                return leftNode.total() + righNode.total();
            
            case "-": 
                return leftNode.total() - righNode.total();

            case "*":
                return leftNode.total() * righNode.total();
            
            case "/": 
                return leftNode.total() / righNode.total();
            
            default:
                throw new Exception("Operator not implemented");
        }
    } 


    public static void main(String[] args) {
        
        Node node1 = new Node(3, 2, "+");
        Node node2 = new Node(4, 5, "+");
    
        try {
            int value = new BinaryTree().run(node1, node2, "*");
            System.out.println(value);
        } catch(Exception e) {
            System.out.println("Problems calculating the Tree, please verify the code!");            
        }

    }

}

class Node {

    private int leftValue;
    private int rightValue;
    private String operator;

    public Node(int leftValue, int rightValue, String operator) {
        this.leftValue = leftValue;
        this.rightValue = rightValue;
        this.operator = operator;
    }

    /**
     * Compute the node
     */
    public int total() throws Exception {
        switch (operator) {
            case "+":
                return leftValue + rightValue;
            
            case "-": 
                return leftValue - rightValue;

            case "*":
                return leftValue * rightValue;
            
            case "/": 
                return leftValue / rightValue;
            
            default:
                throw new Exception("Operator not implemented");
        }
    }
}
