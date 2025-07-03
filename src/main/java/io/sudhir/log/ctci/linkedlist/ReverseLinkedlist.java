package io.sudhir.log.ctci.linkedlist;

public class ReverseLinkedlist {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList(10);
        for (int i = 2; i < 8; i++) {
            new ReverseLinkedlist().addToLast(linkedList, i*10);
        }

        System.out.println("Before reverse");
        printNode(linkedList);
        System.out.println("After reverse");
        CustomLinkedList reverseLinkedList = new ReverseLinkedlist().reverseLinkedList(linkedList);
        printNode(reverseLinkedList);

        // add new element to existing node
        boolean isAdded = new ReverseLinkedlist().addToLast(linkedList, 70);
        System.out.println("\nAdded: "+isAdded);
        printNode(linkedList);
        // remove last element to existing node
        boolean isRemoved = new ReverseLinkedlist().remove(linkedList, 70);
        System.out.println("\nRemoved at last node: "+isRemoved);

        isRemoved = new ReverseLinkedlist().remove(linkedList, 40);
        System.out.println("\nRemoved at middle: "+isRemoved);
        printNode(linkedList);

        CustomLinkedList nthFromLast = new CustomLinkedList(10);
        for (int i = 2; i < 3; i++) {
            new ReverseLinkedlist().addToLast(nthFromLast, i*10);
        }
        System.out.println("\nRemoved from last : "+2);
        CustomLinkedList removeNthFromEnd = new ReverseLinkedlist().removeNthFromEnd(nthFromLast, 2);
        printNode(removeNthFromEnd);

    }
    public static void printNode(CustomLinkedList node){
        while (node != null){
            System.out.println(node.val);
            node = node.nextPointer;
        }
    }

    public CustomLinkedList reverseLinkedList(CustomLinkedList list){
        CustomLinkedList prevNode = null;
        while(list != null){
            CustomLinkedList currentNode = new CustomLinkedList(list.val);
            currentNode.nextPointer = prevNode;
            prevNode = currentNode;
            list = list.nextPointer;
        }
        return prevNode;
    }
    public boolean addToLast(CustomLinkedList node, int val){
        while (node.nextPointer!=null){
            node = node.nextPointer;
        }
        CustomLinkedList newNode = new CustomLinkedList(val);
        node.nextPointer = newNode;
        return true;
    }

    public boolean remove(CustomLinkedList node, int val){
        CustomLinkedList prev = null;
        while (node.nextPointer != null && node.val != val){
            prev = node;
            node = node.nextPointer;
        }
        // if its a last node
        if (node.nextPointer == null && prev.nextPointer.nextPointer == null) prev.nextPointer = null;
        else prev.nextPointer = node.nextPointer;
        // otherwise, point the prev node and next node by removing current node
        return true;
    }

    public CustomLinkedList removeNthFromEnd(CustomLinkedList head, int n) {
        CustomLinkedList old = head;
        CustomLinkedList prev = null;
        for (int i = 0; i < n; i++) {
            old = old.nextPointer;
        }
        while (old != null){
            old = old.nextPointer;
            prev = prev.nextPointer;
        }
        return prev;
    }
}


