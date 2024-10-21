package mediatorDemo;

public class MediatorPatternDemo {                              //MediatorPatternDemo class contains the main method,
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();            //create an instance of ChatRoom,   which implements the ChatMediator interface

        User user1 = new ConcreteUser(chatMediator, "Alice");          //create three instances of ConcreteUser
        User user2 = new ConcreteUser(chatMediator, "Bob");
        User user3 = new ConcreteUser(chatMediator, "Charlie");

        chatMediator.addUser(user1);                                         //add 3 users to the chat mediator.
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        user1.send("Hello, everyone!");                                     //these lines simulate the users sending messages through the chat room
        user2.send("Hi Alice!");
        user3.send("Hey Alice and Bob!");
    }
}