package com.caiqinguo.datastructure.logicalstructure.linearlist.linkedlist.singlylinkedlist;

/**
 * 带头结点和尾指针的单向链表
 */
public class SinglyLinkedListWithHeadNodeAndTail<E> {

    /**
     * 头指针
     */
    private Node<E> head;

    /**
     * 尾指针
     */
    private Node<E> tail;

    public SinglyLinkedListWithHeadNodeAndTail() {
        Node<E> node = new Node<>(null);
        head = node;
        tail = node;
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    public int size() {
        Node<E> p = head.next;
        int size = 0;
        while (p != null) {
            size++;
            p = p.next;
        }
        return size;
    }

    public void add(E e) {
        Node<E> node = new Node<>(e);
        tail.next = node;
    }

    public void add(int i, E e) {
        Node<E> p = head.next;
        int count = 0;

    }

//    public E get(int i) {
//
//    }
//
//    public int indexOf(E e) {
//
//    }
//
//    public int lastIndexOf(E e) {
//
//    }
//
//    public boolean contains(E e) {
//
//    }
//
//    public void set(int i, E e) {
//
//    }
//
//    public void remove(int i) {
//
//    }
//
//    public void remove(E e) {
//        Node<E> p = head;
//        while (p.next != null) {
//            if (e == null) {
//                if (p.data == null)
//            } else if (e.equals(p.data)) {
//
//            }
//        }
//    }

    public void removeAll(E e) {

    }

    public void clear() {
        head.next = null;
        tail = head;
    }

    /**
     * 链表节点
     * @param <T>
     */
    public static class Node<T> {

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
