package main;

import java.time.LocalDateTime;

public class Event {
    private String eventName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean isImportant = false;
    private String location;

    public Event(String eventName, LocalDateTime startTime, LocalDateTime endTime) {
        this.eventName = eventName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isImportant = false;
        this.location = null;
    }

    public Event(String eventName, LocalDateTime startTime, LocalDateTime endTime, String location) {
        this.eventName = eventName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isImportant = false;
        this.location = location;
    }

    public Event(String eventName, LocalDateTime startTime, LocalDateTime endTime, String location, boolean isImportant) {
        this.eventName = eventName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isImportant = true;
        this.location = location;
    }
    
    public String getEventName() {
        return eventName;
    }

    public void changeEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void changeStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void changeEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void changeImportance() {
        this.isImportant = !this.isImportant;
    }

    public String getLocation() {
        return location;
    }

    public void changeLocation(String location) {
        this.location = location;
    }
}
