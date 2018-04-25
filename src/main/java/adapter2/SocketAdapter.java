package adapter2;

/**
 * Created by Yevhen_Veklyn on 3/26/2017.
 */
public class SocketAdapter {
    Socket socket;

    public int get12Volt(){
        return socket.getVolt()/20;
    }

    public int get120Volt(){
        return socket.getVolt();
    }
}
