/**
 * Created by gideon on 20/04/17.
 */
public class Message {
    private String sender,receiver,message;
    Message(String s,String r,String m)
    {
        this.sender = s;
        this.receiver = r;
        this.message = m;
    }

    Message(String m)
    {
        this.message = m;
    }

    public String getMessage()
    {
        return this.message;
    }

    public String getDetails()
    {
        return "SENDER : "+this.sender+"\nRECEIVER :"+this.receiver+"\nMESSAGE :"+this.message;
    }
}
