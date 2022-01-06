package Log4j;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;

public class Log4jDemo {
	
	
    private static Logger log =LogManager.getLogger(Log4jDemo.class.getName());
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("I am debugging");
			
			log.info("object is present");

			log.error("object is not present");
			log.fatal("this is fatal");
		

	}

}
