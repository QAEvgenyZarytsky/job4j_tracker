package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.ItemAscByName;
import ru.job4j.tracker.ItemDescByName;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

    @Test
    void whenUseAscByName() {
        List<Job> users = Arrays.asList(
                new Job("Ivan", 1),
                new Job("Petr", 4),
                new Job("Nick", 10),
                new Job("Tom", 13),
                new Job("Cler", 11),
                new Job("Chak", 0)
        );
        Collections.sort(users, new JobAscByName());
        List<Job> expectedResult = Arrays.asList(
                new Job("Chak", 0),
                new Job("Cler", 11),
                new Job("Ivan", 1),
                new Job("Nick", 10),
                new Job("Petr", 4),
                new Job("Tom", 13)
        );
        assertThat(users).containsExactlyElementsOf(expectedResult);
    }

    @Test
    void whenUseDescByName() {
        List<Job> users = Arrays.asList(
                new Job("Ivan", 1),
                new Job("Petr", 4),
                new Job("Nick", 10),
                new Job("Tom", 13),
                new Job("Cler", 11),
                new Job("Chak", 0)
        );
        Collections.sort(users, new JobDescByName());
        List<Job> expectedResult = Arrays.asList(
                new Job("Tom", 13),
                new Job("Petr", 4),
                new Job("Nick", 10),
                new Job("Ivan", 1),
                new Job("Cler", 11),
                new Job("Chak", 0)
        );
        assertThat(users).containsExactlyElementsOf(expectedResult);
    }

    @Test
    void whenUseDescByPriority() {
        List<Job> users = Arrays.asList(
                new Job("Ivan", 1),
                new Job("Petr", 4),
                new Job("Nick", 10),
                new Job("Tom", 13),
                new Job("Cler", 11),
                new Job("Chak", 0)
        );
        Collections.sort(users, new JobDescByPriority());
        int i = 0;
        List<Job> expectedResult = Arrays.asList(
                new Job("Tom", 13),
                new Job("Cler", 11),
                new Job("Nick", 10),
                new Job("Petr", 4),
                new Job("Ivan", 1),
                new Job("Chak", 0)
        );
        assertThat(users).containsExactlyElementsOf(expectedResult);
    }

    @Test
    void whenUseAscByPriority() {
        List<Job> users = Arrays.asList(
                new Job("Ivan", 1),
                new Job("Petr", 4),
                new Job("Nick", 10),
                new Job("Tom", 13),
                new Job("Cler", 11),
                new Job("Chak", 0)
        );
        Collections.sort(users, new JobAscByPriority());
        List<Job> expectedResult = Arrays.asList(
                new Job("Chak", 0),
                new Job("Ivan", 1),
                new Job("Petr", 4),
                new Job("Nick", 10),
                new Job("Cler", 11),
                new Job("Tom", 13)
        );
        assertThat(users).containsExactlyElementsOf(expectedResult);
    }

    @Test
    void whenComparatorByNameAscAndAscPriority() {
        Comparator<Job> comparator = new JobAscByName().thenComparing(new JobAscByPriority());
        List<Job> jobs = Arrays.asList(
                new Job("JOB", 11),
                new Job("JOB", 0),
                new Job("JOB", 4),
                new Job("JOB", 3),
                new Job("JOB", 31),
                new Job("JOB", 16)
        );
        Collections.sort(jobs, comparator);
        List<Job> expectedResult =  Arrays.asList(
                new Job("JOB", 0),
                new Job("JOB", 3),
                new Job("JOB", 4),
                new Job("JOB", 11),
                new Job("JOB", 16),
                new Job("JOB", 31)
        );
        assertThat(jobs).containsExactlyElementsOf(expectedResult);
    }

    @Test
    void whenComparatorByNameAscAndDscPriority() {
        Comparator<Job> comparator = new JobAscByName().thenComparing(new JobDescByPriority());
        List<Job> jobs = Arrays.asList(
                new Job("JOB", 11),
                new Job("JOB", 0),
                new Job("JOB", 4),
                new Job("JOB", 3),
                new Job("JOB", 31),
                new Job("JOB", 16)
        );
        Collections.sort(jobs, comparator);
        List<Job> expectedResult =  Arrays.asList(
                new Job("JOB", 31),
                new Job("JOB", 16),
                new Job("JOB", 11),
                new Job("JOB", 4),
                new Job("JOB", 3),
                new Job("JOB", 0)
        );
        assertThat(jobs).containsExactlyElementsOf(expectedResult);
    }
}


