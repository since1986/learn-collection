package com.github.since1986.learn.collection;

/**
 * 双向表
 */
public interface Deque<E> extends List<E> {

    E getFirst();

    E getLast();
}
