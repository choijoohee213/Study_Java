package collectionEx.hashSet;

import collectionEx.Member;

public class HashSetTest {
    public static void main(String[] args){
        MemberHashSet hashset = new MemberHashSet();

        Member lee = new Member(1, "lee");
        Member choi = new Member(2, "choi");
        Member kim = new Member(3, "kim");
        Member park = new Member(4, "park");

        hashset.addMember(lee);
        hashset.addMember(choi);
        hashset.addMember(kim);
        hashset.addMember(park);

        hashset.showAll();

        hashset.removeMember(3);
        Member park2 = new Member(3, "park2");
        hashset.addMember(park2);
        hashset.showAll();
    }
}
