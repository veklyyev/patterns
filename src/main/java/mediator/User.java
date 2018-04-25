package mediator;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public class User {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this, message);
    }
}
