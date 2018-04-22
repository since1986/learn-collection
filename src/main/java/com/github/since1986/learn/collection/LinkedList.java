package com.github.since1986.learn.collection;

/**
 * （双向）链表
 */
public class LinkedList<E> implements Deque<E> {

    private int size;

    private Node<E> first;
    private Node<E> last;

    @Override
    public void add(E element) {
        if (size == 0) { //假如当前的size == 0，那么就让当前add进来的元素，生成节点成为first节点和last节点
            first = last = new Node<>(null, null, element);
        } else { //否则向last节点后添加一个新的节点（也就是生成一个新节点，将last节点的next指向这个新节点），让后让新的节点成为last就可以了
            Node<E> newLast = new Node<>(last, null, element);
            last.next = newLast;
            last = newLast;
        }
        size++;
    }

    @Override
    public void add(int index, E element) {
        //TODO 与题目无关，暂不实现
    }

    @Override
    public E get(int index) {
        return getNode(index) == null ? null : getNode(index).element;
    }

    @Override
    public void remove(E element) {
        //TODO 与题目无关，暂不实现
    }

    @Override
    public void remove(int index) {
        //TODO 与题目无关，暂不实现
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getFirst() {
        return getFirstNode().element;
    }

    @Override
    public E getLast() {
        return getLastNode().element;
    }

    //核心数据结构（不对外包暴露）
    static class Node<E> {

        private Node<E> previous;
        private Node<E> next;

        E element;

        Node(Node<E> previous, Node<E> next, E element) {
            this.previous = previous;
            this.next = next;
            this.element = element;
        }

        Node<E> getPrevious() {
            return previous;
        }

        void setPrevious(Node<E> previous) {
            this.previous = previous;
        }

        Node<E> getNext() {
            return next;
        }

        void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> getNode(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        } else if (size == 0) { //如果当前size == 0则返回null
            return null;
        } else if (index < size / 2) { //如果index处于list的前半部分（也就是index < size / 2）那么就从first节点开始向后找
            Node<E> temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else { //否则，从last节点开始向前找
            Node<E> temp = last;
            for (int i = size - 1; i > index; i--) {
                temp = temp.previous;
            }
            return temp;
        }
    }

    Node<E> getFirstNode() {
        return size == 0 ? null : getNode(0);
    }

    Node<E> getLastNode() {
        return size == 0 ? null : getNode(size - 1);
    }

    void setFirstNode(Node<E> first) {
        this.first = first;
    }

    void setLastNode(Node<E> last) {
        this.last = last;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(null) <-> ");
        Node<E> node = first;
        while (node != null) {
            stringBuilder.append(node.element);
            stringBuilder.append(" <-> ");
            node = node.next;
        }
        stringBuilder.append("(null)");
        return stringBuilder.toString();
    }
}
