package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    private List<T> content;

    public Box() {
        content= new ArrayList<>();
    }

    public float getWeigt(){
        float sum =0.0f;
        for (int i = 0; i <content.size() ; i++) {
            sum+=content.get(i).getWeight();
        }
        return sum;
    }

    public void addFruit(T fruit){
        content.add(fruit);
    }

    public boolean compare(Box<?> another){
        return Math.abs(this.getWeigt()-another.getWeigt())<0.001;
    }

    /**
     *Пересыпает из корзины в корзину
     */
    public void sprinkle(Box<T> another){
        another.content.addAll(this.content);
        this.content.clear();



    }
}
