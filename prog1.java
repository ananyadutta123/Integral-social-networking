import java.io.*;
import java.util.*;
class prog1{

		static String message(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your message:");
			String msg=sc.nextLine();
			return msg;
		}

		static int options(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Select from the options below:");
				System.out.println(" 1/ View Timeline\n 2/ Publish\n 3/ Follow");
				System.out.println("Enter choice");
				int o1=sc.nextInt();
				return o1;
		}

		static int character(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Choose your character:");
		    System.out.println(" 1/ Alice\n 2/ Bob \n 3/ Charlie");
		    int ch=sc.nextInt();
		    return ch;
		}

	public static void main(String args[])
	{
		int ch1;
		String msg="";
		Scanner obj=new Scanner(System.in);
		

		 ArrayList<String> alice = new ArrayList<String>();
		 ArrayList<String> bob = new ArrayList<String>();
		 ArrayList<String> charlie = new ArrayList<String>();
		 

		 boolean alice1[]={true,false,false};
		 boolean bob1[]={false,true,false};
		 boolean charlie1[]={false,false,true};

		 while(true){
		 	int ch=character();
		switch(ch){

			case 1:
		
				ch1= options();

				if(ch1==1)
				{
					if(alice1[1]==true)
					{
						System.out.println(bob);
					}
					if(alice1[2]==true)
					{
						System.out.println(charlie);
					}
					System.out.println(alice);
				}
				else if(ch1==2)
				{
					msg=message();
					alice.add("Alice:  "+msg);
				}
				else if(ch1==3)
				{
					System.out.println("Enter (1) to follow bob or (2) to follow charlie");
					int ans=obj.nextInt();
					if(ans==1)
					{
						alice1[1]=true;
					}
					else if(ans==2)
					{
						alice1[2]=true;
					}
				}

				break;

			case 2:
		
				ch1= options();

				if(ch1==1)
				{
					if(bob1[0]==true)
					{
						System.out.println(alice);
					}
					if(bob1[2]==true)
					{
						System.out.println(charlie);
					}
					System.out.println(bob);
				}
				else if(ch1==2)
				{
					msg=message();
					bob.add("Bob:   "+msg);
				}
				else if(ch1==3)
				{
					System.out.println("Enter (1) to follow alice or (2) to follow charlie");
					int ans=obj.nextInt();
					if(ans==1)
					{
						bob1[0]=true;
					}
					else if(ans==2)
					{
						bob1[2]=true;
					}
				}
				break;

			case 3:
				ch1= options();

				if(ch1==1)
				{
					if(charlie1[0]==true)
					{
						System.out.println(alice);
					}
					if(charlie1[1]==true)
					{
						System.out.println(bob);
					}
					System.out.println(charlie);
				}
				else if(ch1==2)
				{
					msg=message();
					charlie.add("charlie:   "+msg);
				}
				else if(ch1==3)
				{
					System.out.println("Enter (1) to follow alice or (2) to follow bob");
					int ans=obj.nextInt();
					if(ans==1)
					{
						charlie1[0]=true;
					}
					else if(ans==2)
					{
						charlie1[1]=true;
					}
				}
				break;
			
			default:
				System.out.println("Wrong choice");


		}
	}
	}
}