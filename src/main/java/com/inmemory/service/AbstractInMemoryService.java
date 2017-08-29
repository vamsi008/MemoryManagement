package com.inmemory.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chavav on 29/08/17.
 */
public abstract class AbstractInMemoryService<K,T> implements InMemoryService<K,T> {





    public T getInstance(K key) {

        //Have to get the value from the hashMap
        //If it is in the hashMap then get the reference from the hashmap and updaet the values.
        //If it not found in the hashmap then use the value from the DB.

        return null;
    }



}
