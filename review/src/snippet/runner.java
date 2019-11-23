package snippet;

public class runner {
	
	

	public static void main(String[] args) 
	{
		Llist list = new Llist();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(14);
		list.print();
		list.delDups();
		list.print();

	}

}
