package collectionEx.treeMap;

import collectionEx.Member;

public class TreeMapTest {
    public static void main(String[] args){
        MemberTreeMap treemap = new MemberTreeMap();

        Member lee = new Member(2, "lee");
        Member choi = new Member(4, "choi");
        Member kim = new Member(1, "kim");
        Member park = new Member(3, "park");

        treemap.addMember(lee);
        treemap.addMember(choi);
        treemap.addMember(kim);
        treemap.addMember(park);

        treemap.showAll();

        treemap.removeMember(3);
        Member park2 = new Member(3, "park2");
        treemap.addMember(park2);
        treemap.showAll();
    }
}
