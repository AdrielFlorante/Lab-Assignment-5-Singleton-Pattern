public class UserApp {
    public static void main(String[] args) {
        QueueSystem queueSystem = QueueSystem.getInstance();

        queueSystem.setQueue(0);

        queueSystem.joinQueue(); // A visitor has joined the queue
        queueSystem.joinQueue();
        queueSystem.joinQueue();
        queueSystem.joinQueue();

        System.out.println("Screens on the frontdesk says the queue is currently: " + queueSystem.getQueue()); // Can be called from anywhere to show what the current queue looks like in the system

        queueSystem.setQueue(2); // For whatever reason, this helpdesk reset the queue number to 2

        queueSystem.next();

        System.out.println("Remote web interface says the queue is now: " + queueSystem.getQueue());
    }
}
