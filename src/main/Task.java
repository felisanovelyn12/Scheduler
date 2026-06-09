package main;

import java.time.LocalDateTime;

public class Task {
    private String taskName;
    private LocalDateTime deadline;
    private int estimatedTime;
    private Priority priority;

    public enum Priority {
        HIGH, MEDIUM, LOW;
    }

    public Task(String taskName, LocalDateTime deadline, int estimatedTime, Priority priority) {
        this.taskName = taskName;
        this.deadline = deadline;
        this.estimatedTime = estimatedTime;
        this.priority = priority;
    }

    public String getTaskName() {
        return taskName;
    }

    public void changeTaskName(String taskName) {
        this.taskName = taskName;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void changeDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void changeEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public Priority getPriority() {
        return priority;
    }

    public void changePriority(Priority priority) {
        this.priority = priority;
    }
}
