# Cloud and Data Centre Efficency

- Glossary
    
    TCO - Total cost of ownership (an estimate of all the direct and indirect costs involved in acquiring and operating a product or system over its lifetime).
    
    Amortized - Payback Debt in installments.
    
    Cost Efficency - Cost efficiency is **the act of saving money by changing a product or process to work in a better way.** You can measure cost efficiency by **monitoring the ratio of the output produced to the cost incurred.** You can also measure cost efficiency by the revenue generated against the expenses incurred.
    
    Colocation - A colocation facility, or colo, is **a data center facility in which a business can rent space for servers and other computing hardware**
    .
    
- Problems
    
    **Hiring more Servers Takes a Minute or Two, They main problem is to estimate, the load, in advance. Which is never possible. This is applicable for extremely, unstable state. Case study three.**
    

---

Clouds use virtualization. 

### Week 9 - Resource Perspective.

- Spider Diagram

Resource Underprovisioning. Resource Overprovisioning.

Average Resource Provisioning is nearly 20%. 

Dynammic Resource Provisioning Using Virtualization. Predicting demand is not easy, generally very hard. 

*Provisioning means **"providing" or making something available. Resource Provisioning [Setting up a server with a fixed load capability] is generally fixed and cannot be changed. Unless you use clouds.***

People dont want to wait, they want the response straight away.  So people overprovision, during anticipated peak loads. 

Network overprovisioning – or, **adding additional capacity to the network**
 – is a common tactic used by IT teams to maintain performance during periods of network failures or surges that occur due to unpredictable demand.

---

- **What are three types of cloud services - Iaas, Paas, S as a service.**
    
    SaaS - Google Drive, DropBox.
    
    PaaS - Heroku, AWS elasticbeans. Software Stacks that help clients to build web applications.
    
    IaaS - Software stack that helps the client load entire system images. Goocle Compute Engine, Amazon Elastic Compute Cloud.
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled.png)
    
- **What does cloud computing address? What are the two most important ones?**
    
    ### ***Cost Efficiency  (C/E)  -  Decreases Capital Expenditure, Operating Expenses.***
    
    CE = Total Costs by Outcome.
    
    ### *Utilisation - **Dynamic Resource Utilization.***
    
    Consolidation - 
    
    Economies of Scale - **Reduced Overhead Costs, Buyer Power through volume purchasing.** 
    
- **Cloud Economics. What are the three most important ones?**
    
    Cost of Power - More Server More Power Costs. Hardware costs have reduces, Power Costs Have Increased.
    
    Infrastructure Labour Costs - Larger Data Centres are managed by one to 10 employees. No need to hire inhand employees.
    
    Buyer Power - Large Data Centres Can buy Equipment in Bulk.
    
- **Cloud Elasticity**
    
    Dynamic Resource Provisioning (Improves Cost Efficency) → and←Using Cloud Elasticity (Utilizing Virtualization) which is basically eliminates cost for resource decommissioning/termination. 
    
- **What Enables Cloud Technologies?**
    
    **Resource Virtualization.**
    
    **Utility Computing - Cost Efficiency. PAYG - this is very tricky. AWS had all this.**
    
- **Cloud Stack** **for Iaas, Paas, Saas** **?** Important
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%201.png)
    
- **What are some Cloud Deployment Models ?**
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%202.png)
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%203.png)
    
- **Why Hybrid ?**
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%204.png)
    
- **Resource Under - Provisioning ?**
    
    Walmart Example. If you cannot handle, will cause millions of dollars loss.
    
- **What are Efficency Solutions?**
    
    **Workload Offloading** - Offload load to public cloud, problems with Data Consistency.
    
    **Resource Scaling** - **Vertical Scaling** [Scaling up] problem is physical limitations [Example  64 cores]. **Horizontal Scaling** [Scaling Out] problem is Netwoking Overhead communciaton problems. Scaleout is more common. Available frameworks to use.
    
     
    
- **80% provisioining is % is good. 100 % is bad, job quening, overheating and things.**

---

### Week 10 - Resource in terms of Jobs perspective.

Long running jobs like web services. Like streaming. 

DAG - Directed Acyclic Graphs.  Job consits of multiple tasks, with dependencies. 

Map Reduce - Word counting in a million pages[Big Data]. Break the big data into multiple smaller chunks,1000 Chunks, run processing on these 1000 chunks, combine the results. 

Makespan - Completion time of a job with multiple tasks. [Every task result is combined].

Dorminant Resource Fair Scheduling  - Multiple Jobs have different requirements. Use DRF [Dorminant Resource Fair Scheduling], Based on DRF allocate resources. 

Application - > Process → Mutliple Processes → Multiple Tasks. 

- **Jobs**
    
    Jobs with subjobs are called tasks.
    
    Any application when run, has OS process.  Which will have multiple processes.
    
    Many applications, run in parallel. 
    
- **Job Types**
    
    A. Structure. 
    
    1. **Sequential** - Programs running from top to bottom.
    2. **Parallel** - tasks can run parallely, map reduce.
        1. Embarasingly Parallel Tasks - This is often the case where there is little or no dependency or need for communication between those parallel tasks
        2. Scientific Workflow Applications.
    
    B. Priority 
    
    1. Latency Sensitive - Real Time.
    2. Best Effort - Batch Jobs with no hard deadline.
    
    C. Runtime
    
    1. Shot Live - small life span.
    2. Long Running - Web Services.
- **Resource Sharing**
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%205.png)
    
- **Job Colocation**
    
    Google has been using docker for years, this is a trade secret.
    
    Usage is estimated and google handles like this. 
    
    Yellow  -  Buffer
    
    Blue - Best Effort Jobs run parallely.
    
    Green - Spare Resources
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%206.png)
    
- **Resource Consumption Shaping - How to smartly allocated resources in a job centre ?**
    
    Can you break peaks workload and defer them to lower workload periods. ? Smart
    
    Reschedule non critical workloads, such as best effort or non synchronous jobs during workload peak at much lower prices(1/10th of the price). Win for customer, win for amazon. Example AWS Spot Instances. 
    
    If your work is not mission critical, can you wait and run during our workload valley?
    
    It work load spikes, the spot instances are terminated, risk is on customer.
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%207.png)
    
- **Importance of Scheduling**
    
    *Scalability, Fairness and Fault Tolerance.*
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%208.png)
    
- **Scheduling Metrics**
    
    Turnaround time = waiting time + execution time.
    
    Makespan - Job with mutiple tasks. Each tasks has turaround time, but part of one job. Job completion time is called Markespan. 
    
    Throughput - give time unit, how much workload is processed.
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%209.png)
    
- **How to be fair to jobs which require multiple resources ?**
    
       
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%2010.png)
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%2011.png)
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%2012.png)
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%2013.png)
    

### Week 11 - Cost/Energy Efficency

---

Hardware prices have dropped significantly, **Issues with operating expenses - Energy [for operation and cooling], Labour.**

Energy Efficency. Ideal case and Real Case.

- **Why energy efficency?**
    
    Reducing Energy Costs, Reduces Overall Expenses. Increasing Cost Efficency Increases.
    
- **TCO ? Total Operating Costs = OPEX + CAPITAL EXPENDITURE.**
    
     
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%2014.png)
    
    1. **Servers Cost First.**
    2. **Power and Cooling, Costs Second.**
    3. Power - Energy Cost. 
    4. Other Infrastructure.
- **Cost Efficiency**
    
    Keeping on adding servers, will not provide linear decrease in execution cost.  because you are charged per hour.
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%2015.png)
    
- **Usage Patterns. What are the three usage patterns?**
    
    Spiky, Steady and Unstable
    
- **What are four options for cloud? What is the analogy ?**
    
    *Prepaid - Reserved and Postpaid - On Demand. Generally prepaid is cheaper, postpaid is expensive.*
    
    1. On premises - Private Data Centre.
    2. AWS Option One - Using all reserved instances.  6 Servers - Used for Steady State.
    3. AWS option Two - Mix of on demand and reserved.  6 + Hire more when needed.  - Could be used for Steady State. 
    4. Aws option three - All on Demand Instances only. 
- **Price Calculation. Cloud is not always the cheapest. You should know your workload? Why is stability needed?**
    
    **Remember to divide upfront cost by 36.**
    
    **You can plan in stability.**
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%2016.png)
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%2017.png)
    
- **Spiky State**  **- Go for Hybrid.**
- **Energy Efficency**
    
    Turning servers off is not really possible, because of agreements of public servers companies with clients.
    
    Idle server continues to consume nearly 20%. if peak power consumption energy. 
    
- **Energy Efficency Diagram**
    
    Left Side - Reality , Even when utilization is zero, power isahe os nearly 50%. 100% server utilization is dangerous, overheating, failure.
    
    Right Side - Ideal, 0 percent utilization should use least power. This is not the case. Power should increase linearly with Significant increase in Utilization.
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%2018.png)
    
- **Energy Efficency Metrics**
    
    PUE - Facility Power / Equipment Power - Lower is better. 1.0 is really unreal. 
    
    DCIE - 1 / PUE * 100;
    
    PUE includes, PSU, Voltage Regulator Down. (RVD).
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%2019.png)
    
     
    
- **How to improve energy efficency?**
    1. Resource Provisioning - Most Sustainable - Improving Utilzation Rate - Reducing Expenses - Gist is scheduling. 
    2. Power Efficent Hardware - Effective Hardware. 
    3. Workoffloading - Laundry to off peak period.
    4. Thermal Management Techniques - Splittig load across servers, to make sure they dont emit more heat, so cooling can be much less. 
- **Can PUE be less than 1.0?**
    
    Data centre providing heat, using this heat to warm the centre, or crops to sell money. Reduce from cost.
    
- **Problems with efficency solutions?**
    
    Resource Heterogeneity.
    
    Workload Heterogeneity.
    
- **Efficency Measures**
    
    SLI  - Service Level Indicators  - What to measure. Uptime, Performance.
    
    SLO - Service Level Objectives - 99.9 % of Uptime.
    
    SLA - Service Level Agreements [Legal Responsibilities]  - SLO + Consequences.
    

---

### Week 12 - Serverless Computing, Server Computing.

Serverless is **a cloud-native development model that allows developers to build and run applications without having to manage servers.**There are still servers in serverless, but they are abstracted away from app development.

![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%2020.png)

---

### Week 13 - Edge Computing.

Devices on the edge of a network.  Video data accounts for 80 % of the data. These are uploaded to clouds for archiving, pattern recogonition etc. 

Latency Dependent Processing - Realtime Processing - Example Dash Cam Footage Identify - Causing High Bandwith consumption - To reduce bottleneck, we use edge servers/nodes. They preprocesss and upload to cloud.

Why edge server/nodes ? - Lot of Data, Realtime Processing Requirements is the driving force for edge computing. 

### Important Questions

---

- **IaaS, Paas, Saas**
    
    Iaas- Google Compute Engine, AWS EC2
    
    Platform as a Service - Heroku, Microsoft Azure.
    Software as a Service - Dropbox, Microsoft Office Suite.
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%2021.png)
    

DCIE is calculated in percentage. 10 % of peak power.

- **Scaling up ?**
    
    Adding resources to single node in a system.
    
- **Scaling out? However, network overhead.**
    
    Adding more **smaller** servers to the cluster.
    
    Most jobs are not completely independent, so no linear increase in time.
    
- **Dorminant Resource Fairness?**
    
    Jobs 1 % of Dorminant Type = Jobs 2% of Dorminant Type. 
    
    Dorminant % of the total resource type is allocated.
    
- **Why not Cloud Computing?**
    
    DSP,DC,RDoubtfull
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%2022.png)
    
- **What is Cloud Elasticity ?**
    
    ![Untitled](Cloud%20and%20Data%20Centre%20Efficency%20744922edd79f4ad0b3eff93cada3c16c/Untitled%2023.png)
    

Devices on the edge of a network.  Video data accounts for 80 % of the data. These are uploaded to clouds for archiving, pattern recogonition etc. 

Latency Dependent Processing - Realtime Processing - Example Dash Cam Footage Identify - Causing High Bandwith consumption - To reduce bottleneck, we use edge servers/nodes. They preprocesss(Video Summarization) and upload to cloud.

Why edge server/nodes ? - Lot of Data, Realtime Processing Requirements is the driving force for edge computing. 

Edge computing involves computation of data generated by end user devices. 80 % of edge user data is video data. Edge computing involves latency dependend processing, Realtime CCTV monitoring, Autonomous vehicle 

Example of Edge Computing - Federated Learning, Edge Based Video Summarization. 

Edge computing - Unreliable, Limited Capacity. Low Latency.

Federated Learning - Collaborated Machine Learning without centralized training data. Data is kept locally, so privacy concerns and network overhead is mitigated.