package singeltonDemo;

public class Main {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();                    //obtaining two instances of the logger class
        Logger logger2 = Logger.getInstance();

        logger1.log("This is a singleton pattern example.");      //call log method to log messages
        logger2.log("Only one instance is created.");

        System.out.println(logger1 == logger2);  // Output: true ==> logger1 and logger2
    }

}