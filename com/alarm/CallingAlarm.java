package com.alarm;

public class CallingAlarm {
    public static void main(String[] args) throws InterruptedException {

        PrioritizedAlarm prioritizedAlarm = new PrioritizedAlarm("Prioritized alarm.", 2);
        prioritizedAlarm.turnOn();
        prioritizedAlarm.sendReport();
        System.out.println(prioritizedAlarm.getPriority());
        System.out.println(prioritizedAlarm.getColor());

        HighVisibilityAlarm highVisibilityAlarm = new HighVisibilityAlarm("High visibility alarm");
        highVisibilityAlarm.turnOn();
        highVisibilityAlarm.sendReport();
        System.out.println(highVisibilityAlarm.getColor());

        Dashboard dashboard = new Dashboard();
        dashboard.addAlarm(prioritizedAlarm);
        dashboard.addAlarm(highVisibilityAlarm);
        dashboard.addAlarm(new TimeSensitiveAlarm("Never mind, you missed the deadline."));
        dashboard.printReport();

        Alarm alarm2 = new HighVisibilityAlarm("It's ok.");
        alarm2.turnOn();
        System.out.println(alarm2);

        if (alarm2 instanceof PrioritizedAlarm) {
            PrioritizedAlarm prioritizedAlarm2 = (PrioritizedAlarm) alarm2;
            System.out.println(prioritizedAlarm2.getPriority());
        }
    }
}
