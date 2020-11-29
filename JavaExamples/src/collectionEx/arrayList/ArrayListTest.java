package collectionEx.arrayList;

import collectionEx.Member;

public class ArrayListTest {
    public static void main (String[] args){
        MemberArrayList list = new MemberArrayList();
        Member lee = new Member(1, "lee");
        Member choi = new Member(2, "choi");
        Member kim = new Member(3, "kim");
        Member park = new Member(4, "park");

        list.addMember(lee);
        list.addMember(choi);
        list.addMember(kim);
        list.addMember(park);

        list.showAll();

        list.removeMember(3);
        list.showAll();
    }
}
