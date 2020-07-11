package linkedlist

import java.util.*

class InsertingANodeIntoASortedDoublyLinkedList {

    class DoublyLinkedListNode(nodeData: Int) {
        public var data: Int
        public var next: DoublyLinkedListNode?
        public var prev: DoublyLinkedListNode?

        init {
            data = nodeData
            next = null
            prev = null
        }

        override fun toString(): String {
            return "DoublyLinkedListNode(data=$data, next=$next, prev=$prev)"
        }


    }

    class DoublyLinkedList {
        public var head: DoublyLinkedListNode?
        public var tail: DoublyLinkedListNode?

        init {
            head = null
            tail = null
        }

        public fun insertNode(nodeData: Int) {
            var node = DoublyLinkedListNode(nodeData)

            if (head == null) {
                head = node
            } else {
                tail?.next = node
                node?.prev = tail
            }

            tail = node
        }

    }

    fun printDoublyLinkedList(head: DoublyLinkedListNode?, sep: String) {
        var node = head;

        while (node != null) {
            print(node?.data)
            node = node?.next

            if (node != null) {
                print(sep)
            }
        }
    }

// Complete the sortedInsert function below.

/*
 * For your reference:
 *
 * DoublyLinkedListNode {
 *     data: Int
 *     next: DoublyLinkedListNode
 *     prev: DoublyLinkedListNode
 * }
 *
 */

    // TODO this problem is unsolved
    fun sortedInsert(llist: DoublyLinkedListNode?, data: Int): DoublyLinkedListNode? {
        if (llist == null) {
            val node = DoublyLinkedListNode(data)
            return node
        }
        var node: DoublyLinkedListNode = llist
        while (node != null) {
            if (node.data >= data) {
                val i = DoublyLinkedListNode(data)
                i.prev = node.prev
                i.next = node
                node.prev = i
                return if (i.prev == null) {
                    i
                } else {
                    i.prev?.next = i
                    llist
                }
            }
            if (node.next == null) {
                val i = DoublyLinkedListNode(data)
                i.prev = node
                i.next = null
                node.next = i
                break
            }
            node = node.next!!
        }
        return llist
    }

    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)

        val t = scan.nextLine().trim().toInt()

        for (tItr in 1..t) {
            val llistCount = scan.nextLine().trim().toInt()
            val llist = DoublyLinkedList()

            for (i in 0 until llistCount) {
                val llist_item = scan.nextLine().trim().toInt()
                llist.insertNode(llist_item)
            }

            val data = scan.nextLine().trim().toInt()

            val llist1 = sortedInsert(llist?.head, data)

            printDoublyLinkedList(llist1, " ")
        }
    }
}
