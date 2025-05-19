package ru.job4j.tracker.action_0;

import ru.job4j.tracker.input_0.Input;
import ru.job4j.tracker.Tracker;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}
