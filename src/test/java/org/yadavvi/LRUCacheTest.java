package org.yadavvi;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {
    @Test
    public void testCache() {
        // LRU Cache size is 5
        // key should return a value
        Map<String, String> map = new HashMap<>(5);
        int maxSize = 5;
        String firstValue = map.get("first");
        // List kind of thing where once the 6th element is added,
        // we remove the first element and add the 6th at the end to make it as the new 5th.
        if (map.size() == 5) {

        }


    }

    class LRUCache<K, V> {

    }

    class Model<K, V> {
        String K;
        String V;
    }

}