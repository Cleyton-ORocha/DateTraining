import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter  dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter  dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.now();
		
		LocalDate d4 = LocalDate.parse("2022-02-07");
		LocalDateTime d5 = LocalDateTime.parse("2021-04-24T02:45:08");
		Instant d6 = Instant.parse("2021-04-24T02:45:08Z");
		Instant d7 = Instant.parse("2021-04-24T02:45:08-03:00");

		LocalDate d8 = LocalDate.parse("07/08/2022",dtf1);
		LocalDateTime d9 = LocalDateTime.parse("07/08/2022 02:30",dtf2);
		
		LocalDate d10 = LocalDate.of(2023, 9, 20);
		
		System.out.println("d1 = " + d1.toString());
		System.out.println("d2 = " + d2.toString());
		System.out.println("d3 = " + d3.toString());
		System.out.println("d4 = " + d4.toString());
		System.out.println("d5 = " + d5.toString());
		System.out.println("d6 = " + d6.toString());
		System.out.println("d7 = " + d7.toString());
		System.out.println("d8 = " + d8.toString());
		System.out.println("d9 = " + d9.toString());
		System.out.println("d10 = " + d10.toString());




	}

}
