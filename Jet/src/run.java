import java.util.Scanner;

public class run {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "the sky is blue";
		
		String temp = "";
		
		for(int i =str.length()-1; i >=0; i--) 
		{
			temp += str.charAt(i);
		}
		/*
		String[] tem = str.trim().split("\\s+");

		for(int i =tem.length-1; i>= 0; i--) 
		{
			System.out.println(tem[i]);
		}*/
		/*
		
		phone ph = new phone();
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		String userName = myObj.nextLine();  // Read user input ph = new phone();
		int count = 0;
		while(count < 5) 
		{
			if(userName == "quit") 
			{
				return;
			}
			System.out.println(ph.function());
			userName = myObj.nextLine(); 
			count++;
		}
		
		ph.countLast300();*/
		
		dLinkedList list = new dLinkedList();
		list.add(1);
		list.add(3);
		list.add(4);
		
		list.print();
	}

}
