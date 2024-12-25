public class Logger{
  private static final Logger instance = new Logger();
  private Logger(){

  }

  public static Logger getInstance(){
    return instance;
  }
  public void log(String message){
    System.out.println("Log:" +message );
  }
}

public class Application{
  public static void main(String [] args){
    Logger logger = Logger.getInstance();
    logger.log("starting Application");
    logger.log("Application Running Smoothly");
  }
}
