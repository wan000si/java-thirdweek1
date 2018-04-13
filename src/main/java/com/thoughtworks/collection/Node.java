package com.thoughtworks.collection;

public class Node {
        public Object data;
        protected Node next;
        Node(Object data, Node next) {
            this.data=data;
            this.next=next;
        }
}
