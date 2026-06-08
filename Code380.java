import java.util.*;
class RandomizedSet {
    private HashMap<Integer,Integer> hm;
    private ArrayList<Integer> al;
    public RandomizedSet() {
        hm=new HashMap<>();
        al=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val))
        return false;
        else
        {
            hm.put(val,al.size());
            al.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!hm.containsKey(val))
        return false;
        int i=hm.get(val);
        int last=al.get(al.size()-1);
        al.set(i,last);
        hm.put(last,i);
        al.remove(al.size()-1);
        hm.remove(val);
        return true;
    }
    
    public int getRandom() {
        return al.get(new Random().nextInt(al.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */