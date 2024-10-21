package mediatorDemo;


// implementation of the abstract User class.
class ConcreteUser extends User {

    public ConcreteUser(ChatMediator mediator, String name) {
        super(mediator, name);                                          //Calls the superclass constructor to set up the mediator and name fields.
    }

    @Override                                                           //Implements the behavior for sending a message  and receiving a message.
    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " receives: " + message);
    }
}
