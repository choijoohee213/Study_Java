package collectionEx.hashMap;

import collectionEx.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashmap;

    public MemberHashMap() {
        hashmap = new HashMap<Integer,Member>();
    }

    public void addMember(Member member){
        hashmap.put(member.getMemberId(), member);
    }

    public void removeMember(int id){
        if(hashmap.containsKey(id)){
            hashmap.remove(id);
            return;
        }
    }

    public void showAll() {
        Iterator<Integer> ir = hashmap.keySet().iterator();
        while(ir.hasNext()){
            int key = ir.next();
            Member m = hashmap.get(key);
            System.out.println(m);
        }
    }
}
