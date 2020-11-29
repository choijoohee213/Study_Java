package collectionEx.treeSet;

import collectionEx.Member;

public class TreeSetTest {
    public static void main(String[] args){
        MemberTreeSet treeset = new MemberTreeSet();

        Member lee = new Member(2, "lee");
        Member choi = new Member(4, "choi");
        Member kim = new Member(1, "kim");
        Member park = new Member(3, "park");

        treeset.addMember(lee);
        treeset.addMember(choi);
        treeset.addMember(kim);
        treeset.addMember(park);

        treeset.showAll();

        treeset.removeMember(3);
        Member park2 = new Member(2, "park2");
        treeset.addMember(park2);
        treeset.showAll();
    }
}
