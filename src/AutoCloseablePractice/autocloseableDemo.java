package AutoCloseablePractice;

public class autocloseableDemo {
    public static void main(String[] args) throws Exception {
        try(NetMessage nm = new NetMessage("I am Reindorius"))
        {
            nm.send();
        }
        catch (Exception e) {e.printStackTrace(); }
    }
}

class NetMessage implements AutoCloseable
{
    private String msg;

    public NetMessage(String msg)
    {
        this.msg = msg;
    }

    public boolean open()
    {
        System.out.println("Obtaining resources...");
        return true;
    }

    public void send()
    {
        if(this.open())
        {
            if(this.msg.contains("Reindorius")) throw new RuntimeException("This is Reindorius");

        }
        System.out.println("Sending message " + this.msg);
    }

    public void close() throws InterruptedException
    {
        System.out.println("Closing channel...");
    }
}

