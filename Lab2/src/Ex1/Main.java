package Ex1;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(0);
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        int popped = myQueue.pop();
        if (!myQueue.isEmpty()) {
            System.out.println(myQueue);
        }
    }
}
