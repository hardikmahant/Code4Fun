package lc;

/*
     You are given two linked lists represents two non-negative numbers.
     The digits are stored in reverse order and each of their nodes contain a single digit.
     Add the two numbers and return it as a linked list.

     Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        Node two = new Node(); two.data = 2;
        Node four = new Node();  four.data = 4;
        Node three = new Node(); three.data = 3;

        two.next = four;
        four.next = three;

        Node five = new Node(); five.data = 5;
        Node six = new Node(); six.data = 6;
        Node four2 = new Node();  four2.data = 4;

        five.next = six;
        six.next = four2;

        Node result = addTwoNumbers(two, five);
        while ( result != null ) {
            System.out.println(result);
            result = result.next;
        }

    }

    public static Node addTwoNumbers(Node a, Node b) {
        if ( a == null ) return b;
        if ( b == null ) return a;

        Node h = new Node();
        Node dummy = h;

        int carry = 0;
        while ( a != null && b != null ) {
            int total = carry + a.data + b.data;
            carry = total >= 10 ? 1 : 0;
            Node n = new Node();
            n.data = carry == 1 ? ( total % 10 ) : total ;
            dummy.next = n;
            dummy = dummy.next;

            if ( a != null ) a = a.next;
            if ( b != null ) b = b.next;
        }

        return h.next;
    }
}

class Node {
    int data;
    Node next;

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
