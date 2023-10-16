package org.yadavvi;

import org.junit.jupiter.api.Test;

class LRUCacheTest {

    @Test
    public void when_item_is_removed_a_null_is_added_at_the_end() {
        LRUCache<String, Integer> cache = new LRUCache<>();
        Model<String, Integer> model = Model.of("first", 1);
    }
}