class main
{
	public static char[][] balcony = new char[8][25];
	public static char[][] secondClass = new char[24][25];
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static int contiguos[]; 
	
	
	public static void main(String[] args)
	{
	initializeArr(balcony , 8, 25 ,ANSI_WHITE);
	//System.out.println("The seats are empty"); 
	initializeArr(secondClass , 24, 25,ANSI_GREEN);
	//System.out.println(isTicketAvailable( 8, 25 ,balcony,'E'));
	//System.out.println(ticketBooking(300));
	
	contiguosSeats(24 ,25);
	
	

	
	newPrintSeats(24 , 25 , secondClass, "\u001B[31m");
	
	secondClass[12][15] = 'F';
	secondClass[18][16] = 'F';	

	contiguosSeats(24 ,25);
	
	bookXContiguousTickets(100);

	newPrintSeats(24 , 25 , secondClass, "\u001B[31m");
	contiguosSeats(24 ,25);
	}


	public static void  initializeArr(char[][] balcony, int row , int col,String ANSI_COLOR)
	{
		for(int i=0; i < 24;i++)
		{
			for(int j =0; j < 25; j++)
			{
				secondClass[i][j] = 'E';
			}
		}
	}
	
	 public static void PrintSeats(int rows , int col , char[][] seats , String ANSI_COLOR){
	       
	       for(int i = 0 ; i < rows ; i++)
	       {
		   for(int j = 0 ; j < col ; j++)
		   {
		      seats[i][j] = 'E';
		   } 
	       }
	      // System.out.println(seats);
	       
	       for(int i = 0 ; i < rows ; i++)
	       {
		  for(int j = 0 ; j < col ; j++) 
		  { 
		      System.out.print(ANSI_COLOR + seats[i][j]+" ");
		      
		  }
		  System.out.println(" ");
	       }
   }
	 
		
		
	public static void newPrintSeats(int rows , int col , char[][] seats , String ANSI_COLOR)
	{
        
       		for(int i = 0 ; i < rows ; i++)
       		{
         		for(int j = 0 ; j < col ; j++) 
          		{ 
              			System.out.print(ANSI_COLOR + seats[i][j]+" ");
              
          		}
          		System.out.println(" ");
       		}
  	 }

	public static boolean contiguosSeats(int rows , int cols )
	{
		int empty = 0;
		int totalSeats = rows * cols ;

		contiguos = new int[totalSeats];
		
		for(int i=0; i<rows ;i++ )
		{
			for( int j = 0 ; j < cols ; j++ )
			{
				if(secondClass[i][j] == 'E')
				{
					empty++;
					if(i == (rows -1) && j == (cols -1 ))
					{
						contiguos[empty -1 ]++;
					}
				}
				else
				{
					if(empty != 0)
					{
						contiguos[empty - 1]++;
						empty = 0;
					}
					
				}
			}
		}
		for(int i=0; i< totalSeats ;i++)
		{
			if(contiguos[i] > 0)
			{
				System.out.print((i+1) + " : " + contiguos[i] +" ; " );
			}
		}
		System.out.println();
		
		return true;
	}
	
	public static boolean areThereXContiguosSeats(int x , int rows , int cols )
	{
		int totalSeats = rows * cols ;
		
		for(int i = x - 1;i < totalSeats ;i++)
		{
			if(contiguos[i] > 0)
			{
				System.out.println("Got more than " + x + " Seats " + contiguos[i]);
				return true;
			}
	
		}
		return false;
	}
	
	public static boolean bookXContiguousTickets(int x)
	{
		if(areThereXContiguosSeats(x, 24, 25))
		{
			// Get the end pos
			int []endPos = getXcontiguosSeatsEndPos(x, 24, 25);
			// 23 0
			int x2 = endPos[0];
			int y2 = endPos[1];
			
			if(!(x2 == 23 && y2 == 24))
			{
				if(y2 == 0)
				{
					x2 = x2 - 1;
					y2 = 24;	
				}
				else
				{
					y2 = y2 - 1;
				}
			}
			
			System.out.println("First " + x2 + " : " + y2);
			
			for(int i=0;i<x;i++)
			{
				//When you have booked the first seat of this row
				if(y2 == 0)
				{
					System.out.println(x2 + " : " + y2);
					secondClass[x2][y2] = 'F';
					x2 = x2 -1;
					y2 = 24;
				}
				// When you still have empty seats in the ssame row
				else
				{
					System.out.println(x2 + " : " + y2);
					secondClass[x2][y2] = 'F';
					y2 = y2 - 1;	
				}
			}
			
		}
		else
		{
			System.out.println("There are no " + x + " contiguous seats available.");
		}
		
		return false;
	}
	
	public static int[] getXcontiguosSeatsEndPos(int x, int rows , int cols )
	{
		int empty = 0;
		int totalSeats = rows * cols ;
		int endPos[] = null;
		
		for(int i=0; i<rows ;i++ )
		{
			for( int j = 0 ; j < cols ; j++ )
			{
				if(secondClass[i][j] == 'E')
				{
					empty++;
					if(i == (rows -1) && j == (cols -1 ))
					{
						if(empty >= x)
						{
							endPos = new int[2];
							endPos[0] = i;
							endPos[1] = j;
							return endPos;
						}
					}
				}
				else
				{
					if(empty >= x)
					{
						endPos = new int[2];
						endPos[0] = i;
						endPos[1] = j;
						return endPos;
					}
					
				}
			}
		}
		
		return endPos;
	}	
}
