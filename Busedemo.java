package busreser;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
public class Busedemo {
	public static void main(String[] args) {
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		
		buses.add(new Bus(1,true,21));
		buses.add(new Bus(2,false,40));
		buses.add(new Bus(3,true,55));
		for(Bus b:buses){
			b.displayBusInfo();
		}
		
		
		int useropt =1;
		try (Scanner anu = new Scanner(System.in)) {
			while(useropt==1) {
			System.out.println("enter 1 to book 2 to exit");
			useropt = anu.nextInt();
			if(useropt==1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
				bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else {
					System.out.println("sorry: you can try another bus:");
				}
				
				
			  }

			}
		}
	}

	

}


