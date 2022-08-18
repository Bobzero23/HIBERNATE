package demo;

/*imports*/
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*main class*/
public class Alien_main 
{
	/*main derived method*/
    public static void main( String[] args )
    {
    	/*creating object of Alien class*/
    	Alien bobzero = new Alien();
    	bobzero.setaId(101);
    	bobzero.setaName("TheProblem");
    	bobzero.setaColor("Black");
    	
    	/*Configuring the connection*/
    	Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
    	SessionFactory sFactory = con.buildSessionFactory();
    	Session session = sFactory.openSession();
    	
    	/*Transaction*/
    	Transaction tran = session.beginTransaction();
    	session.save(bobzero);
    	tran.commit();
    	
    	
    }
}
