package linkedlist

import java.util.*

class PrintInReverse {
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

// Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     data: Int
     *     next: SinglyLinkedListNode
     * }
     *
     */
    fun reversePrint(llist: SinglyLinkedListNode?): Unit {
        if (llist == null)
            return

        val stack = Stack<Int>()
        var selectedNode = llist

        do {
            stack.add(selectedNode?.data)
            selectedNode = selectedNode?.next
        } while (selectedNode != null)


        while (stack.isNotEmpty()) {
            println(stack.pop())
        }
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

            reversePrint(llist?.head)
        }
    }
}
