package main;

import java.time.LocalDateTime;

public class Task {
    private String taskName;
    private LocalDateTime deadline;
    private int estimatedTime;

    public Task(String taskName, LocalDateTime deadline, int estimatedTime) {
        this.taskName = taskName;
        this.deadline = deadline;
        this.estimatedTime = estimatedTime;
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
}
