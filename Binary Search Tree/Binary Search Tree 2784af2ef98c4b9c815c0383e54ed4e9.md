# Binary Search Tree

***Insertion and Deletion in array requires moving other items backward or forward.*** 

Fastest type of sort is I think (nlogn)

Linked Data Strucure  - Does not need resizing. Disadvantage for not being cache friendly.

### Background

---

- Set of Items for comparison
    
    Input 29, return 30 as closest value. 
    
    Sorted Traversal - Print all items in sorted order.
    
    Insert in Sorted Linked List becomes costly as you have to traverse to location.
    
- What is the biggest advantage of Binary Search Tree
    
    Beats almost all data structures in terms of search, insert and delete.
    
    Prefer BST over hashmap when you need to find closest item, sorted traversal. 
    
    However this is only when **BST is balanced.** Otherwise in general it is O(H).
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled.png)
    

### Introduction

BST - Linked Data Structure, Binary Tree.

Data is organized such that search involves skipping half the number of items.

---

- Properties of Linked List
    
    left node is smaller than parent node, right node is greater than parent node. 
    
    No repetition of nodes with same values.
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%201.png)
    
- Implemented in Java
    
    Treeset and Tree Map
    
- Example of Insert Operation on BST
    
    Implementation is similiar to Binary Tree, Insertion order is different.
    
    Smallest value to left most child, greatest value is the right most child.
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%202.png)
    
- Example of implementation
    
    In this case, values are inserted in increasing order. Here the BST is not balanced.
    All operations are O(Height of Tree). In the ideal situation we need to balance the tree, so that operations become O(Log N).
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%203.png)
    

### Search in BST

---

- What is the basic idea here?
    
    Choose either left branch node or right branch node
    
    Recursively go down the BST, using above property if null, then return false.
    If object found then return true.
    
- Recursive Solution ?
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%204.png)
    
- Iterative Solution ?
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%205.png)
    
- Complexity?
    
    in Normal BST
    
    Time Complexity - O(H), O(1).
    
    Auxillary Space - O(H), No space for iteration.
    
    When BST is sqewed, or completely unbalanced it can become, O(Number of nodes or Log N)
    
    - Difference b/w Theta and O
        
        All of the Big-O notations can be considered to have a bar.
        
        When looking at a Ω, the bar is at the bottom, so it is an (asymptotic) lower bound.
        
        When looking at a Θ, the bar is obviously in the middle. So it is an (asymptotic) tight bound.
        
        When handwriting O, you usually finish at the top, and draw a squiggle. Therefore O(n) is the upper bound of the function. To be fair, this one doesn't work with most fonts, but it is the original justification of the names
        

### Insert in BST

Generally insertion takes place at the bottom. Only in one case root is modified, when a null BST is passed.

---

- What is the Basic Idea of Insert in BST?
    
    Search for key in binary search tree,
    
    if present do not do anything. 
    
    If not present, you will reach last leaf. Insert at last leaf. 
    
- Pictorially
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%206.png)
    
- **Recursively - R**
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%207.png)
    
- **Iteratively - R**
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%208.png)
    
- Time Complexity
    
    Similiar to Search, O(H + Some Constant Work)
    
    Where H is height of BST. 
    
    Auxillary Space, Recursive BST - O(H)
    
    Iteration does not need, function call overhead.
    
    Iterator - O(1)
    

### Deletion in BST

---

- What are the problems with deletion in BST ?
    
    Problem is when the node you are deleting has two other leafs.
    
    When deleting a node, you have to replace with **closest lowest value or closest highest value. Why? You can pick of these.**
    
    Lowerst value - Left node of replaced Node.
    
    Highest value - Right node of replaced Node.
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%209.png)
    
- What is the closest greater Value ?
    
    Closest Greater Value - Inorder Successor. 
    Next Node that comes in inorder traversal.
    
    Because values in inorder traversal are always sorted.
    
    Go to the right value first, then keep going left.
    
- What is the closest lower Value ?
- What is the basic idea for BST Delete?
    
    If leaf then delete node.
    
    If one child, replace node.
    
    if two children, find inorder successor, replace node and delete inorder successor.
    
    Second function finds inorder successor. Delete 30.
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%2010.png)
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%2011.png)
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%2012.png)
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%2013.png)
    
- Problem with getSucc Function?
    
    Does not use as general code to find successor. Will not always give inorder successor. Only works when the right child of the node is not null. This is to be used with our delete function.
    
- Time Complexity
    
    Time Complexity  - Search and Remove - O(H)
    
    Auxillary Space O(H) in worst case. For Sqewed Tree, O(N).
    

### Self Balancing BST

The idea of self balancing tree is to make sure the height does not go beyond Theta log n.

Same set of keys can cause different heights in BSTs. **Order of insertion decides the height.**

---

- Order of Insertion, example
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%2014.png)
    
- If you know keys in advance, We can form self balancing tree ?
    
    Sort the keys.
    
    Pick the mid and insert it mid item as root.
    
    Insert mid key from left branch, place as root. 
    
    Insert mid key from right brach, place as root.
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%2015.png)
    
- How to keep it balanced when user is inserting/deleting randomly?
    - What is the basic idea?
        
        BST generally gets unbalanced, when user deletes or inserts items. 
        
        so why not restrucute to balance after insertion/deletion.
        
        Restructuring involves, left rotation and right rotation.
        
        Rotation is easier, restructure without violating BST properties. 
        
        This is O(1) operation, involves few changes to references or pointers.
        
        - Left rotation example
            
            Anticlock Wise Rotation.
            
            ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%2016.png)
            
        - Right rotation example
            
            ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%2017.png)
            
        - Why rotation works?
            
            ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%2018.png)
            

### Tree Set

Implementation of SBST - Red Black Tree.

Traversing Tree set returns item in sorted order.

---

- Additional Operations, which is not present in Hashset.
    
    Floor, 
    Ceil,
    
    Lower,
    Higher.
    
- Basic Functions
    
    Add
    
    Contains
    
    Inserting items that are already present will ignore this.
    
    Lower(5) - Largest value lower than x =  2.
    
    Higher(5) - Smallest higher value than x =  10.
    
    Floor(5) - Value which is smaller or equal to = 5. 
    
    Ceiling  - Value greater than or equal to = 5.
    
    If value does not exist, return null.
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%2019.png)
    
- Complexity
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%2020.png)
    

### TreeMap

Implementation of SBST - Red Black Tree.

Used to implement set of key value pairs. Similiar to Hashing, But more additional functionalities.

Self Balancing Binary Search Tree

---

- Basic Functions
    
    Put
    
    Contains
    
    getKey
    
    getValue
    
    remove() - rerturns keyValue
    
    size()
    
- Additional Functions
    
    higherkey - smallest higher key - 15
    
    lowerkey - greaters smaller key - 5 
    
    floorkey  - gives greatest key smaller than equal to. - 10
    
    ceilingkey - gives smallest value greater than or equal to - 10
    
- Time Complexity
    
    ![Untitled](Binary%20Search%20Tree%202784af2ef98c4b9c815c0383e54ed4e9/Untitled%2021.png)