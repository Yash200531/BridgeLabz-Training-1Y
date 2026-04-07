public class TaskExample extends Thread{
    public void run () {
        for (int i; i <= 5; i++) {
            System.out.println("Task :" + i);

        }
    }
}