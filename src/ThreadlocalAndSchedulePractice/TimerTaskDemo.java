package ThreadlocalAndSchedulePractice;

import java.util.TimerTask;
import java.util.Timer;

public class TimerTaskDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new MyTask(),100,1000);

    }
}

class MyTask extends TimerTask
{
    int runningTime;

    public MyTask(){ runningTime = 0; }

    private void setRunningTime()
    {
        runningTime++;
    }

    public void run()
    {
        System.out.println("[" + Thread.currentThread().getName() + "] is running." +
                "Current time: " + System.currentTimeMillis());
        System.out.println("This is " + runningTime + "th run.");
        setRunningTime();
    }
}
