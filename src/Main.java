import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Integer[] int1=new Integer[]{1,4,3,5,3,2};
        swap(int1,1,3);
        for (int i = 0; i <int1.length ; i++) {
            System.out.print(int1[i]+" ");
        }




    }
    public static <T> void swap(T[] arr,int x,int y){
        T  buffer;
        if (arr.length<x||arr.length<y||x<0||y<0){
            throw  new ArrayIndexOutOfBoundsException();
        }
        buffer=arr[x];
        arr[x]=arr[y];
        arr[y]=buffer;


    }
}
