//Initial Template for Java
import java.util.Scanner;
class Node
{
    int data;
    Node left, right;
    
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class BinaryTree
{
    public static void main (String[] args) 
    {
         Scanner sc=new Scanner(System.in);
          int t=sc.nextInt();
          
           while(t-->0){
            int n=sc.nextInt();
            if(n==0){
                System.out.println(0);
                continue;
            }
            Node root = null;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                int a1=sc.nextInt();
                char lr=sc.next().charAt(0);
                if(i==0){
                    root=new Node(a);
                    switch(lr){
                        case 'L':root.left=new Node(a1);
                        break;
                        case 'R':root.right=new Node(a1);
                        break;
                    }
                }
                else{
                    insert(root,a,a1,lr);
                }
            }
            
            GfG g=new GfG();
            System.out.println(g.maxDiff(root));
            
        }
    }
    public static void insert(Node root,int a,int a1,char lr){
        if(root==null){
            return;
        }
        if(root.data==a){
            switch(lr){
                case 'L':root.left=new Node(a1);
                break;
                case 'R':root.right=new Node(a1);
                break;
            }
            return;
        }
        insert(root.left,a,a1,lr);
        insert(root.right,a,a1,lr);
    }
    
    
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
//Back-end complete function Template for Java
class GfG
{
    int m_d = Integer.MIN_VALUE;
    
    int maxDiff(Node root)
    {
        recur(root, root.data);
        return m_d;
    }
    
    void recur(Node node, int largestAncestor) {
        if(node == null) {
            return;
        } else {
            int diff = 0;
            if(node.data > largestAncestor) {
                largestAncestor = node.data;
            }
            if(node.left != null) {
                diff = largestAncestor - node.left.data;
                if(diff > m_d) {
                    m_d = diff;
                }
                recur(node.left, largestAncestor);
            }
            if(node.right != null) {
                diff = largestAncestor - node.right.data;
                if(diff > m_d) {
                    m_d = diff;
                }
                recur(node.right, largestAncestor);
            }
        }
    }
    
}
