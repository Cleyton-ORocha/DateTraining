import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.now();
		
		LocalDate d4 = LocalDate.parse("2022-02-07");
		LocalDateTime d5 = LocalDateTime.parse("2021-04-24T02:45:08");
		Instant d6 = Instant.parse("2021-04-24T02:45:08Z");
		Instant d7 = Instant.parse("2021-04-24T02:45:08-03:00");

		
		System.out.println("d1 = " + d1.toString());
		System.out.println("d2 = " + d2.toString());
		System.out.println("d3 = " + d3.toString());
		System.out.println("d4 = " + d4.toString());
		System.out.println("d5 = " + d5.toString());
		System.out.println("d6 = " + d6.toString());
		System.out.println("d7 = " + d7.toString());

	}

}
