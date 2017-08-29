package com.inmemory.dto;

/**
 * Created by chavav on 29/08/17.
 */
public class MemoryList <T extends Node> {

    T head;
    T tail;

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }

    public T getTail() {
        return tail;
    }

    public void setTail(T tail) {
        this.tail = tail;
    }


    public void addHead(T newHead){
        if(this.head==null) {
            this.head=newHead;
        }else{
            T temp=this.head;
            newHead.next=temp;
            newHead.prev=null;
            this.head=newHead;
        }
    }
}
