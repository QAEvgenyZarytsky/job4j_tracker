package ru.job4j.collection;

import java.util.Objects;

public class Job implements Comparable<Job> {
    private String name;

    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Job job = (Job) o;
        return getPriority() == job.getPriority() && Objects.equals(getName(), job.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPriority());
    }

    @Override
    public String toString() {
        return "Job{"
                + "name='" + name + '\''
                + ", priority=" + priority
                + '}';
    }

    @Override
    public int compareTo(Job another) {
        return Integer.compare(this.priority, another.priority);
    }
}