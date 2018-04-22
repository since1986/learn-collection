package com.github.since1986.learn.collection;

/**
 * 线性表
 */
public interface List<E> {

    void add(E element);

    void add(int index, E element);

    E get(int index);

    void remove(E element);

    void remove(int index);

    int size();
}
