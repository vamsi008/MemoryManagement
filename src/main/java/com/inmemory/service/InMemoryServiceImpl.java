package com.inmemory.service;

import com.inmemory.dto.MemoryList;
import com.inmemory.dto.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chavav on 29/08/17.
 */
public class InMemoryServiceImpl<K, T> extends AbstractInMemoryService<K, T> {


    private Map memoryMap = new HashMap<K, T>();

    MemoryList<Node> list = new MemoryList<Node>();


    public T getInstance(K key) {

        return null;
    }

    public void addInstance() {

        //Add the instance in the hashmap as well as the end of the DoubleLinkedList.
    }

    public void deleteInstance() {

        //Delete the instance from the hashmap as well as the doublelinkedlist.


    }
}
