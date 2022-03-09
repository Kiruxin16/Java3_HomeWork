import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import lesson1.*;

public class Main {
    public static void main(String[] args) {

/*        Integer[] int1=new Integer[]{1,4,3,5,3,2};
        swap(int1,7,3);
        for (int i = 0; i <int1.length ; i++) {
            System.out.print(int1[i]+" ");
        }*/


 /*       Integer[] int2=new Integer[]{1,44,11,3,5,250,10,3,2,6};
        List<Integer> intList =arrToList(int2);
        System.out.println(intList);*/


        Box<Apple> appleBox1= new Box<>();
        for (int i = 0; i < 15; i++) {
            appleBox1.addFruit(new Apple());
        }
        System.out.println("appleBox1 "+appleBox1.getWeigt());

        Box<Apple> appleBox2= new Box<>();
        for (int i = 0; i < 3; i++) {
            appleBox2.addFruit(new Apple());
        }
        System.out.println("appleBox2 "+appleBox2.getWeigt());

        Box<Orange> orangeBox1= new Box<>();
        for (int i = 0; i < 10; i++) {
            orangeBox1.addFruit(new Orange());
        }
        System.out.println("orangeBox1 "+orangeBox1.getWeigt());

        System.out.println(appleBox1.compare(orangeBox1));

        appleBox1.sprinkle(appleBox2);

        System.out.println("После пересыпания \n"+
                "appleBox1 "+appleBox1.getWeigt()+"    "+
                "appleBox2 "+appleBox2.getWeigt());


    }

    ////////////Задание 1//////////////////
    public static <T> void swap(T[] arr,int x,int y){
        T  buffer;
        if (arr.length<x||arr.length<y||x<0||y<0){
            throw  new ArrayIndexOutOfBoundsException("Предложенных позиций нет в массива");
        }
        buffer=arr[x];
        arr[x]=arr[y];
        arr[y]=buffer;

    }

    //////////////Задание 2////////////////////
    public static <T> List<T> arrToList (T[] arr){
        List<T> result = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            result.add(arr[i]);
        }
        return result;

    }



}
