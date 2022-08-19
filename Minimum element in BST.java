class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        Node root = node;
        
        if(root==null)
        {
            return -1;
        }
        
        while(root.left!=null)
        {
            root = root.left;
        }
        
        return root.data;
    }
}

