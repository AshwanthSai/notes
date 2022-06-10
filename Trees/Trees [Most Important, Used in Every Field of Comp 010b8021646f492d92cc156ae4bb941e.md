# Trees [Most Important, Used in Every Field of Computer Science]

Used to represent Heirarchial Structures.

Linear Data Structures - Storage/Deletion, Traversal is Sequential. 

Trees - Storage/Deletion/Traversal is in a Heirarchial Fashion. 

Tree data structure is recursive in nature, meaning a Tree has many subtrees within it.

Uninitialized members within classes are by defaul null. 

- **Glossary**
    
    Root Node. 
    
    Parent Node - Immediate Parent of a Nodes
    
    Leaf Nodes - Nodes with no children.
    
    Internal Nodes/Branch Nodes - Nodes with degree more than zero. 
    
    Descendants - All nodes under a specified parent.
    
    Ancestors - All parents of a Node.
    
    Degree of a Node - Number of Children a node has, 10 - 2, 20 - 2. Leaf nodes with degree zero. 
    
    ![Untitled](Trees%20%5BMost%20Important,%20Used%20in%20Every%20Field%20of%20Comp%20010b8021646f492d92cc156ae4bb941e/Untitled.png)
    
     
    

---

- **Give an example of trees in realworld?**
    
    **Organization Structure.** 
    
    **Folder Structure** is represented using trees. Examples cd in linux .
    
    **XML/HTML Content** - Any form of inner nesting of tags is read as stored/accessed as a tree. Java Script is read as a tree. 
    
    **OOPS** - Inheritance takes the form of a tree.
    
    Most important application of tree is **Binary Search Tree.**
    
    Binary Heap - Used to represent **priority ques.** 
    
    B and B+ Trees in **DBMS** - Indexing is designed using these trees or hashing. 
    
    Computer Networks - Used by bridges - spanning tree. Router uses - Shortest path trees.
    
    Parse Tree, Expression Tree - used by **compiler in source code.**
    
    Trie - used to represent dictonaries. Can be used for prefix Search.
    
    Suffix tree - used to find pattens within a string. Fastest possible way to find patterns in a string. O(Length of Pattern) and not O(Length of String Paragraph).
    
    Binary Index Tree, Segment Tree - Range Query Searches
    
    Segment Index Tree is powerfull, Binary Index Tree is faster for a set of range.
    
- **What is a Binary Tree?**
    
    Degree of any node is atmost two. 
    
    Internally Represented as linked structures,  where 0 holds left reference, 1 holds key and 2 holds right reference.
    
    ![Untitled](Trees%20%5BMost%20Important,%20Used%20in%20Every%20Field%20of%20Comp%20010b8021646f492d92cc156ae4bb941e/Untitled%201.png)
    
- **Why study Binary Trees?**
    
    Most used data structures are based on Binary Trees. 
    
    Binary heap, Binary Search Tree, Segment Tree, 
    
- Code Implementation?
    
    ![Untitled](Trees%20%5BMost%20Important,%20Used%20in%20Every%20Field%20of%20Comp%20010b8021646f492d92cc156ae4bb941e/Untitled%202.png)
    

### Tree Traversal

Breadth First (Level Order Traversal) - Go Level By Level, Like reading a book. Social Circle Print Immediate Friends and then their immediate friends.

Depth First - Go to one side, finish traversing, move to other side. 

---

- **What are the Basic steps for Depth First Traversal?**
    
    In Depth First Traversal - You recursively do the following
    
    1. Traverse the Root.
    2. Traverse the Left Subtree.
    3. Traverse the Right Subtree.
    
    There are three factorial ways to do this. The most common is InOrder, PreOrder and PostOrder.
    
    ![Untitled](Trees%20%5BMost%20Important,%20Used%20in%20Every%20Field%20of%20Comp%20010b8021646f492d92cc156ae4bb941e/Untitled%203.png)
    
- **What is the key to depth first traversal?**
    
    Divide into global left and right subtree. Go to Smaller Left and right subtree. 
    
    ![Untitled](Trees%20%5BMost%20Important,%20Used%20in%20Every%20Field%20of%20Comp%20010b8021646f492d92cc156ae4bb941e/Untitled%204.png)