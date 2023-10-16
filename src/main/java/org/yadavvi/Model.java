package org.yadavvi;

import java.util.Objects;

public class Model<K, V> {
    K key;
    V value;

    public Model(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <K, V> Model<K, V> of(K key, V value) {
        return new Model<>(key, value);
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Model<?, ?> model)) return false;
        return Objects.equals(key, model.key) && Objects.equals(value, model.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "Model{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
