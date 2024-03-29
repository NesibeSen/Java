package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
public class C02_LinkedList {
    public static void main(String[] args) {
        // List'den gelen ozellikleri biliyoruz
        // onun icin Deque'den gelen ozelliklere bakalim
        Deque<Integer> ll1 = new LinkedList<>();
        ll1.addFirst(10); // basa element ekler
        ll1.addLast(20); // sona element ekler, add() gore daha hizlidir
        System.out.println(ll1);
        System.out.println(ll1.element()); // ilk elementi silmeden bize dondurur
        // ilk element yoksa exception firlatir
        System.out.println(ll1);
        System.out.println( ll1.getLast() ); // son elementi silmeden bize dondurur
        System.out.println( ll1.getFirst() ); // ilk elementi silmeden bize dondurur
        ll1.offer(30); // sona ekler ama bize birsey dondurmez
        System.out.println(ll1);
        ll1.offerLast(40); // // sona ekler ve bize true dondurur
        System.out.println(ll1);
        ll1.offerFirst(50);
        System.out.println(ll1);
        System.out.println(ll1.peek());// ilk elementi silmeden bize dondurur,
        // bulamazsa null dondurur
        ll1.poll();
    }

}
