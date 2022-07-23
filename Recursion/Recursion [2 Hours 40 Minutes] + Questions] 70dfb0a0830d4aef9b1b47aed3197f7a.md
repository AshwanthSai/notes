# Recursion [2 Hours : 40 Minutes] + Questions]

---

- What is the Theme?
- What is the Objective?
- Why study this?
- What parts are most important for Interviews? [Where should I focus most?]

---

- Things to remember while writing recursive functions?
    1. Make sure base case is specified.
    2. Make sure function parameter is reduced or increased.
- Applications of Recursion
    
    File search in computer is DFS.
    
    ![Untitled](Recursion%20%5B2%20Hours%2040%20Minutes%5D%20+%20Questions%5D%2070dfb0a0830d4aef9b1b47aed3197f7a/Untitled.png)
    
- Problems with Recursion
    
    Auxillary Space, Function Call Overhead.
    
- Recursion Practise
    - Q1
        
        ![Untitled](Recursion%20%5B2%20Hours%2040%20Minutes%5D%20+%20Questions%5D%2070dfb0a0830d4aef9b1b47aed3197f7a/Untitled%201.png)
        
    - Q2
        
        ![Untitled](Recursion%20%5B2%20Hours%2040%20Minutes%5D%20+%20Questions%5D%2070dfb0a0830d4aef9b1b47aed3197f7a/Untitled%202.png)
        
    - Q3
        
        ![Untitled](Recursion%20%5B2%20Hours%2040%20Minutes%5D%20+%20Questions%5D%2070dfb0a0830d4aef9b1b47aed3197f7a/Untitled%203.png)
        
        ![Untitled](Recursion%20%5B2%20Hours%2040%20Minutes%5D%20+%20Questions%5D%2070dfb0a0830d4aef9b1b47aed3197f7a/Untitled%204.png)
        
    - Q4
        
        ![Untitled](Recursion%20%5B2%20Hours%2040%20Minutes%5D%20+%20Questions%5D%2070dfb0a0830d4aef9b1b47aed3197f7a/Untitled%205.png)
        
    
- How to think of recursion question ?
    
    Assume the formula works for P(K). Find how it will work for P(K - 1), how you can connect to big solution.
    
- Recursion Tip
    
    You can make the function work and call next frame. Or call frame to last base case, work and reduce. Altering the order, changes how the func behaves.
    

### Tail Recursion

When caller has to do nothing, after making call. It is called tail recursion. Recursive call is not the last thing that happens in this function. 

*Always prefer tail recursive solutions.*

- Pictorially
    
    ![Untitled](Recursion%20%5B2%20Hours%2040%20Minutes%5D%20+%20Questions%5D%2070dfb0a0830d4aef9b1b47aed3197f7a/Untitled%206.png)
    

---

- Why is function execution faster for tail recursion?
    
    If caller has to do work then, caller state has to be saved. This causes overhead.
    
- How does it work internally?
    
    Modern compilers when they see tail optimisation. Automatically adjusts to make it Iteratively internally. Much faster and no auxillary space.
    
    ![Untitled](Recursion%20%5B2%20Hours%2040%20Minutes%5D%20+%20Questions%5D%2070dfb0a0830d4aef9b1b47aed3197f7a/Untitled%207.png)
    
- Converting Non Tail Recursive Function to Tail Recursive ? Is this always possible ?
    
    This is not always possible. 
    
    ![Untitled](Recursion%20%5B2%20Hours%2040%20Minutes%5D%20+%20Questions%5D%2070dfb0a0830d4aef9b1b47aed3197f7a/Untitled%208.png)
    
- Tail Recursion Use Case
    
    Use Quick Sort over Merge Sort. [Not Tail Recursive]
    
    Inorder, preorder over Post Order [Not Tail Recursive]
    

### Writing Base Cases in Recursion