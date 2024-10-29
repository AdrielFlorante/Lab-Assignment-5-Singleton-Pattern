// forked from https://github.com/JerryEsperanza/singletonPattern/blob/main/UserApp.java

public class QueueSystem {
    private static QueueSystem instance;
    private int queue;

    //this prevents instantation outside of the class
    // how
    private QueueSystem(){}

    // get application instance
    public static synchronized QueueSystem getInstance() {
        if (instance == null)
            instance = new QueueSystem();
        return instance;
    }

    public synchronized void setQueue(int queue) {
        // Number to set as new queue number for all stations
        this.queue = queue;
        System.out.println("Queue is now: " + this.queue);
    }

    public synchronized void joinQueue() {
        this.queue++;
        System.out.println("Another one has joined the queue!");
    }

    // Queue is progressing
    public synchronized void next() {
        if (queue != 0) {
            this.queue--;
            System.out.println("NEXT!");
        } else {
            // Do nothing!
        }
    }

    // To monitor queue remotely
    public synchronized int getQueue() {
        return queue;
    }

}