package singeltonDemo;

public class Logger {

    // Step 1: Make the constructor private
    private Logger(){}


    //Step 2: declare a private static variable to hold the single instance
    private static Logger instance;


    // Step 3: Provide a public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            // If no instance exists, create one
            instance = new Logger();
        }
        return instance;
    }

    // Method  used to log messages to the log  file
    public void log(String message) {
        // Append the message to the log file
        System.out.println("Logging message: " + message);
    }
}



