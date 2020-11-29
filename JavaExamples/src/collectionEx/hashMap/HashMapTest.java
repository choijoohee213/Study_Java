package collectionEx.hashMap;

import collectionEx.Member;

public class HashMapTest {
    public static void main(String[] args){
        MemberHashMap hashmap = new MemberHashMap();

        Member lee = new Member(2, "lee");
        Member choi = new Member(2, "choi");
        Member kim = new Member(3, "kim");
        Member park = new Member(1, "park");

        hashmap.addMember(lee);
        hashmap.addMember(choi);
        hashmap.addMember(kim);
        hashmap.addMember(park);

        hashmap.showAll();

        hashmap.removeMember(3);
        Member park2 = new Member(3, "park2");
        hashmap.addMember(park2);
        hashmap.showAll();
    }
}
