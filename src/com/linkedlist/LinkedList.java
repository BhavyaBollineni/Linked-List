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

    /**
     * @param list The existing list
     * @param value The value to be added
     *              The below function works like this:
     *              1. Construct the new node withe desired value passes as argument
     *              2. Take the existing list, decide if the head is null. It means the new node is going to be the first entry
     *              3. If the head is not null, initiate a traversing node which can be called last and assigned to the head
     *              4. While loop until the last node's next is not equal to null
     *              5. Once the last node is reached, assign last node's next to the new node constructed in the 1st step
     *
     *              Example:
     *              When you call addToLinkedList() for the first time, from main, the list looks like below
     *              initial list head is null
     *              goes into if loop, and the list's head becomes new node while the new node's value is value and the next is null because of the constructor
     */
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

    public LinkedList deleteByValue(LinkedList list, int valueToDelete){

        Node currentNode = list.head;
        Node prev = null;

        // if the value is found in head itself
        if (currentNode!=null && currentNode.value == valueToDelete){
            list.head = currentNode.next;
            return list;
        }

        // if the value is present somewhere other than head
        while (currentNode!=null && currentNode.value!= valueToDelete){

            prev = currentNode;
            currentNode = currentNode.next;
        }
        if(currentNode!=null){
            prev.next = currentNode.next;

        }

        if(currentNode == null){
            System.out.println("Not able to find the value in the given list");
        }

        return list;
    }

    public LinkedList deleteByPosition(LinkedList list, int position){

        Node currentNode = list.head;
        Node prev = null;

        // if the position is head itself
        if(position == 0 && currentNode!=null){
            list.head=currentNode.next;
            return list;
        }
        int counter = 0;
        while(currentNode!=null){

            if(counter == position){
                prev.next = currentNode;
                break;
            }
            else{
                prev = currentNode;
                currentNode.next = currentNode;
                counter++;
            }

        }
        if(currentNode==null){
            System.out.println(position + " position element not found");
        }

        return list;
    }

}
