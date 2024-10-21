package mediatorDemo;

//Mediator Interface
//Define an interface for the mediator

interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
