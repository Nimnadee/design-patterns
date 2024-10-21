package mediatorDemo;

abstract class User {                                         //an abstract class that defines the basic properties and behaviors of a user
    protected ChatMediator mediator;                         //there are two fields
    protected String name;

    public User(ChatMediator mediator, String name) {        //constructor; initializes the mediator and name fields
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);             //declare two abstract methods, send and receive
    public abstract void receive(String message);
}