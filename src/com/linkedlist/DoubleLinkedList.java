package com.linkedlist;

public class DoubleLinkedList
{
    Node head;

    public void insertFirst(int element){

        Node newNode = new Node(element);
        newNode.next = head;
        newNode.prev = null;
        if(head!=null){
            head.prev = newNode;
        }
        head = newNode;

    }

    public void insertAtLast(int element){

        Node newNode = new Node(element);
        Node currentNode = head;
        if(currentNode==null){
            head = newNode;
            return;
        }
        while(currentNode.next!=null){
            currentNode = currentNode.next;
        }
        newNode.prev = currentNode;
        currentNode.next = newNode;
    }

    public void insertAfterKey(int element, int key){

        Node newNode = new Node(element);
        Node currentNode = head;

        while(currentNode!=null && currentNode.value!=key){
            currentNode = currentNode.next;
        }

        if(currentNode!=null){
            Node temp = currentNode.next;
            newNode.next = temp;
            newNode.prev = currentNode;
            currentNode.next = newNode;
            if(temp!=null){
                temp.prev = newNode;
            }
        }

    }

    public void display(){

        Node node = head;
        while(node!=null){
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("END");

    }

    public void displayInReverse(){

        Node node = head;

        while(node!=null && node.next!=null){
            node = node.next;
        }
        while (node!=null){
            System.out.print(node.value+"->");
            node = node.prev;
        }
        System.out.println("END");

    }

    private class Node{

        int value;
        Node next;
        Node prev;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value, Node next, Node prev)
        {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
