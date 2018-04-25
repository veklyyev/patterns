package mediator;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public class Client {
    public static void main(String [] args){
        User user = new User();
        user.setName("Paul");
        User user2 = new User();
        user2.setName("Jessica");

        user.sendMessage("Hey Jessy, how are you?");
        user2.sendMessage("Hey Paul, im fine, U?");
    }
}
