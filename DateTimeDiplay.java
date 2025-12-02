import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateTimeDiplay {
	LocalDate currentDate = LocalDate.now();
	LocalTime currentTime = LocalTime.now();
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formattedDate = now.format(dateFormatter);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = now.format(formatter);
		System.out.println("Current Date and Time: " + formattedDateTime);
		System.out.println("Formatted Date: " + formattedDate);
		System.out.println("Formatted Time: " + formattedDateTime.split(" ")[1]);

	}
}
