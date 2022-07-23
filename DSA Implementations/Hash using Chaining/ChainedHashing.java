import java.util.LinkedList;

public class ChainedHashing {
    static LinkedList[] chain;
    int bucketSize;

    public ChainedHashing(int bucketSize){
        chain = new LinkedList[bucketSize];
        this.bucketSize = bucketSize;
    }
    public void set(LinkedList value, int position){
        if(chain[position] == null){
            chain[position] = value; 
        } else {
            LinkedList node = chain[position];
            node.addFirst(value);
        }
    }

    public int search(LinkedList value){
        for(LinkedList node : chain){
            if(node == null){
                continue;
            }
            int index = node.indexOf(value);
            if(index != -1){
                return index;
            }
        }
        return -1;
    }

    public void delete(LinkedList value){
        for(LinkedList node : chain){
            if(node == null){
                continue;
            }
            Boolean flag = node.remove(value);
            if (flag == true) return;
        }
    }

    public void insert(LinkedList value){


        
    }

}
