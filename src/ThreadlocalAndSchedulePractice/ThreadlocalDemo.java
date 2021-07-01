package ThreadlocalAndSchedulePractice;

public class ThreadlocalDemo {
    public static void main(String[] args) {
        new Thread(
                ()->
                {
                    Message msg = new Message();
                    msg.setInfo("Thread A is sending message: Reindorius Sapientiam");
                    //Initialize a Message instance
                    Channel.setMessage(msg);//Save data to Threadlocal
                    Channel.send();
                },"Message Sender A"
        ).start();//start thread A

        new Thread(
                ()->
                {
                    Message msg = new Message();
                    msg.setInfo("Thread B is sending message: Reindorius");
                    //Initialize a Message instance
                    Channel.setMessage(msg);//Save data to Threadlocal
                    Channel.send();
                },"Message Sender B"
        ).start();

        new Thread(
                ()->
                {
                    Message msg = new Message();
                    msg.setInfo("Thread C is sending message: Sapientiam");
                    //Initialize a Message instance
                    Channel.setMessage(msg);//Save data to Threadlocal
                    Channel.send();
                },"Message Sender C"
        ).start();
    }
}

class Channel
{
    private static final ThreadLocal<Message> THREADLOCAL = new ThreadLocal<>();
    private Channel(){}

    public static void setMessage(Message m)
    {
        THREADLOCAL.set(m);
    }
    public static void send()
    {
        System.out.println("[" + Thread.currentThread().getName() + "] is sending message...");
    }
}

class Message
{
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
