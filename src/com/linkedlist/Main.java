package com.linkedlist;

public class Main
{
    public static void main(String args[]){

            /*LinkedList list = new LinkedList();
            list.addToLinkedList(list,1);
            list.addToLinkedList(list,2);
            list.addToLinkedList(list,3);
            list.addToLinkedList(list,4);
            list.printTheLinkedList();

            list.deleteByValue(list,2);
            list.printTheLinkedList();

            list.deleteByPosition(list,0);
            list.printTheLinkedList();*/

            DoubleLinkedList dll = new DoubleLinkedList();
            dll.insertFirst(1);
            dll.insertAtLast(2);
            dll.insertAtLast(3);
            dll.insertAfterKey(4,3);
            dll.display();
            dll.displayInReverse();

    }
}
