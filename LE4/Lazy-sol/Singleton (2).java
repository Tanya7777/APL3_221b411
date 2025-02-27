public class Singleton
{
    private static Singleton uniqueInstance;
    private static int counter = 0;
    
    private Singleton () {
        counter++;
		System.out.println("Counter : " + counter);	
        
    }
    public static Singleton getInstance (){
        if(uniqueInstance == null)
        uniqueInstance = new Singleton();
        return uniqueInstance;
    }
	
	
}
