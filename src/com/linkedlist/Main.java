package com.linkedlist;

public class Main
{
    public static void main(String args[]){

            LinkedList list = new LinkedList();
            list.addToLinkedList(list,1);
            list.addToLinkedList(list,2);
            list.addToLinkedList(list,3);
            list.addToLinkedList(list,4);
            list.printTheLinkedList(list);

            list.deleteByValue(list,2);
            list.printTheLinkedList(list);

            list.deleteByPosition(list,0);
            list.printTheLinkedList(list);
    }
}
