package main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Event> allEvents;
    private List<Task> allTasks;

    public Calendar() {
        allEvents = new ArrayList<>();
        allTasks = new ArrayList<>();
    }

    public List<Event> getAllEvents() {
        return allEvents;
    }

    public List<Task> getAllTasks() {
        return allTasks;
    }

    public void addAEvent(Event aEvent) {
        allEvents.add(aEvent);
    }

    public void addATask(Task aTask) {
        allTasks.add(aTask);
        LocalDateTime startTime = checkFreeTime(aTask.getDeadline(), aTask.getEstimatedTime());
        addAEvent(new Event(aTask.getTaskName(), startTime, getEndTime(startTime, aTask.getEstimatedTime())));
    }

    public LocalDateTime checkFreeTime(LocalDateTime deadline, int estimatedTime) {
        LocalDateTime startTime = LocalDateTime.of(2026, 6, 6, 5, 49);
        return startTime;
    }

    public LocalDateTime getEndTime(LocalDateTime starTime, int estimatedTime) {
        LocalDateTime endTime = LocalDateTime.of(2026, 6, 6, 5, 49);
        return endTime;
    }
}
