package com.alarm;

import java.awt.*;
import java.time.LocalDateTime;

public abstract class Alarm {
    protected boolean active;
    private final String message;
    private LocalDateTime snoozeUntil;
    public Alarm(String message) {
        this.message = message;
        stopSnoozing();
    }
    public abstract Color getColor();
    public LocalDateTime getSnoozeUntil() {
        return snoozeUntil;
    }
    public String getMessage() {
        return message;
    }
    public void snooze() {
        if (active)
            snoozeUntil = LocalDateTime.now().plusSeconds(5);
    }
    public boolean isSnoozing() {
        return snoozeUntil.isAfter(LocalDateTime.now());
    }
    protected final void stopSnoozing() {
        snoozeUntil = LocalDateTime.now().minusSeconds(1);
    }
    public void turnOn() {
        active = true;
        stopSnoozing();
    }
    public void turnOff() {
        active = false;
        stopSnoozing();
    }
    @Override
    public String toString() {
        return getReport();
    }

    public String getReport() {
        return getReport(false);
    }
    public String getReport(boolean uppercase) {
        if (active && !isSnoozing()) {
            if (uppercase)
                return message.toUpperCase();
            else
                return message;
        } else
            return "";
    }
    public void sendReport() {
        System.out.println(getReport(true));
    }
}
