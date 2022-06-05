# Virtualization

Technology was made for weapons. 

We have been using some form of virtualization. VMware, Ubuntu and Things.

- Glossary
    
    Bare Metal - 
    
    Host Operating Systems - 
    
    Guest Operating Systems - 
    
- Entire Picture
    
    ![Untitled](Virtualization%20d78d7910ce6146ad87a8b3cdd6c90ebd/Untitled.png)
    

---

- Why Virtualization ?
    
    **Portability is the most important thing. VMs can be plugged and played in different machines, fast.** 
    
    **Resource Abundance and Actual Resource Usage.**
    
    **Resource Sharing, Improved Productivity.**
    
    ![Untitled](Virtualization%20d78d7910ce6146ad87a8b3cdd6c90ebd/Untitled%201.png)
    
- What is Virtualization ?
    
    Virtualization is the process of creating software based version of something, compute, network or applications. VMMonitor is same as hypervisors, this enables Virtualization. 
    Hypervisors - manage physical resources and allocates to VMS. 
    
    ---
    
    Type 1 - Hypervisor Installed on top of the physical server, bare metal hypervisors. Example, Microsoft Hyper V.
    
    Type 2 - Hypervisor Installed on top of OS. Used in end user virtualization. Called Hosted Hypervisor. Virtual Box, Qemu.
    
    The ability to multiplex resources on a single physical system in a **isolated manner.**
    
    Virtual Cores may or maynot manage cores. Virtual Machines are called instances.
    
    ![Untitled](Virtualization%20d78d7910ce6146ad87a8b3cdd6c90ebd/Untitled%202.png)
    
- How was it used by Amazon ?
    
    Amazon found that much of the computing power in their data centre was unused. They virtualized and sold the unused computing power to the people.
    
- What is Virtual Machines ? VM - Software base computer. Multiple of them can be run in the hypervisor.
    
    A fully protected and isolated copy of the underlying physical machine hardware - IBM
    
- Advantage of VM ?
    
    ![Untitled](Virtualization%20d78d7910ce6146ad87a8b3cdd6c90ebd/Untitled%203.png)
    
    Cost Savings - No need to maintain servers.
    
    Agility, Speed - No need to install OSes, or dependencies, Just get an Instance.
    
    Lowers Down Time -Faster VM agility means less downtime.  
    
- What virtualization methods do these use?
    
    ![Untitled](Virtualization%20d78d7910ce6146ad87a8b3cdd6c90ebd/Untitled%204.png)
    
    Xen - Paravirtualziation.
    
    Docker - Containers.
    
    Virtual Box - Type 2 Virtualization. 
    
- What is Noisy Neighbour affect?
    
    When multiple VMs use the same set of physical resources. There is never perfect isolation and resource contention problems.
    
- What are two virtualization methods?
    
    Full Virtualization - No Os Source Modfication.
    
    Para Virtualization  - Slight OS Modification.  The Guest OS is aware of virtualization, gives better performance than full vitualization. 
    
- If majority of the servers run linux. They why virtualization?
    
    You need some form of isolation. ***Then go for lightweight virtualization.***  
    
    Container Virtualization - OS Level Virtualization [Docker] - **But Must Share the same OS Kernel.** 
    
    ![Untitled](Virtualization%20d78d7910ce6146ad87a8b3cdd6c90ebd/Untitled%205.png)
    
    - Application Level Virtualization - JVM.
- Server Migration. For migrating containers to different servers.
    
    Pre Copy - Copy Memory Contents Before Starting Destination VM.
    
    Post Copy - Copy Memory Contents on Demand.
    
    ![Untitled](Virtualization%20d78d7910ce6146ad87a8b3cdd6c90ebd/Untitled%206.png)