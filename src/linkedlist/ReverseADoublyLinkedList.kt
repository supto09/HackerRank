package linkedlist

import java.util.*

class DoublyLinkedListNode(nodeData: Int) {
    public var data: Int
    public var next: DoublyLinkedListNode?
    public var prev: DoublyLinkedListNode?

    init {
        data = nodeData
        next = null
        prev = null
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

// Complete the reverse function below.

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
fun reverse(llist: DoublyLinkedListNode?): DoublyLinkedListNode? {


    // with recursion
/*    if (llist == null) return llist
    val temp = llist.next
    llist.next = llist.prev
    llist.prev = temp

    return if (llist.prev != null)
        reverse(llist.prev)
    else
        llist*/


    if (llist == null) return llist
    var currentNode = llist
    while (true) {
        val temp = currentNode?.next
        currentNode?.next = currentNode?.prev
        currentNode?.prev = temp

        if (currentNode?.prev != null)
            currentNode = currentNode.prev
        else
            return currentNode
    }
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

        val llist1 = reverse(llist?.head)

        printDoublyLinkedList(llist1, " ")
    }
}
