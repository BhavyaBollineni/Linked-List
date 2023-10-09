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
            System.out.println();

            list.deleteByValue(list,2);
            System.out.println();

            list.printTheLinkedList(list);

            System.out.println();

            list.deleteByPosition(list,0);
            list.printTheLinkedList(list);
    }
}
