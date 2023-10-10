package assign;
import assign.DBMS.*;
import assign.OS.*;
public class main {
    public static void main(String[] args) {
        DBMS a=new DBMS();
        InterDBMS b=new InterDBMS();
        Abs_OS c=new Abs_OS();
        OS1 d=new OS1();
        a.message();
        b.message();
        c.message();
        d.message();
    }
}