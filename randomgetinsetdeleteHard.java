import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class randomgetinsetdeleteHard {
    class RandomizedCollection {

    HashMap<Integer,HashSet<Integer>>map=new HashMap<>();

    List<Integer>list=new ArrayList<>();


    Random r;


    public RandomizedCollection() {
        map=new HashMap<>();
        list=new ArrayList<>();
        r=new Random();          
    }
    
    public boolean insert(int val) {
        boolean flag;
        HashSet<Integer>set;
        if(map.containsKey(val)==true){
            set=map.get(val);
            flag=false;
        }else{
            set=new HashSet<>();
            flag=true;
        }

        set.add(list.size());
        list.add(val);
        map.put(val,set);

        
        return flag;
    }
    
    public boolean remove(int val) {
        
        HashSet<Integer>set;
        boolean flag;

        if(map.containsKey(val)){
            set=map.get(val);
            flag=true;
        }else{
            return false;
        }

        int rmidx=-1;

        for(int i:set){
            rmidx=i;
            break;
        }
        
        set.remove(rmidx);

        map.put(val,set);

        if(map.get(val).size()==0){
            map.remove(val);
        }

        if(rmidx==list.size()-1){
            list.remove(rmidx);
        }else{
            list.set(rmidx,list.get(list.size()-1));
            list.remove(list.size()-1);
            int newVal=list.get(rmidx);

            HashSet<Integer>newSet=map.get(newVal);
            newSet.remove(list.size());
            newSet.add(rmidx);
            map.put(newVal,newSet);
        }

        return flag;
    }
    
    public int getRandom() {
        int randidx=r.nextInt(0,list.size());

        return list.get(randidx);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}
