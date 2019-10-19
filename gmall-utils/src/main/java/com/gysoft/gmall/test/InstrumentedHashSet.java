package com.gysoft.gmall.test;


import java.util.Collection;
import java.util.HashSet;

/**
 * @author 魏文思
 * @date 2019/8/26$ 16:10$
 */
public class InstrumentedHashSet<E> extends HashSet<E> {


    private int addCount = 0;

    public InstrumentedHashSet() {
    }

    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }



}
