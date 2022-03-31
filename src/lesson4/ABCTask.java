package lesson4;

import java.util.List;

public class ABCTask extends Thread{
    static Object monitor = new Object();
    static volatile int currLitter =1;
    static final int ITERATIONS =5;
    Litters flowLitter;
    public enum Litters{
        LIT_A(1,"A"),
        LIT_B(2,"B"),
        LIT_C(3,"C");

        private int num;
        private String lit;
        Litters(int num,String lit){
            this.num=num;
            this.lit=lit;
        }

        public int getNum() {
            return num;
        }

        public String getLit() {
            return lit;
        }
    }


    public ABCTask(Litters lit) {
        this.flowLitter = lit;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < ITERATIONS; i++) {
                synchronized (monitor) {
                    while (currLitter != flowLitter.getNum()) {
                        monitor.wait();
                    }
                    System.out.println(flowLitter.getLit());
                    currLitter = flowLitter.getNum()%3+1;
/*                    switch (flowLitter) {
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

                    }*/
                    monitor.notifyAll();
                }

            }



        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }






}
