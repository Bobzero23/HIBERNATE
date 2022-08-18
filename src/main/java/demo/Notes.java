/* SOME NOTE ABOUT HIBERNATE
 * 
 * CONFIGURATION
 * To work with hibernate we gonna gave to add some dependencies of hibernate first
 * Thus, we can use hibernate's interfaces such as Session etc.
 * So just know before creatin object of Session you gonna gave to create object of Session factory
 * And all of this are interfaces so you gonna have to find a class which is Configuration and this class
 * you gonna have to import which its import is import org.hibernate.cfg.Configuration;
 * 
 * 
 * DOWNOLOADING DEPENDENCY
 * Simply go to maven repository website and there you can search for a certain dependecies which
 * you are lookin for...
 * 
 * CONNECTION
 * right click the project you are working with, create a new file called hibernate.cfg.xml
 * then you gonna have to pass your ifno there i.e driver and url etc. then click finish then you will get
 * the hibernate.cfg.xml file there for you my booooy... with all the connection
 * After that you gonna have to connect the file we just created with the jave code
 * 
 * CONNECTION WITH HIBERNATE.CFG.XML
 * While creating the Configuration object just add this method and pass the name of the file you created 
 * is gonna seem like this --->	Configuration con = new Configuration().configure("PassTheName");
 * 
 * 
 * 
 *
 */