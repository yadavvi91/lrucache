package org.yadavvi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LRUCacheTest {

    @Test
    public void when_a_sixth_item_is_added_first_item_is_removed() {
        LRUCache<String, Integer> cache = new LRUCache<>();
        Model<String, Integer>[] models = new Model[]{
                Model.of("first", 1),
                Model.of("second", 2),
                Model.of("third", 3),
                Model.of("fourth", 4),
                Model.of("fifth", 5)
        };
        for (Model<String, Integer> model : models) {
            cache.put(model);
        }

        cache.put(Model.of("sixth", 6));

        Integer first = cache.get("first");
        assertNull(first);
    }

    @Test
    public void when_a_sixth_item_is_added_first_item_is_removed_and_second_item_is_still_there() {
        LRUCache<String, Integer> cache = new LRUCache<>();
        Model<String, Integer>[] models = new Model[]{
                Model.of("first", 11),
                Model.of("second", 22),
                Model.of("third", 33),
                Model.of("fourth", 44),
                Model.of("fifth", 55)
        };
        for (Model<String, Integer> model : models) {
            cache.put(model);
        }

        cache.put(Model.of("sixth", 66));

        Integer first = cache.get("first");
        assertNull(first);

        Integer second = cache.get("second");
        assertEquals(22, second);
    }
}