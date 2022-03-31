package lesson4;

public class ABCTask extends Thread{
    static Object monitor = new Object();
    static volatile char currLitter ='a';
    static final int ITERATIONS =5;
    char flowLitter;


    public ABCTask(char flowLitter) {
        this.flowLitter = flowLitter;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < ITERATIONS; i++) {
                synchronized (monitor) {
                    while (currLitter != flowLitter) {
                        monitor.wait();
                    }
                    switch (flowLitter) {
                        case ('a'):
                            System.out.println("A");
                            currLitter = 'b';
                            break;
                        case ('b'):
                            System.out.println("B");
                            currLitter = 'c';
                            break;
                        case ('c'):
                            System.out.println("C");
                            currLitter = 'a';
                            break;

                    }
                    monitor.notifyAll();
                }

            }



        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }






}
