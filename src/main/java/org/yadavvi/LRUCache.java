package org.yadavvi;

import java.util.LinkedList;

public class LRUCache<K, V> {
    private static final int DEFAULT_MAX_SIZE = 5;

    private final LinkedList<Model<K, V>> list;

    public LRUCache() {
        this(DEFAULT_MAX_SIZE);
    }

    public LRUCache(int size) {
        list = new LinkedList<>();
        for (var i = 0; i < size; i++) {
            list.add(null);
        }
    }

    public void put(Model<K, V> model) {
        int emptyPosition = -1;
        for (int i = 0; i < list.size(); i++) {
            // if any position is null, add an item there
            if (list.get(i) == null) {
                emptyPosition = i;
                break;
            }
        }
        if (emptyPosition != -1) {
            list.set(emptyPosition, model);
        } else {
            list.remove(0);
            list.add(model);
        }
    }

    public V get(K key) {
        for (Model<K, V> item : list) {
            if (item.key.equals(key)) return item.value;
        }
        return null;
    }

    public V remove(K key) {
        for (int i = 0; i < list.size(); i++) {
            Model<K, V> model = list.get(i);
            // Initially, all the elements are null.
            // An item is null means that while iterating we have come
            // across an empty item.
            if (model == null) break;
            if (model.getKey().equals(key)) {
                list.remove(i);
                list.add(null);
            }
        }
        return null;
    }
}
