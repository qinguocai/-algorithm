package com.caiqinguo.datastructure.logicalstructure.linearlist.linkedlist.singlylinkedlist;

/**
 * 单向链表
 */
public class SinglyLinkedList<E> {

    /**
     * 头指针
     */
    private Node<E> head;

    public SinglyLinkedList() {}

    public SinglyLinkedList(E e) {
        Node<E> node = new Node<>(e);
        head.next = node;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        Node<E> p = head;
        int size = 0;
        while (p != null) {
            size++;
            p = p.next;
        }
        return size;
    }

    public void add(E e) {
        Node<E> node = new Node<>(e);
        // 判断单链表是否为空
        if (head == null) {
            head = node;
        } else {
            Node<E> p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = node;
        }
    }

    public void add(int i, E e) {
        Node<E> node = new Node<>(e);
        Node<E> p = head;
        int j = 0;
        while (() && ()) {

        }
        if (j ) {

        } else {
            throw new RuntimeException("illegal index " + i + ", size is " + )
        }
    }

    public E get(int i) {
        Node<E> p = head;
        while ((i > 0) && ()) {
            p = p.next;
            i--;
        }
        if (i == 0) {
            return p.data;
        } else {
            throw new RuntimeException("illegal index " + i + ", size is " + )
        }
    }

    public int indexOf(E e) {

        return 0;
    }

    public int lastIndexOf(E e) {

        return 0;
    }

    public boolean contains(E e) {

        return false;
    }

    public void set(int i, E e) {

    }

    public void remove(int i) {

    }

    public void remove(E e) {

    }

    public void removeAll(E e) {

    }

    public void clear() {

    }

    /**
     * 单向链表节点
     * @param <T>
     */
    private static class Node<T> {

        /**
         * 节点数据
         */
        public T data;

        /**
         * 下一个节点的引用
         */
        public Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }
}
