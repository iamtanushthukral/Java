package com.alarm;

import java.awt.*;
import java.time.LocalTime;

public class TimeSensitiveAlarm extends Alarm{
    public TimeSensitiveAlarm(String message) {
        super(message);
    }
    @Override
    public Color getColor() {
        return Color.ORANGE;
    }
    @Override
    public String getReport(boolean uppercase) {
        String report = super.getReport(true);
        if (!report.isEmpty())
            return LocalTime.now() + ":" + report;
        else
            return report;
    }
}
