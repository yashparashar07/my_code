class UserThread extends Thread
{

    public void run()
    {
        // task for thread
        System.out.println("this is user difined thrad");
    }

}

public class ThreadOp
{

    public static void main(String args[])
    {

        System.out.println("program started .......");

        int x = 34+49;
        System.out.println("the sum is " + x);

        // Thread....
        Thread t = Thread.currentThread();
        String tName = t.getName();
        System.out.println("currrent running thread is " + tName);

        // setName
        t.setName("MyMain");
        System.out.println(t.getName());


        try{
            Thread.sleep(5000);
        }catch (Exception e){

        }

        System.out.println(t.getId());

        System.out.println("program ended .........");

        // going to start user defined thread

        UserThread thread = new UserThread();

        thread.start();

    }

}
