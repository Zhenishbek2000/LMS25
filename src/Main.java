import java.math.BigDecimal;
import java.time.Year;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Car,CarInfo>carCarInfoMap=new HashMap<>();
        carCarInfoMap.put(new Car(3653,"jenish2000"),new CarInfo(Year.of(2022),"M5",new BigDecimal(70000),"black"));
        for(Map.Entry<Car, CarInfo> item : carCarInfoMap.entrySet()){
            System.out.println(item.getKey()+":"+item.getValue());
        }
    }
}