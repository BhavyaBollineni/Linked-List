package com.linkedlist;

public class LinkedList
{
    private Node head;

    private class Node{

        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value;
            next = null;
        }

    }

    public void addToLinkedList(LinkedList list, int value){

        Node newNode = new Node(value);
        if(list.head == null){
            list.head = newNode;
        }
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }

    }

    public void printTheLinkedList(LinkedList list){

        Node currentNode = list.head;
        while (currentNode!=null){
            System.out.print(currentNode.value+" ");
            currentNode = currentNode.next;
        }
    }

}
