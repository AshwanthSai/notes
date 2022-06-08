# Virtualization

Technology was made for weapons. 

We have been using some form of virtualization. VMware, Ubuntu and Things.

- Glossary
    
    Bare Metal - VM On Servers
    
    Host Operating Systems - VM on OSes
    
    Guest Operating Systems - Complete Operating Systems
    
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
    
- What is Noisy Neighbour affect? What resources are most affected ?
    
    When multiple VMs use the same set of physical resources. There is never perfect isolation and resource contention problems.
    
- What are two virtualization methods?
    
    Full Virtualization - No Os Source Modfication.
    
    Para Virtualization  - Slight OS Modification.  The Guest OS is aware of virtualization, gives better performance than full vitualization. 
    
- If majority of the servers run linux. They why virtualization?
    
    You need some form of isolation. ***Then go for lightweight virtualization.***  
    
    Container Virtualization - OS Level Virtualization [Docker] - **But Must Share the same OS Kernel.** 
    
    ![Untitled](Virtualization%20d78d7910ce6146ad87a8b3cdd6c90ebd/Untitled%205.png)
    
    - Application Level Virtualization - JVM.
- Server / VM Migration, **Moving containers to different servers? - IMP**
    
    VMs, Snapshots can start running processes, from where they are paused. 
    
    So you can move them around for more efficent operation. They key problem while moving around is to copy memory instances. 
    
    ![Untitled](Virtualization%20d78d7910ce6146ad87a8b3cdd6c90ebd/Untitled%206.png)
    
    ![Untitled](Virtualization%20d78d7910ce6146ad87a8b3cdd6c90ebd/Untitled%207.png)
    
    ![Untitled](Virtualization%20d78d7910ce6146ad87a8b3cdd6c90ebd/Untitled%208.png)
    
    If VMs are customer facing, youll need to migrate Live. 
    
    Pre-Copy - Copy Memory Contents before running destination VM. Disruption is negligible.
    
    Dirty pages - memory pages that has been used and updated.
    
    Post Copy - Copy Memory Contents after starting destination VM. Stop Source VM, Copy CPU State and Page Table, 
    
    A page table is the data structure used by a virtual memory system in a computer operating system to store the mapping between virtual addresses and physical addresses.
    
- Pre Copy and Post Copy
    
    **Point of reference is the Destination VM.**
    
    Pre copy is generally prefered.
    
    ![Untitled](Virtualization%20d78d7910ce6146ad87a8b3cdd6c90ebd/Untitled%209.png)
    
- Server Migration. For migrating containers to different servers.
    
    Pre Copy - Copy Memory Contents Before Starting Destination VM.
    
    Post Copy - Copy Memory Contents on Demand.
    
    ![Untitled](Virtualization%20d78d7910ce6146ad87a8b3cdd6c90ebd/Untitled%2010.png)
    

Important Questions

---

- **What are the different types of Virtualization Software ?**
    
    Type 1 - Xen, Microsoft Hyper V
    
    Type 2 - KVM (Kernal Base Virtual Machine), Virtual Box, VMware Workstation. 
    
- **What is Noisy Neighbour affect?**
    
    When multiple VMS running on a computer tries to access the same physical resources, perfect isolation is never achieved, resource contention problems arise. T
    
- **What resource is most affected by the noisy neighbour affect?**
    
    Mutliple Cores Share the same last level cache.
    
- **Server VM migration ?**
    
    Moving VMS around physical machines.  Leads to higher availability and load balancing.
    
- **Type 1 and Type 2 Virtualization ?**
    
    ![Untitled](Virtualization%20d78d7910ce6146ad87a8b3cdd6c90ebd/Untitled%2011.png)
    
- **How is server migrated, what are the types of server migration ?**
    
    Stop and Copy server migration, live migration - migration with zero down time. 
    
    Live Migration if of two types - Pre Copy and Post Copy.
    
    When memory is copied to destination vm before starting it is called Pre Copy. When memory is copied on demand after starting the vm it is called post copy.
    
- **Full Virtualization and Paravirtualization examples?**
    
    No modification, Kernal Virtual Machine and Slight Modification, Xen 
    
    Both of these support para virtualization and full virtualization.
    
- **Full Virtualization and Paravirtualization Draw?**
    
    You dont need to modify Host OS for Container, However you can run the containers only with the Same OS Kernel.
    
    ![Untitled](Virtualization%20d78d7910ce6146ad87a8b3cdd6c90ebd/Untitled%2012.png)
    
- **Post Copy and Pre Copy**
    
    ![Untitled](Virtualization%20d78d7910ce6146ad87a8b3cdd6c90ebd/Untitled%2013.png)
    
- **How does it virtualization help?**
    
    it enables dynamic resource allocation so
    
    **Resource Utilization.** 
    
    Since you can plug and play.
    
    **Higher availability.**
    
    **Productivity - Ease of testing, and deployement young m1 example.**
    
- **Advantages of Lightweight virtualization ?**
    
    Native Speeds.
    
    Share the same OS Kernel. 
    
    Better isolation of apps from each other.
    
    Works with all major linux and windows server
    
    Scalability: easy sign up new containers if needed
    Run more apps on host machine