import java.util.Scanner;
class ticketsbook
{
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static int moneyCollected = 0;
        
        public static void main(String[] args)
	{
		//Scanner input = new Scanner(System.in);
		int rows = 8; 
		int cols = 25;
		char[][] balcony=new char[rows][cols];
		initializingTheSeats(rows,cols, balcony,"\u001B[0m");
		System.out.println("---------------------------------------------------------------------------");
		int row=24;
		int column=25;
		char[][] secondClass=new char[row][column];
		initializingTheSeats(row,column, secondClass,"\u001B[34m");
		
		
		
		
		// Here i am dynamically collecting price, row and col	from the user
		System.out.print("Enter the purpose either Booking or Returning the ticket : ");
		String ticketOperationChoice = input.nextLine();   // Booking or Returning
		System.out.print("Enter the Continuos or not Continuous seat Required :  ");
		String ContinuousSeats = input.nextLine();         // Continuous Seats availability check
		if(!ContinuousSeats.equals("Continuous")) {
			if(ContinuousSeats.equals("groupBooking")){
				System.out.print("Enter the price : ");
				int price = input.nextInt();
				System.out.print("Enter number of seats: ");
				int numberOfSeats = input.nextInt();
				if(price >= 300 && price < 500 ) {
					NotContinuousSeatBooking(price, secondClass,numberOfSeats);
				} else {
					NotContinuousSeatBooking(price, balcony,numberOfSeats);
				}
			}else {
				System.out.print("Enter the price of your choice balcony : 500 or SecondClass : 300  : ");
				int price = input.nextInt();
				System.out.print("Enter the row number of individual booking : ");
				int rowValue = input.nextInt();
				System.out.print("Enter the col number for individual booking : ");
				int colValue = input.nextInt();
				PriceBasedCatergorySelection(price,rowValue,colValue, balcony, secondClass, ticketOperationChoice,ContinuousSeats );
			}
		
		}else {
			
				System.out.print("Enter row Starting Value :");
				int rowStart = input.nextInt();
				System.out.print("Enter row ending Value : ");
				int rowEnd = input.nextInt();
				System.out.print("Enter col Starting Value :");
				int colStart = input.nextInt();
				System.out.print("Enter col ending Value :");
				int colEnd = input.nextInt();
				System.out.print("Enter the price  ");
				int price = input.nextInt();
				if(price >= 300 && price < 500 ) {
					if(isContinuousSeats(price,rowStart, rowEnd, colStart, colEnd, secondClass)) {
						ContinuousSeatBooking(price,rowStart, rowEnd, colStart, colEnd, secondClass);
					}else {
						System.out.println("Sorry user, Continuous seats are not available in second class, Please select another seats");
					}
				} else {
					if(isContinuousSeats(price,rowStart, rowEnd, colStart, colEnd, balcony)) {
						ContinuousSeatBooking(price,rowStart, rowEnd, colStart, colEnd, balcony);
					}else {
						System.out.println("Sorry user, Continuous seats are not available in balcony, Please select another seats");
					}
				}
				
		}

			
		// printing all the element in a balcony seats
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(ANSI_BLUE+balcony[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		// printing all the element in a secondclass seats
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(ANSI_RESET+secondClass[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println(moneyCollected);
	}
	
	// Initializing the seat with default values in 'E'
	public static void initializingTheSeats(int rows,int cols, char[][] seatsCategory,String ANSI_Color)
	{
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				seatsCategory[i][j]='E';
			}
		}
	}
	
	// Routing the user to either balcony or second class based price entered by the user
	public static void PriceBasedCatergorySelection(int price,int row,int col, char[][] balcony,char[][] second, String selection, String Continuous){
		if(selection.equals("Booking")){
			if(price >= 300 && price < 500 ) {
				if(second[row][col] != 'B') {
					SecondClassTicketBooking(price,row, col, second);
				}else {
					System.out.println("Seat is already book, pLease book another seat in second class");
				}
				
			} else {
				if(balcony[row][col] != 'B') {
					BalconyTicketBooking(price,row, col, balcony);
				}else {
					System.out.println("Seat is already book, pLease book another seat in balcony");
				}
			}
		}else {
			if(price >= 300 && price < 500 ) {
				SecondClassTicketReturning(price,row, col, second);
			} else {
				BalconyTicketReturning(price,row, col, balcony);
			}
		}
		
	}
	
	// Availability of seat in balcony, we are booking seats
	public static void BalconyTicketBooking(int price, int row, int col, char[][] balcony){
		if(balcony[row][col] == 'E'){
			balcony[row][col] = 'B';
			moneyCollected += price;
		}else {
		    System.out.println("Seat is already booked, please select anthor seat");
		}
	}
	
	// Availability of seat in second class, we are booking seats
	public static void SecondClassTicketBooking(int price,int row, int col, char[][] second){
		if(second[row][col] == 'E'){
			second[row][col] = 'B';
			moneyCollected += price;
		}else {
		    System.out.println("Seat is already booked, please select anthor seat");
		}
	}
	
	// Return of the balcony seat, if the seat is booked
	public static void BalconyTicketReturning(int price,int row, int col, char[][] balcony){
		if(balcony[row][col] == 'B'){
			balcony[row][col] = 'E';
			moneyCollected -= price;
		}else {
		    System.out.println("Seat is alreay available, No return will be taken");
		}
	}
	
	// Return of the second class seat, if the seat is booked
	public static void SecondClassTicketReturning(int price,int row, int col, char[][] second){
		if(second[row][col] == 'B'){
			second[row][col] = 'E';
			moneyCollected -= price;
		}else {
		    System.out.println("Seat is alreay available, No return will be taken");
		}
	}
	
	//Counting all the Balcony Seats and adding it Total collected money
	public static int BalconySeatsCount(int row,int col, char[][] balcony){
		int balconySeatCount = 0;
		for(int i = 0; i < row; i++) {
			for( int j = 0; j < col; j++) {
				if(balcony[i][j] == 'B') {
					balconySeatCount += 1;
				}
			}
		}
		System.out.println(balconySeatCount);
		return balconySeatCount * 500;
	}
	
	//Counting all the SecondClass Seats and adding it Total collected money
	public static int SecondClassSeatsCount(int row,int col, char[][] SecondClass){
		int secondClassSeatCount = 0;
		for(int i = 0; i < row; i++) {
			for( int j = 0; j < col; j++) {
				if(SecondClass[i][j] == 'B') {
					secondClassSeatCount += 1;
				}
			}
		}
		System.out.println(secondClassSeatCount);
		return secondClassSeatCount * 300;
	}
	
	// Checking for continuous seats of not
	public static boolean isContinuousSeats(int price, int startRow, int EndRow, int StartCol, int EndCol, char[][] category) {
		boolean flag = false;
		for(int i = startRow; i <= EndRow; i++){
			for(int j = StartCol; j <= EndCol; j++) {
				if(category[i][j] != 'B'){
					flag = true;
					
				}
			
			}
		}
		
		return flag;
	}
	
	// Continuous Booking of tickets
	public static void ContinuousSeatBooking(int price, int startRow, int EndRow, int StartCol, int EndCol, char[][] category) {
		for(int i = startRow; i <= EndRow; i++) {
			for(int j = StartCol; j < EndCol; j++) {
				category[i][j] = 'B';
				moneyCollected += price;
			}
		}
	}
	
	// Allocate non continuous seat to the user
	public static void NotContinuousSeatBooking(int price, char[][] category, int numberOfSeats) {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < numberOfSeats; i++) {
			System.out.print("Enter the row value : ");
			int row = input.nextInt();
			System.out.print("Enter the col value : ");
			int col = input.nextInt();
			if(category[row][col] == 'E'){
				category[row][col] = 'B';
				moneyCollected += price;
			}else {
				System.out.println("Seat is already Booked");
			}
		}
	
	}
 
}
