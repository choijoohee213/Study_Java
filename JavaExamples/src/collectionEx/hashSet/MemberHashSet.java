package collectionEx.hashSet;
import collectionEx.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashset;

    public MemberHashSet() {
        hashset = new HashSet<Member>();
    }

    public void addMember(Member member){
        hashset.add(member);
    }

    public boolean removeMember(int memberId){
        Iterator<Member> iterator = hashset.iterator();
        while(iterator.hasNext()){
            Member m = iterator.next();
            if(m.getMemberId() == memberId){
                hashset.remove(m);
                return true;
            }
        }
        System.out.println("없음!");
        return false;
    }

    public void showAll () {
        for(Member m : hashset){
            System.out.println(m.getMemberName());
        }
    }
}
