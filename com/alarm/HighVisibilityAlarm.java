package com.alarm;

import java.awt.*;

public class HighVisibilityAlarm extends Alarm {
    public HighVisibilityAlarm(String message) {
        super(message);
    }
    @Override
    public Color getColor() {
        return Color.RED;
    }
    @Override
    public String getReport(boolean uppercase) {
        String report = super.getReport(true);
        if (!report.isEmpty())
            return report + "!!";
        else
            return report;
    }
}
