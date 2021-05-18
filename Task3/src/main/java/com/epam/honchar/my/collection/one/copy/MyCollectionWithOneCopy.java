package com.epam.honchar.my.collection.one.copy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * Class MyCollection with fields <b>NOTIMPL</b>, <b>items</b>.
 *
 * @version 1.8
 * @autor Denys Honchar
 */
public class MyCollectionWithOneCopy<E> extends ArrayList<E> {
    List<Object> items = new ArrayList<>();

    @Override
    public boolean add(E element) {
        if (!containsElement(element)) {
            items.add(element);
        } else {
            throw new UnsupportedOperationException();
        }
        return false;
    }

    public boolean containsElement(E element) {
        if (items.contains(element)) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    public boolean containsInCollection(Collection collection) {
        for (Object item : items) {
            if (collection.contains(item)) {
                throw new IllegalArgumentException();
            }
        }
        return true;
    }

    public boolean isIndexNotOutOfBounds(int index) {
        return index >= 0 && index <= size();
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        if (!containsInCollection(collection)) {
            return items.addAll(collection);
        }
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> collection) {
        if (!containsInCollection(collection) && isIndexNotOutOfBounds(index)) {
            return items.addAll(index, collection);
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        if (containsInCollection(collection)) {
            return items.retainAll(collection);
        }
        return false;
    }

    @Override
    public E set(int index, E element) {
        if (isIndexNotOutOfBounds(index) && !containsElement(element)) {
            return (E) items.set(index, element);
        }
        return (E) new UnsupportedOperationException();
    }

    @Override
    public void add(int index, E element) {
        if (isIndexNotOutOfBounds(index) && !containsElement(element)) {
            items.add(index, element);
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
