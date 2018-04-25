package mediator;

import java.util.Date;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [User: " + user.getName() + "] [Message: " + message + "]");
    }
}
