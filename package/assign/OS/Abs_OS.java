package assign.OS;

abstract class os{
    public abstract void message();
}
public class Abs_OS extends os{
    public void message(){
        System.out.println("Message From Abstract OS");
    }
}
