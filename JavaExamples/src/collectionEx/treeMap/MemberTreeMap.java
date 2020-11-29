package collectionEx.treeMap;

import collectionEx.Member;
import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treemap;

    public MemberTreeMap() {
        treemap = new TreeMap<Integer, Member>();
    }

    public void addMember(Member member) {
        treemap.put(member.getMemberId(), member);
    }

    public void removeMember(int id){
        if(treemap.containsKey(id)) {
            treemap.remove(id);
            return;
        }
    }

    public void showAll() {
        Iterator<Integer> ir = treemap.keySet().iterator();
        while(ir.hasNext()){
            int key = ir.next();
            Member m = treemap.get(key);
            System.out.println(m);
        }
    }


}
