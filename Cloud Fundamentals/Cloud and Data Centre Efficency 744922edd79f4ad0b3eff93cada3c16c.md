# Cloud and Data Centre Efficency

- Glossary
    
    TCO
    Total cost of ownership (an estimate of all the direct and indirect costs involved in acquiring and operating a product or system over its lifetime).
    
    Cost Efficency 
    
    Cost efficiency is **the act of saving money by changing a product or process to work in a better way.**
    You can measure cost efficiency by **monitoring the ratio of the output produced to the cost incurred.** You can also measure cost efficiency by the revenue generated against the expenses incurred.
    
- Problems
    
    **Hiring more Servers Takes a Minute or Two, They main problem is to estimate, the load, in advance. Which is never possible.**
    

---

Clouds use virtualization. 

People dont want to wait, they want the response straight away.  So people overprovision, during anticipated peak loads. 

Network overprovisioning – or, **adding additional capacity to the network**
 – is a common tactic used by IT teams to maintain performance during periods of network failures or surges that occur due to unpredictable demand.

- **What are three types of cloud services - Iaas, Paas, S as a service.**
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled.png)
    
- **What does cloud computing address?**
    
    ### ***Cost Efficiency  (C/E)  -  Capital Expenditure, Operating Expenses.***
    
    Utilisation - **Dynamic Resource Utilization.**
    
    Consolidation - 
    
    Economies of Scale - **Reduced Overhead Costs, Buyer Power through volume purchasing.** 
    
- **Cloud Economics**
    
    Cost of Power - More Server More Power Costs. Hardware costs have reduces, Power Costs Have Increased.
    
    Infrastructure Labour Costs - Larger Data Centres are managed by one to 10 employees. No need to hire inhand employees.
    
    Buyer Power - Large Data Centres Can buy Equipment in Bulk.
    
- **Cloud Elasticity**
    
    Dynamic Resource Provisioning (Improves Cost Efficency) → and←Using Cloud Elasticity (Utilizing Virtualization) which is basically eliminates cost for decommissioning/termination. 
    
- **What Enables Cloud Technologies?**
    
    Resource Virtualization.
    
    Utility Computing - Cost Efficiency. **PAYG - this is very tricky. AWS had all this.**
    
- **Cloud Stack** **for Iaas, Paas, Saas** **?**
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%201.png)
    
- **What are some Cloud Deployment Models ?**
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%202.png)
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%203.png)
    
- **Why Hybrid ?**
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%204.png)
    
- 

---

### Week 9 - Efficency in terms of Resource perspective.

- Spider Diagram

Resource Underprovisioning. 

Resource Overprovisioning - Average Resource Provisioning is nearly 20%. 

Dynammic Resource Provisioning Using Virtualization. Predicting demand is not easy, generally very hard. 

*Provisioning means **"providing" or making something available. Resource Provisioning is generally fixed and cannot be changed. Unless you use clouds.***

---

### Week 10 - Resource in terms of Jobs perspective.

Long running jobs like web services. Like streaming. 

DAG - Directed Acyclic Graphs.  Job consits of multiple tasks, with dependencies. 

Map Reduce - Word counting in a million pages[Big Data]. Break the big data into multiple smaller chunks,1000 Chunks, run processing on these 1000 chunks, combine the results. 

Makespan - Completion time of a job with multiple tasks. [Every task result is combined].

Dorminant Resource Fair Scheduling  - Multiple Jobs have different requirements. Use DRF [Dorminant Resource Fair Scheduling], Based on DRF allocate resources. 

---

### Week 11 - Cloud and Data Centre Efficency

Hardware prices have dropped significantly, **Issues with operating expenses - Energy[for operation and cooling], Labour.**

4 options for cloud 

1. On premises - Private Data Centre.
2. AWS Option One - Using all reserved instances.  4 Servers
3. AWS option Two - Mix of on demand and reserved.  4 + Hire more when needed.
4. Aws option three - All on Demand Instances only. 

---

Energy Efficency 

Ideal case and Real Case.

---

### Week 12 - Serverless Computing, Server Computing.

Serverless is **a cloud-native development model that allows developers to build and run applications without having to manage servers.**There are still servers in serverless, but they are abstracted away from app development.

![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%205.png)

---

### Week 13 - Edge Computing.

Devices on the edge of a network.  Video data accounts for 80 % of the data. These are uploaded to clouds for acrhiving, pattern recogonition etc. 

Latency Dependent Processing - Realtime Processing - Example Dash Cam Footage Identify - Causing High Bandwith consumption - To reduce bottleneck, we use edge servers/nodes. They preprocesss and upload to cloud.

Why edge server/nodes ? - Lot of Data, Realtime Processing Requirements is the driving force for edge computing.