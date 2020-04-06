package com.pavelyadrov.mycollection;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.*;

public class MyLinkedList<T> implements ILinkedList<T> {

    private int size = 0;

    private Node<T> first;

    private Node<T> last;

    //Constructors
    public MyLinkedList() {
    }

    public MyLinkedList(MyLinkedList<? extends T> collection) {
        this();
        addAll(collection);
    }

    private static class Node<T> {
        T element;
        Node<T> next;
        Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

  
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> lastReturned;
            private Node<T> next=first;
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                lastReturned = next;
                next = next.next;
                currentIndex++;
                return lastReturned.element;
            }

            @Override
            //i decided that iterator cant remove objects from My List
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public int size() {
        return this.size;
    }

    
    private Node<T> node(int index) {
        if (index < (size >> 1)) {
            Node<T> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<T> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    /**
     * All adding methods for my collection below
     * <p>
     * simple add to the end of the collection
     *
     * @param element - new element
     */
    @Override
    public void add(T element) {
        addIn(size, element);
    }

    /**
     * add with index
     *
     * @param index   - index of new element
     * @param element - new element
     */
    @Override
    public void add(int index, T element) {
        addIn(index, element);
    }

    /**
     * implementation add method for both add methods
     * it's private cuz i dont want people to invoke it directly, they have add method so whatever
     *
     * @param index   - new element index
     * @param element - new element
     */
    private void addIn(int index, T element) {
        if (index > size || index < 0) throw new IndexOutOfBoundsException();
        if (index == size) {
            Node<T> l = last;
            Node<T> newNode = new Node<>(l, element, null);
            last=newNode;
            if (l == null) first = newNode;
            else l.next = newNode;
            size++;
        }
        else {
            Node<T> current = node(index);
            Node<T> newNode = new Node<>(current.prev, element, current);
            if (current.prev == null) first = newNode;
            else current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }
    @Override
    public void addAll(MyLinkedList<? extends T> collection){
       addAllIn(size,collection);
    }
    @Override
    public void addAll(int index, MyLinkedList<? extends T> collection) {
        if (index > size || index<0) throw new IndexOutOfBoundsException();
        addAllIn(index,collection);
    }

    /**
     * Well, it's just copy-paste from LinkedList
     * cuz i cant imagine proper algorithm
     * @param index - index at which to insert first element
     * @param collection - collection containing elements to be added to this list
     */
    private void addAllIn(int index,MyLinkedList<? extends T> collection) {
        Object[] objects = collection.toArray();
        Node<T> pred, succ;
        if (index == size) {
            succ = null;
            pred = last;
        } else {
            succ = node(index);
            pred = succ.prev;
        }
        for (Object o : objects) {
            T e = (T) o;
            Node<T> newNode = new Node<>(pred, e, null);
            if (pred == null)
                first = newNode;
            else
                pred.next = newNode;
            pred = newNode;
        }
        if (succ == null) {
            last = pred;
        } else {
            pred.next = succ;
            succ.prev = pred;
        }
        size += objects.length;
    }

    /**
     * Here represents two toArray methods for converting lists to arrays
     *
     * first method returns array of objects
     * @return - array filled with Object instances
     */
    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<T> x = first; x != null; x = x.next)
            result[i++] = x.element;
        return result;
    }

    @Override
    public <E> E[] toArray(E[] a) {
        if (a.length<size) a= (E[]) Array.newInstance(a.getClass().getComponentType(),size);
        Object[] result = a;
        int i = 0;
        for (Node<T> x = first; x != null; x = x.next)
            result[i++] = x.element;
        return a;
    }

 
    @Override
    public void clear() {
        for (Node<T> x = first; x != null; ) {
            Node<T> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        size=0;
        last=first=null;
    }

    @Override
    public T get(int index) {
        return node(index).element;
    }

    /**
     * Method to get sequence of elements at once
     * i think it should be faster that use, for example
     * "get" method 100 times
     * @param index -  index at which to get element sequence
     * @param seqSize - size of desirable sequence
     * @return - array of elements
     */
    public Object[] getSequence(int index,int seqSize) {
        //T[] a = (T[]) Array.newInstance(this.toArray().getComponentType(),seqSize);
        Object[] a = new Object[seqSize];
        Node<T> x;
        if (index < (size >> 1)) {
            x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
        } else {
            x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
        }
        for (int i = 0; i < seqSize; i++) {
            a[i]=x.element;
            x=x.next;
        }
        return a;
    }

    @Override
    public int indexOf(T o) {
        int index = 0;
        if (o == null) {
            for (Node<T> x = first; x != null; x = x.next) {
                if (x.element == null)
                    return index;
                index++;
            }
        } else {
            for (Node<T> x = first; x != null; x = x.next) {
                if (o.equals(x.element))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public T remove(int index) {
        if(index>size || index<0) throw new IndexOutOfBoundsException();
        Node<T> nd = node(index);
        Node<T> prev=nd.prev,next=nd.next;
        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            nd.prev = null;
        }
        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            nd.next = null;
        }
        size--;
        return nd.element;
    }

    @Override
    public T set(int index, T element) {
        if(index>size || index<0) throw new IndexOutOfBoundsException();
        Node<T> nd = node(index);
        T old = nd.element;
        nd.element = element;
        return old;
    }

    @Override
    public String toString() {
        Iterator<T> it = iterator();
        if (!it.hasNext()) return "[]";

        StringBuilder string = new StringBuilder();
        string.append("MyLinkedList ");
        string.append(" [");
        while(it.hasNext()){
            T t = it.next();
            string.append(t).append(", ");
        }
        string.append("]");
        return string.toString();
    }
}


