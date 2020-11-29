package collectionEx.arrayList;

import collectionEx.Member;
import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> memberList;

    public MemberArrayList(){
        memberList = new ArrayList<Member>();
    }

    public void addMember(Member member){
        memberList.add(member);
    }

    public boolean removeMember(int id){
        for(Member m : memberList){
            if(m.getMemberId() == id){
                memberList.remove(m);
                return true;
            }
        }
        System.out.println("멤버 " +id+"가 존재하지 않습니다.");
        return false;
    }

    public void showAll() {
        for(Member m : memberList){
            System.out.println(m);
        }
    }
}
