
package seminar4;

import seminar4.tasks.Task1;
import seminar4.tasks.Task2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> originLinkedList = new LinkedList<>();

        originLinkedList.push("Some");
        originLinkedList.push("men");
        originLinkedList.push("interpret");
        originLinkedList.push("nine");
        originLinkedList.push("memos");

        System.out.println(originLinkedList);
        Task1.reverseLinkedList(originLinkedList);

        Task2.enqueue(originLinkedList, "intelligent");

        System.out.println(Task2.dequeue(originLinkedList));
        System.out.println(originLinkedList);

        System.out.println(Task2.first(originLinkedList));
        System.out.println(originLinkedList);
    }
}
