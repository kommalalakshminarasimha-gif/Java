
public class Task9 {
	
	static String theatreName = "KLN Theater";
	
	String movieName;
	int seatNumber;
	String bookingStatus;
	int TicketId;
	boolean stores;
	
	void bookTicket() {
		System.out.println("Bookin status : " + bookingStatus);
	}
	
	void cancelTicket() {
		System.out.println("Bookin status : " + bookingStatus);
		
	}
 	
	void display_ticket_details() {
		System.out.println("Ticket Id is : " + TicketId);
		System.out.println("Ticket_stored  : " + stores);
		System.out.println("Movie name is : " + movieName);
		System.out.println("seat_number is : " + seatNumber);
		System.out.println("Theatre_name is : " + theatreName);
	}
	
	public static void main(String[] args) {
		Task9 a = new Task9();
		a.movieName = "Devara";
		a.seatNumber = 3;
		a.bookingStatus ="Reserved" ;
		a.stores = true;
		a.TicketId = 11;
		a.bookTicket();
		a.cancelTicket();
		a.display_ticket_details();		
		System.out.println("---------------------");
		
		
		Task9 b = new Task9();
		b.movieName = "Devara";
		b.seatNumber = 3;
		b.bookingStatus ="Reserved" ;
		b.stores = true;
		b.TicketId = 11;
		b.bookTicket();
		b.cancelTicket();
		b.display_ticket_details();		
		
		
		
	}

}
