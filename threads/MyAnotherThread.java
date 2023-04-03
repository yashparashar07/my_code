
public class MyAnotherThread extends Thread
{
    public void run(){
        for(int i = 10 ; i >= 0 ; i--){
            System.out.println("the value of j is " + i);

            try {
                Thread.sleep(1000);
            }catch(Exception e){

            }

        }
    }
}
