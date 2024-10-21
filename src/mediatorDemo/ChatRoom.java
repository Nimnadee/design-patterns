package mediatorDemo;

import java.util.ArrayList;
import java.util.List;



class ChatRoom implements ChatMediator {
    private List<User> users;                           // declares a private list to keep all users

    public ChatRoom() {                                 //constructor for the ChatRoom class.
        this.users = new ArrayList<>();                 //initializes the users list as an empty list.
    }

    @Override                                           //overriding methods from the ChatMediator interface.
    public void addUser(User user) {
        this.users.add(user);                          //adding the given user to the users' list in the chatroom
    }

    @Override
    public void sendMessage(String message, User user) {               // Send a message from one user to all other users in the chat room
        for (User u : this.users) {
            // Don't notify the user sending the message
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
