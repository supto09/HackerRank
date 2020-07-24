package problemsolving.datastructure.linkedlist

import java.util.*

class DeleteANode {
    class SinglyLinkedListNode(nodeData: Int) {
        public var data: Int
        public var next: SinglyLinkedListNode?

        init {
            data = nodeData
            next = null
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

// Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     data: Int
     *     next: SinglyLinkedListNode
     * }
     *
     */
    fun deleteNode(llist: SinglyLinkedListNode?, position: Int): SinglyLinkedListNode? {
        var currentNode = llist
        var nextNode = llist?.next

        if (position == 0)
            return nextNode

        for (index in 1 until position) {
            currentNode = nextNode
            nextNode = nextNode?.next
        }


        currentNode?.next = nextNode?.next

        return llist
    }

    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)

        val llistCount = scan.nextLine().trim().toInt()
        val llist = SinglyLinkedList()

        for (i in 0 until llistCount) {
            val llist_item = scan.nextLine().trim().toInt()
            llist.insertNode(llist_item)
        }

        val position = scan.nextLine().trim().toInt()

        val llist1 = deleteNode(llist?.head, position)

        printSinglyLinkedList(llist1, " ")
    }
}
