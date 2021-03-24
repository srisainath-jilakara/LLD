package Driver;

import java.util.*;



class Bus {
	HashMap<Integer,Integer> seats;
	int rows;
	int col;
	public Bus(int m,int n)
	{
		seats =  new HashMap<>();
		this.rows = m;
		this.col = n;
		for(int i =1;i<=m;i++)
		{
			seats.put(i,0);// 0-> filled seats
		}
		
	}
	
	public void bookSeats(int seats) 
	{
		System.out.println(seats);
		for(int i=1;i<=this.seats.size();i++)
		{
			
			if((this.col - this.seats.get(i))>=seats) // 7 10-0
			{
				System.out.println("das");
				this.seats.put(i,this.seats.get(i)+seats);
				System.out.println(" booked");
				return;
			}
		}
		
		for(int i=1;i<=this.seats.size();i++)
		{
			//System.out.println("sdas");
			if(seats == 0 )
			{
				System.out.println("booked");
				return;
			}
			if(this.seats.get(i)<this.col) 
			{
				if(this.col-this.seats.get(i)<seats) // 5 - 0 
				{
					seats = seats - (this.col-this.seats.get(i)); // seats = 8 - 3 = 5
					System.out.println(seats);
					this.seats.put(i,this.col);
					
				}
				else if((this.col-this.seats.get(i))>=seats) // 
				{
					System.out.println(seats);
					this.seats.put(i,this.seats.get(i)+seats); 
					seats = 0;
				}
			}
		}
	}
}

public class Exam
{
public static void main(String args[])
{
	Bus bus = new Bus(10,5);
//	Scanner sc = new Scanner(System.in);
	//System.out.println(bus.seats.get(1));
	bus.bookSeats(7);
	bus.bookSeats(8);
	for(Map.Entry<Integer,Integer> entry: bus.seats.entrySet())
	{
		System.out.println(entry.getKey()+ "  "+ entry.getValue());
	}
	
}
}


