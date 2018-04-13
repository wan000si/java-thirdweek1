package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class singleLinkImpl implements SingleLink {
    private Node head;
    private Node tail;
    private int size;
    //    private int pos = 0;
    public singleLinkImpl() {
        head = null;
        tail = null;
    }
    public singleLinkImpl(Object data){
        head = new Node(data,null);
        tail = head;
        size++;
    }
    @Override
    public Object getHeaderData() {
        return head.data;
        //return null;
    }

    @Override
    public Object getTailData() {
        return tail.data;
        //return null;
    }

    @Override
    public int size() {
        return size;
        // /return 0;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
        //return false;
    }

    @Override
    public boolean deleteFirst() {
        head = head.next;
        return true;
        //return false;
    }

    @Override
    public boolean deleteLast() {
        Node deleteNode = head;
        if (deleteNode.next != tail) {
            deleteNode = deleteNode.next;
        }
        deleteNode = tail;
        return true;
        //return false;
    }

    @Override
    public void addHeadPointer(Object item) {
        Node newNode= new Node(item,null);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
//        Node node = new Node(item,null);
//        node.next = head;
//        head = node;
    }

    @Override
    public void addTailPointer(Object item) {
        if (head == null) {
            head = new Node(item, null);
            tail = head;
        } else {
            Node newNode = new Node(item,null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public Object getNode(int index) {
        Node current = head;
        for (int i = 0; i < size && current.next != null; i++, current = current.next) {
            if (i == index) {
                return current.data;
            }
        }
        return null;
    }
}
