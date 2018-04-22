package com.github.since1986.learn.collection;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListUtilsTest {

    @Test
    public void testReverse() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");

        assertEquals("(null) <-> d <-> c <-> b <-> a <-> (null)", LinkedListUtils.reverse(linkedList).toString());
    }
}
