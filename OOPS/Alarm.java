package OOPS;

import java.time.LocalDateTime;

public class Alarm {
    boolean active;
    final String message;
    LocalDateTime snoozeUntil;
    Alarm(String message) {
        this.message = message;
        stopSnoozing();
    }
    void snooze() {
        snoozeUntil = LocalDateTime.now().plusSeconds(5);
    }
    boolean isSnoozing() {
        return snoozeUntil.isAfter(LocalDateTime.now());
    }
    void stopSnoozing() {
        snoozeUntil = LocalDateTime.now().minusSeconds(1);
    }
    void turnOn() {
        active = true;
    }
    void turnOff() {
        active = false;
    }
    String getReport() {
        return getReport(false);
    }
    String getReport(boolean uppercase) {
        if (active && !isSnoozing()) {
            if (uppercase)
                return message.toUpperCase();
            else
                return message;
        } else
            return "";
    }
    void sendReport() {
        System.out.println(getReport(true));
    }
}
