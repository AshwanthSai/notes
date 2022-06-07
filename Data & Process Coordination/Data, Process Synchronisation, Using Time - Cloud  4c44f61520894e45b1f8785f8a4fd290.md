# Data, Process Synchronisation, Using Time - Cloud Computing

- **Glossary**
    
    **Synchronous = happens at the same time. Asynchronous = doesn't happen at the same time**
    

---

- **Overall**
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled.png)
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled%201.png)
    
- **What is Process Synchronization ? Why?**
    
    Multiple processes should not access a shared file simuntaneously - leads to deadlock.
    
    Process Synchronization, grants each other **temporary exclusive access**. [One of Many Solutions for Synchronization].
    
- **What is Data Synchronizaton? Problems ?**
    
    **Ensures two data sets are the same.** 
    
    Menu Item prices should be the same. 
    
- **For Synchronization, you need what?**
    
    *You need coordination, using a frame of reference - Time.* 
    
- **Why Co-ordination ?**
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled%202.png)
    
- **Why Time Synchronization ? Wont it be consitent between hardware?**
    
    The time stamp for multiple hardware. Such as Lidar and Dash camera for an autonomous system will have different time stamps, because it is shipped by different companies. Combining this is hard. There is Skew and Drift Server. Examples Menulog server, Sensors b/w autonomous vehicles.
    
- **Time Synchronization Problems with Menulog?**
    
    **LAMP - Backend, .Net -Server Backend, Time Synchronization problems.**
    
    So order never went through because. Backend could never identify the order.
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled%203.png)
    
- **Global Reference for time ?**
    
    UTC (Coordinated Universal Time).
    
    Is broadcasted from radio stations on land and satellite (e.g. GPS)
    
- **How does the computer know of the time? How can two computers have different time?**
    
    Quartz crystall used. However the quartz drift 1 second in 11 - 12 Days.
    
    Skew - Difference between the times on two clocks. 
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled%204.png)
    
- **Why not sync the OS everytime with UTC server?**
    
    Problem  → Sending and Requesting time from server takes time. There is no perfecr network. 
    
    In perfect network, you can know how long the request will take, and just add that to time.
    
    Synchronous Network. You can safely assume D/2 then.
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled%205.png)
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled%206.png)
    
- **Cristians Time Sync - Used by Computers to Sync With UTC. External Synchronization**
    
    **Achieves the goal for Time Synchronization.  Used when your system needs to communicate with outside networks.**
    
    Synched Time = T3 + Average Communication Delay. [Related to question above.] 
    
    Assumption - Time required to send to server, server to client is the same. 
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled%207.png)
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled%208.png)
    
- **Berkeley Algorithm, Why ? Internal Synchronization.**
    
    *A single time server might fail, so it is better to use a group of synchronized servers.*
    
    **Achieves the goal for Time Synchronization.  Used when your system does not need to communicate with outside networks.**
    
    *Average includes the Master Node.*
    
    Master [Time Daemon] is selected via leader selection algorithm. Pings nodes for time. Takes average difference in time and broadcasted to nodes.
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled%209.png)
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled%2010.png)
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled%2011.png)
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled%2012.png)
    
- **Logical Clocks, Why?**
    
    Time bound clocks are unwanted complication, if the user only cares about the order of happening of events.
    
    **Capture just the happens before relationship.** I dont care about order, I only care if messages are in order. 
    
    ***Lamport Clock  - Global Clock, passed to every process.**  **Lamport clock can only be synched as global variable among processes is only using processes. More messages a process recieves, more accurate the process clock.*** 
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled%2013.png)
    
    A has lamport clock, 1. B has lamport clock, 2. Passes to C. M1 - 2.
    
    Cadds in its time stamp makes it 3.  D event happens after 1 second.  D adds, sends 4. F recieves, completes and changes to 5.
    
    However e is at 1, because it does not have lamport clock. F takes 4 + 1 = 5 to acknowledge all events. Processes could be running with different counters.
    
    Does A happen before F? Yes, even without communicating, A has time stamp 1, F has time stamp 5.
    
    Limitations ? - A has 1, E has 1. They are not related, They are **concurrent events**.  If there is an Event g in between e and f with time stamp 2.  You cannot say a happened before g because there is no form of communication, you cannot vouch for the order. Time Clocks for different processes may be out of order. We do not care. This is called Partially ordering
    
    We only care for one second at a time.  
    
- **What is fully order and partially ordered?**
    
    For each pair of events within a group of processes, if you can justify which event happens first. They are called fully ordered.
    
    Every pair you can order the events.  Majority of DS, partially ordered systems.
    
- **Lamport clock at different rates ? How will it adjust when recieving lamport clock is behind ?**
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled%2014.png)
    
    P1, P2 and P3 are running at different rates.
    
    m1 = 6, send to 16 
    
    m2 = 24 send to 40
    
    m3 = 60 send to 56. M3 Carries 60 and send to 56. 
    
    56 **now will change to 60 + 1. Recieving takes 1.**
    
    **All Lamport clock within the process is adjusted.  How?** 
    
    **Find Delta within the process, 56 - 64 = 8, 72 - 64 = 8, 80 - 72 = 8.**
    
    and add 8 to 61. = 69 .
    
    m4 = 69 send to 54
    
    Lamport Clock within P1 and P2 get the latest lamport clock.
    
- **Vector Clocks, Why?**
    
    In Lamport Clock, every process shares one lamport clock. A happens before B. But you cannot go reverse, think about it.
    
    Lamport clock cannot be used to determine order of processed P1 and P3 because, P1 and P2 do not communicate. 
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled%2015.png)
    
    In Vector Clock, Each Process has its own lamport clock. Messages are send in the form of vectors, when send Its own counter is updated and the particular process vector is updated.
    
     
    
    ![Untitled](Data,%20Process%20Synchronisation,%20Using%20Time%20-%20Cloud%20%204c44f61520894e45b1f8785f8a4fd290/Untitled%2016.png)
    
    Example A. 
    
    M1 sends message from P2 to P1. Increasing its own counter. Sending and Recieving is +1.(0,1,0). 
    
    M1 Updates the message + 1 for recieving for its Laport Clock Vector Value. 
    
    M2 Sends at (2,1,0) from P1 to P3. P3 increases its vector by 1. (2,1,1) 
    
    M3 Sends m at (4,1,0) to P2. P2 updates counter by 1. 
    
    Checking the values we can slightly predict which, event happened before. However not always.