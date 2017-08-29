package com.inmemory.service;

import com.inmemory.dto.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chavav on 29/08/17.
 */
public class InMemoryServiceImpl<K,T> extends  AbstractInMemoryService<K, T> {


    private Map memoryMap = new HashMap<K, T>();

    public T getInstance(K key) {

        return null;
    }

    public void addInstance() {


    }

    public void deleteInstance() {


    }
}
