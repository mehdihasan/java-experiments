import java.util.Calendar;
import java.util.TimeZone;

public class DiffBetweenTwoTime {

	private static final String FINAL_ZONE = "Europe/Oslo";
	
	public static void main(String[] args) {
		DiffBetweenTwoTime diffBetweenTwoTime = new DiffBetweenTwoTime();
		System.out.println("RES: " + diffBetweenTwoTime.hasDnEkspress("5:30", "9:00"));
	}
	
	public boolean hasDnEkspress(String validForm, String validTill) {
        Calendar osloCal = getOsloCal();
        if (isWeekEnd(osloCal)) {
            return false;
        }
        String validFormArray[] = validForm.split(":");
        String validTillArray[] = validTill.split(":");
        int minTimeInMinute = (Integer.parseInt(validFormArray[0]) * 60) + Integer.parseInt(validFormArray[1]);
        int maxTimeInMinute = (Integer.parseInt(validTillArray[0]) * 60) + Integer.parseInt(validTillArray[1]);
        int currentMin = (osloCal.get(Calendar.HOUR_OF_DAY) * 60) + osloCal.get(Calendar.MINUTE);
        System.out.println("current min: " + currentMin);
        return currentMin > minTimeInMinute && currentMin < maxTimeInMinute;
    }

    private Calendar getOsloCal() {
        TimeZone osloTimeZone = TimeZone.getTimeZone(FINAL_ZONE);
        System.out.println("Oslo time zone: " + osloTimeZone);
        return Calendar.getInstance(osloTimeZone);
    }

    // will return true for Saturday and Sunday
    private boolean isWeekEnd(Calendar calendar) {
    		if (calendar.get(Calendar.DAY_OF_WEEK) == 0
                || calendar.get(Calendar.DAY_OF_WEEK) == 7) {
            return true;
        }
    		return false;
    }
}
