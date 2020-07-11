package linkedlist

import java.util.*

class InsertANodeAtASpecificPosition {
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

// Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     data: Int
     *     next: SinglyLinkedListNode
     * }
     *
     */
    fun insertNodeAtPosition(llist: SinglyLinkedListNode?, data: Int, position: Int): SinglyLinkedListNode? {
        var selectedNode: SinglyLinkedListNode? = llist
        for (index in 1 until position) {
            selectedNode = selectedNode?.next
        }

        val newNode = SinglyLinkedListNode(data)
        newNode.next = selectedNode?.next

        selectedNode?.next = newNode

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

        val data = scan.nextLine().trim().toInt()

        val position = scan.nextLine().trim().toInt()

        val llist_head = insertNodeAtPosition(llist?.head, data, position)

        printSinglyLinkedList(llist_head, " ")
    }
}
