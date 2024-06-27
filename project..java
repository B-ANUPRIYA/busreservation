package busreser;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

public class Booking {
	
	private static final int buses = 0;
	String passengername;
	int busno;
	Date date;
	Timer time;
	
	
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your passenger name: ");
		passengername = scanner.next();
		System.out.println("Enter your busno: ");
		busno = scanner.nextInt();
		System.out.println("Enter date dd--mm--yyyy ");
		String dateInput = scanner.next();
		SimpleDateFormat dateformat = new SimpleDateFormat("da--mm-yyyyy");
		try {
			dateformat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}

     }
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity = 0;
		for(Bus bus:buses) {
			if(bus.getBusNo() == busno)
				capacity = bus.getCapacity();
				
		}
		int booked = 0;
		for(Booking b:bookings) {
			if(b.busno == busno && b.date.equals(date)){
				booked ++;
			}
		}
		return booked<capacity?true:
		
	}

}
