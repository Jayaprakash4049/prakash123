package project2;


public class Heirarichal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();  
		c.Eat();  
		c.Cook(); 
	}

}
class Chef
{  
void Cook()
{System.out.println("Cooking...");}  
}  
class Waiter extends Chef
{  
void Serve()
       {System.out.println("Serving...");}  
}  
class Customer extends Chef
{  
void Eat() 
      {System.out.println("Eating...");}  
}  