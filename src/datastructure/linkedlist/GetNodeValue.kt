package datastructure.linkedlist

import java.util.*

class GetNodeValue {
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

// Complete the datastructure.linkedlist.getNode function below.

    /*
     * For your reference:
     *
     * datastructure.linkedlist.SinglyLinkedListNode {
     *     data: Int
     *     next: datastructure.linkedlist.SinglyLinkedListNode
     * }
     *
     */
    fun getNode(llist: SinglyLinkedListNode?, positionFromTail: Int): Int {
        var currentNode = llist
        val valueStack = Stack<Int>()
        while (currentNode != null) {
            valueStack.add(currentNode.data)
            currentNode = currentNode.next
        }


        var result = 0
        for (index in 0..positionFromTail) {
            result = valueStack.pop()
        }

        return result
    }

    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)

        val tests = scan.nextLine().trim().toInt()

        for (testsItr in 1..tests) {
            val llistCount = scan.nextLine().trim().toInt()
            val llist = SinglyLinkedList()

            for (i in 0 until llistCount) {
                val llist_item = scan.nextLine().trim().toInt()
                llist.insertNode(llist_item)
            }

            val position = scan.nextLine().trim().toInt()

            val result = getNode(llist?.head, position)

            println(result)
        }
    }
}
