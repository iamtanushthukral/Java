package OOPS;

public class CallingAlarm {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        System.out.println(alarm.active);
        alarm.turnOn();
        System.out.println(alarm.active);
        alarm.turnOff();
    }
}
