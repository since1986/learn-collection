package com.github.since1986.learn.collection;

public final class LinkedListUtils {

    /*
     * 反转（根据高内聚的原则，这个API不应由LinkedList本身提供，因为反转是要操作LinkedList内部API Node的，这个Node对消费者应当是不可见的，所以用了一个与LinkedList同一个包的Utils类来操作，这样就对外掩藏了Node这个API）
     * 分为两个步骤：
     * 第一步 交换每个节点的previous和next
     * 第二步 交换LinkedList的first和last
     */
    public static <E> LinkedList<E> reverse(LinkedList<E> linkedList) {
        //保存原首尾节点信息，用于交换每个节点的previous和next后将LinkedList的first和last进行交换
        LinkedList.Node<E> originalFirstNode = linkedList.getFirstNode();
        LinkedList.Node<E> originalLastNode = linkedList.getLastNode();

        //交换每个节点的previous和next
        LinkedList.Node<E> originalOrderCurrentNode = originalFirstNode; //按照原顺序循环
        while (originalOrderCurrentNode != null) { //按照原LinkedList的顺序循环，直至到达null（假如原LinkedList为 (null) <-> 1 <-> 2 <-> 3 <-> 4 <-> (null) 那么也就是按 1 -> 2 -> 3 -> 4 -> (null) 这样来循环，其中4后面的(null)为循环终止条件）
            LinkedList.Node<E> originalPrevious = originalOrderCurrentNode.getPrevious(); //获得当前node的原previous
            LinkedList.Node<E> originalNext = originalOrderCurrentNode.getNext(); //获得当前node的原next

            LinkedList.Node<E> tempReference = originalOrderCurrentNode; //新建一个引用，后续的previous和next的交换在新引用上进行，不影响原LinkedList的节点，这样才能让while循环能够继续（可以想象一下，如果直接在原节点上交换，假如当前由1节点循环到了2个节点 那么 1 -> 2 -> 3交换后就变成了 3 -> 2 -> 1 ，循环的下一次等于还是1，就重复了，就不是原顺序在循环了，逻辑上是不对的）

            originalOrderCurrentNode = originalNext; //让循环继续到下一节点

            tempReference.setPrevious(originalNext); //将当前node的previous设置为原来的next
            tempReference.setNext(originalPrevious); //将当前node的next设置为原来的previous
        }

        //交换LinkedList的first和last
        linkedList.setFirstNode(originalLastNode);
        linkedList.setLastNode(originalFirstNode);

        return linkedList;
    }
}
