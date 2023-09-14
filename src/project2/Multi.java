package project2;


public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grandchild d=new grandchild();  
		d.cry();  
		d.play();  
		d.eat(); 
	}

}
class parent
   {  
void eat(){System.out.println("eating...");}  
  }  
class child extends parent
  {  
void play(){System.out.println("Playing...");}  
  }  
class grandchild extends child
{  
void cry(){System.out.println("Crying...");}  
}  