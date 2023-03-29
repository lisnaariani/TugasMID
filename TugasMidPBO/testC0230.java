//Lisna 0230

interface A{ 
	public void a();
}
interface B extends A{
	public void a();
}
class Central implements A,B{
	public void a(){	
		System.out.println("a");
	}
	public static void main(String arg[]){
		System.out.println("main");
		this.aaa();
	}
}