package com.github.since1986.learn.collection;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void testSize() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        assertEquals(4, linkedList.size());
    }

    @Test
    public void testGet() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");

        assertEquals("1", linkedList.get(0));
    }

    @Test
    public void testGetFirst() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");

        assertEquals("1", linkedList.getFirst());
    }

    @Test
    public void testGetLast() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");

        assertEquals("3", linkedList.getLast());
    }

    @Test
    public void testAdd() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");

        for (int i = 0; i < linkedList.size(); i++) {
            assertEquals(String.valueOf(i + 1), linkedList.get(i));
        }
    }

    @Test
    public void testToString() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        assertEquals("(null) <-> A <-> B <-> C <-> D <-> (null)", linkedList.toString());
    }
}
