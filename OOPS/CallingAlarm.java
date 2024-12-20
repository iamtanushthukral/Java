package OOPS;

public class CallingAlarm {
    public static void main(String[] args) throws InterruptedException {
        Alarm alarm = new Alarm("Temp too high");
        alarm.turnOn();
        alarm.sendReport();
        alarm.snooze();
        alarm.sendReport();
        Thread.sleep(6000); //waiting for 5 seconds for snooze to complete
        alarm.sendReport();

        PrioritizedAlarm prioritizedAlarm = new PrioritizedAlarm("Prioritized alarm.", 2);
        prioritizedAlarm.turnOn();
        prioritizedAlarm.sendReport();
        System.out.println(prioritizedAlarm.getPriority());

        HighVisibilityAlarm highVisibilityAlarm = new HighVisibilityAlarm("High visibility alarm");
        highVisibilityAlarm.turnOn();
        highVisibilityAlarm.sendReport();
    }
}
