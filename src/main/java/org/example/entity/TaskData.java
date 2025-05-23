package org.example.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskData {

    private Set<Task> annsTasks;
   private   Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String a) {
        return switch (a) {
            case "ann" -> annsTasks;
            case "bob" -> bobsTasks;
            case "carol" -> carolsTasks;
            default -> unassignedTasks;
        };

    }

    public Set<Task> getUnion(Set<Task> set1, Set<Task> set2) {

        Set<Task> unionTask = new HashSet<>(set1);
            unionTask.addAll(set2);
        return unionTask;
    }


    public Set<Task> getIntersection(Set<Task> a, Set<Task> b) {
        Set<Task> insertion = new HashSet<>(a);
        insertion.retainAll(b);
        return insertion;
    }

    public Set<Task> getDifferences(Set<Task> a, Set<Task> b) {

        Set<Task> difference = new HashSet<>(a);

        difference.removeAll(b);
        return difference;
    }
}
