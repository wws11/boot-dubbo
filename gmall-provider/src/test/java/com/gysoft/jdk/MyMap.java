package com.gysoft.jdk;

/**
 * @author 魏文思
 * @date 2019/11/6$ 13:28$
 */
public interface MyMap<K, V> {
    public V put(K k, V v);

    public V get(K k);
    public   int  size();

    interface Entry<K, V> {
        K getKey();

        V getValue();

        V setValue(V value);

        Entry<K, V> getNext();

        Entry<K, V> setNext(Entry<K, V> next);
    }
}
