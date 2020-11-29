package collectionEx.treeSet;

import collectionEx.Member;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeset;

    public MemberTreeSet() {
        treeset = new TreeSet<Member>();
    }

    public void addMember(Member member){
        treeset.add(member);
    }

    public void removeMember(int id){
        for(Member m : treeset){
            if(m.getMemberId() == id){
                treeset.remove(m);
                return;
            }
        }
    }

    public void showAll () {
        for(Member m : treeset){
            System.out.println(m.getMemberId());
        }
    }

}
