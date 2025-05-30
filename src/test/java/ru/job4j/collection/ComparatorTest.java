package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.ItemAscByName;
import ru.job4j.tracker.ItemDescByName;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ComparatorTest {
    @Test
    void whenAscByName() {
        List<Item> items = Arrays.asList(
                new Item(0, "Z"),
                new Item(623, "O"),
                new Item(146, "H"),
                new Item(1, "A"),
                new Item(13, "D"),
                new Item(41, "K")
        );
         Collections.sort(items, new ItemAscByName());
         List<Item> expectedResult = Arrays.asList(
                 new Item(1, "A"),
                 new Item(13, "D"),
                 new Item(146, "H"),
                 new Item(41, "K"),
                 new Item(623, "O"),
                 new Item(0, "Z")
         );
     assertThat(items).containsExactlyElementsOf(expectedResult);
    }

    @Test
    void whenDescByName() {
        List<Item> items = Arrays.asList(
                new Item(0, "Z"),
                new Item(623, "O"),
                new Item(146, "H"),
                new Item(1, "A"),
                new Item(13, "D"),
                new Item(41, "K")
        );
        Collections.sort(items, new ItemDescByName());
        int i = 0;
        List<Item> expectedResult = Arrays.asList(
                new Item(0, "Z"),
                new Item(623, "O"),
                new Item(41, "K"),
                new Item(146, "H"),
                new Item(13, "D"),
                new Item(1, "A")
        );
        assertThat(items).containsExactlyElementsOf(expectedResult);
    }
}


