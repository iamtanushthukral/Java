package com.alarm;

import java.util.ArrayList;
import java.util.List;

public class Dashboard {
    private List<Alarm> alarms = new ArrayList<>();
    public void addAlarm(Alarm alarm) {
        alarm.turnOn();
        alarms.add(alarm);
    }
    public void printReport() {
        alarms.forEach(alarm -> System.out.println(alarm.getReport(true)));
    }
}
