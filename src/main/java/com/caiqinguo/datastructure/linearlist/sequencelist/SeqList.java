package com.caiqinguo.datastructure.linearlist.sequencelist;

/**
 * 顺序表（）
 */
public class SeqList<E> {

    /**
     * data 数组，存储顺序表的元素
     */
    private Object[] data;

    /**
     * 顺序表的大小
     */
    private int size;

    /**
     * 顺序表的默认初始化大小
     */
    private static final int DEFAULT_INIT_CAPACITY = 10;

    /**
     *
     */
    private static final int CAPACITY_INCREMENT = 4;

    /**
     * 空顺序表
     */
    private static final Object[] EMPTY_LIST = {};

    public SeqList() {
        data = new Object[DEFAULT_INIT_CAPACITY];
    }

    public SeqList(int initCapacity) {
        // 判断 initCapacity 是否小于 0
        if (initCapacity < 0) {
            throw new RuntimeException("initial capacity is less than 0.");
        }

        data = new Object[initCapacity];
    }

    /**
     * 判断顺序表是否为空
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 查询顺序表长度
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 在顺序表的尾部添加元素
     */
    public void add(E e) {
        // 判断 data 数组是否已满
        if (data.length == size) {
            ensureCapacity();
        }

        // 在顺序表尾部添加元素
        data[size] = e;
        // 更新顺序表长度
        size++;
    }

    /**
     * 在顺序表的指定下标添加元素
     * @param i
     * @param e
     */
    public void add(int i, E e) {
        // 判断 data 数组是否已满
        if (data.length == size) {
            ensureCapacity();
        }

        // 将指定下标以后的元素后移 1 位
        for (int j = size; j > i; j--) {
            data[j] = data[j - 1];
        }
        // 在指定位置插入元素
        data[i] = e;
        // 更新顺序表长度
        size++;
    }

    public void ensureCapacity() {
        Object[] newData = new Object[size + CAPACITY_INCREMENT];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    /**
     * 查询顺序表执行下标的元素
     * @param i
     * @return
     */
    @SuppressWarnings("unchecked")
    public E get(int i) {
        // 判断下标是否合法
        if ((i < 0) || (i >= size)) {
            throw new RuntimeException("illegal index " + i + ", size is " + size);
        }

        return (E) data[i];
    }

    /**
     * 查询指定元素在顺序表第一次出现的下标
     * @param e
     * @return
     */
    public int indexOf(E e) {
        // 顺序遍历 data 数组查找第一个等于 e 的元素的下标
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        // 元素不存在
        return -1;
    }

    /**
     * 查询指定元素在顺序表最后一次出现的下标
     * @param e
     * @return
     */
    public int lastIndexOf(E e) {
        // 逆序遍历 data 数组查找第一个等于 e 的元素的下标
        for (int i = size - 1; i >= 0; i--) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        // 元素不存在
        return -1;
    }

    /**
     * 判断顺序表是否包含指定的元素
     * @param e
     * @return
     */
    public boolean contains(E e) {
        // 遍历 data 数组，查询是否存在等于 e 的元素
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        // 不存在等于 e 的元素
        return false;
    }

    /**
     * 更新顺序表指定下标的元素
     * @param i
     * @param e
     * @return
     */
    public void set(int i, E e) {
        // 判断下标是否合法
        if ((i < 0) || (i >= size)) {
            throw new RuntimeException("illegal index " + i + ", size is " + size);
        }

        // 更新 data 数组
        data[i] = e;
    }

    /**
     * 删除顺序表在指定下标的元素
     * @param i
     * @return
     */
    public void remove(int i) {
        // 判断下标是否合法
        if ((i < 0) || (i >= size)) {
            throw new RuntimeException("illegal index " + i + ", size is " + size);
        }

        // 删除元素（指定下标后面的元素都往前移 1 位）
        for (int j = size - 1; j > i; j--) {
            data[j - 1] = data[j];
        }
        // 顺序表长度减 1
        size--;
    }

    /**
     * 删除顺序表中第一个与给定对象相等的元素
     */
    public void remove(E e) {
        int i = 0;
        // 判断顺序表中是否存在该元素
        if ((i = indexOf(e)) != -1) {
            remove(i);
        }
     }

    /**
     * 删除顺序表中所有与给定对象相等的元素
     * @param e
     * @return 删除了几个元素
     */
    public int removeAll(E e) {
        int p1 = 0;
        int p2 = 0;
        while (!data[p2].equals(e)) {
            p1++;
            p2++;
        }
        p2++;
        while (p2 < size) {
            if (data[p2].equals(e)) {
                p2++;
            } else {
                data[p1++] = data[p2++];
            }
        }
        int count = p2 - p1;
        size -= count;
        return count;
    }

    /**
     * 清空顺序表
     */
    public void clear() {
        data = EMPTY_LIST;
    }
}
