package linkedlist

import java.util.*

class DeleteDuplicate {


    class SinglyLinkedListNode(nodeData: Int) {
        public var data: Int
        public var next: SinglyLinkedListNode?

        init {
            data = nodeData
            next = null
        }

        override fun toString(): String {
            return "SinglyLinkedListNode(data=$data, next=$next)"
        }


    }

    class SinglyLinkedList {
        public var head: SinglyLinkedListNode?
        public var tail: SinglyLinkedListNode?

        init {
            head = null
            tail = null
        }

        public fun insertNode(nodeData: Int) {
            var node = SinglyLinkedListNode(nodeData)

            if (head == null) {
                head = node
            } else {
                tail?.next = node
            }

            tail = node
        }

    }

    fun printSinglyLinkedList(head: SinglyLinkedListNode?, sep: String) {
        var node = head;

        while (node != null) {
            print(node?.data)
            node = node?.next

            if (node != null) {
                print(sep)
            }
        }
    }

    // Complete the removeDuplicates function below.
    fun removeDuplicates(head: SinglyLinkedListNode?): SinglyLinkedListNode? {
        if (head == null) return head

        if (head.data == head.next?.data) {
            head.next = head.next?.next
            removeDuplicates(head)
        } else {
            removeDuplicates(head.next)
        }

        return head
    }

    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)

        val t = scan.nextLine().trim().toInt()

        for (tItr in 1..t) {
            val llistCount = scan.nextLine().trim().toInt()
            val llist = SinglyLinkedList()

            for (i in 0 until llistCount) {
                val llist_item = scan.nextLine().trim().toInt()
                llist.insertNode(llist_item)
            }

            val llist1 = removeDuplicates(llist?.head)

            printSinglyLinkedList(llist1, " ")
        }
    }
}
