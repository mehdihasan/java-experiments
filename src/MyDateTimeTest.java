import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MyDateTimeTest {
	
	private static final String FINAL_ZONE = "Europe/Oslo";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Long timeStamp = 1519785325L;
		Long timeStamp = 1519729976L;
		System.out.println(printConvertedTimeJava8(timeStamp));
		
		System.out.println(printConvertedTime(timeStamp));
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	* getting time string from a given timestamp in miliseconds
	* Java 8 and lower
	* Android API 26 and lower 
	* @param timeStamp
	* @return
	*/
	private static String printConvertedTime(Long timeStamp) {
		Date date = new Date(timeStamp * 1000);
		return (getDayDifference(date) 
				? new SimpleDateFormat("hh:mm:ss").format(date) 
						: new SimpleDateFormat("dd MMM, HH:mm:ss").format(date))
				.toLowerCase();
	}
	
	private static boolean getDayDifference(Date givenDate) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
		return dateFormat.format(date)
				.equalsIgnoreCase(dateFormat.format(givenDate));
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * getting time string from a given timestamp in miliseconds
	 * Java 8 mode
	 * Android API 26
	 * @param timeStamp
	 * @return
	 */
	private static String printConvertedTimeJava8(Long timeStamp) {
		
		LocalDateTime triggerTime =
		        LocalDateTime.ofInstant(Instant.ofEpochSecond(timeStamp), 
		                                TimeZone.getDefault().toZoneId()); 
		
		return ((getDayDifferenceJava8(triggerTime))
				? (triggerTime.format(DateTimeFormatter.ofPattern("hh:mm:ss"))) 
						: (triggerTime.format(DateTimeFormatter.ofPattern("dd MMM, HH:mm:ss"))))
				.toLowerCase();
	}
	
	private static boolean getDayDifferenceJava8(LocalDateTime triggerTime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
		return triggerTime.format(formatter)
				.equalsIgnoreCase(LocalDate.now().format(formatter));
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * to get the time to fetch the edition
	 */
	private void printEditionFetchTime() {
		TimeZone osloTimeZone = TimeZone.getTimeZone(FINAL_ZONE);
        Calendar osloCal = Calendar.getInstance(osloTimeZone);
        int thisHour = (osloCal.get(Calendar.HOUR_OF_DAY));
        System.out.println("thisHour: " + thisHour);
        int thisHoutIntoSix = thisHour * 60;
        System.out.println("thisHoutIntoSix: " + thisHoutIntoSix);
        int currentMin = thisHoutIntoSix + osloCal.get(Calendar.MINUTE);
        System.out.println("current min: " + currentMin);
        System.out.println("final: " + (currentMin > 510 && currentMin < 1050));
	}

}
