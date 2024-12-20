package OOPS;

public class HighVisibilityAlarm extends Alarm {
    public HighVisibilityAlarm(String message) {
        super(message);
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
