import java.util.*;

public class BinTree {

//preorder recursive
    public void preorder(BTNode p) {
       if (p != null) {
    	   System.out.print(p.getKey() + " ");
           preorder(p.getLeft());
           preorder(p.getRight());
       }
    }
//inorder recursive 
    public void inorder(BTNode p) {
       if (p != null) {
    	   inorder(p.getLeft());
    	   System.out.print(p.getKey() + " ");
           inorder(p.getRight());
       }
    }
 //post order recursive
    public void postorder(BTNode p) {
       if (p != null) {
           postorder(p.getLeft());
           postorder(p.getRight());
           System.out.print(p.getKey() + " ");
       }
    }
//preorder iterative
    public void iterativePreorder(BTNode p) {
       Stack<BTNode> stack = new Stack<BTNode>();
        if (p != null) {
           stack.push(p);
           while (!stack.empty()) {
              p = stack.pop();
              System.out.print(p.getKey() + " ");
              if (p.getRight() != null)
                  stack.push(p.getRight());
              if (p.getLeft() != null)
                  stack.push(p.getLeft());
              }
         }
    }
//postorder iterative
    public void iterativePostorder(BTNode p) {
       BTNode q = p;
       Stack<BTNode> stack = new Stack<BTNode>();
       while (p != null) {

          for (; p.getLeft() != null; p = p.getLeft())
               stack.push(p);

          while (p != null && (p.getRight() == null || p.getRight() == q)) {
        	  System.out.print(p.getKey() + " ");
                q = p;
                if (stack.empty())
                  return;
                p = stack.pop();
         }
          
          stack.push(p);
          p = p.getRight();
       }
    }
//inorder iterative
    public void iterativeInorder(BTNode p) {
        Stack<BTNode> stack = new Stack<BTNode>();
        while (p != null) {
           while (p != null) {
              if (p.getRight() != null)
               stack.push(p.getRight());
               stack.push(p);
               p = p.getLeft();
           }
           p = stack.pop();
           while (!stack.empty() && p.getRight() == null) {
        	   System.out.print(p.getKey() + " ");
              p = stack.pop();
           }
           System.out.print(p.getKey() + " ");
           if (!stack.empty())
              p = stack.pop();
           else
              p = null;
         }
     }
   public static void main(String[] args) {
       BinTree tree = new BinTree();
       
       BTNode d = new BTNode('D');
       BTNode e = new BTNode('E');
       BTNode f = new BTNode('F');
       BTNode g = new BTNode('G');
       BTNode b = new BTNode('B',d,e);
       BTNode c = new BTNode('C', f, g);
       BTNode a = new BTNode('A', b, c);
       
       
       System.out.print(" Pre-Order:");
        tree.preorder(a);
       System.out.println();
       System.out.print("¡¡In-Order:");
        tree.inorder(a);
       System.out.println();
       System.out.print("Post-Order:");
        tree.postorder(a);
       System.out.println();
       System.out.print(" Pre-Order:");
        tree.iterativePreorder(a);
       System.out.println();
       System.out.print("¡¡In-Order:");
        tree.iterativeInorder(a);
       System.out.println();
       System.out.print("Post-Order:");
        tree.iterativePostorder(a);
       System.out.println();
    }
}