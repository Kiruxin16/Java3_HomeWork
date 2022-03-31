import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import lesson1.*;
import lesson4.*;

public class Main {
    public static void main(String[] args) {

        new ABCTask(ABCTask.Litters.LIT_A).start();
        new ABCTask(ABCTask.Litters.LIT_B).start();
        new ABCTask(ABCTask.Litters.LIT_C).start();
    }
}


