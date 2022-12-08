import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Car,CarInfo>carCarInfoMap=new HashMap<>();
        carCarInfoMap.put(new Car(3653,"jenish2000"),new CarInfo(2006,"M5",700000,"black"));
        for(Map.Entry<Car, CarInfo> item : carCarInfoMap.entrySet()){
            System.out.println(item.getKey()+":"+item.getValue());
        }
    }
}