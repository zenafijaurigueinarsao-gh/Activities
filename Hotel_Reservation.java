package Inarsao;

import java.util.Scanner;

public class Hotel_Reservation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hotel[][] = new int[7][5];
		int choice;

		while (true) {
			System.out.println("=== HOTEL RESERVATION SYSTEM ===");
			System.out.println("1. View Rooms");
			System.out.println("2. Check In");
			System.out.println("3. Check Out");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			
			System.out.println();

			switch (choice) {

			case 1:
				for (int i = 6; i >= 0; i--) {
					System.out.print("Floor " + (i + 1) + ": ");
					for (int j = 0; j < 5; j++) {
						System.out.print("[" + hotel [i][j] + "]");
					}
					System.out.println();
				}
				System.out.println();
				break;

			case 2:
				System.out.print("Enter floor (1-7): ");
				int floorIn = sc.nextInt();
				System.out.print("Enter room (1-5: ");
				int roomIn = sc.nextInt();

				if (hotel[floorIn - 1] [roomIn -1 ] == 0) {
					hotel[floorIn -1][roomIn - 1] = 1;
					System.out.println("Check-in successful!");
				} else {
					System.out.println("Room already occcupied");
				}
				System.out.println();
				break;

			case 3:
				System.out.print("Enter floor (1-7: ");
				int floorOut = sc.nextInt();
				System.out.print("Enter room (1-5: ");
				int roomOut = sc.nextInt();

				if (hotel[floorOut - 1][roomOut - 1] == 1) {
					hotel[floorOut - 1][roomOut - 1] = 0;
					System.out.println("Room already empty");
				} else {
					System.out.println("Check-out successful!");
				}
				System.out.println();
				break;

			case 4: 
				System.out.println("Exiting Program...");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice");
			}
		}
	}

}