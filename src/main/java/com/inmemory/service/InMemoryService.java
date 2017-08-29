package com.inmemory.service;

/**
 * Created by chavav on 29/08/17.
 */
public interface InMemoryService <K,T>{

     T getInstance(K key);
     public void addInstance();
     public void deleteInstance();

}
