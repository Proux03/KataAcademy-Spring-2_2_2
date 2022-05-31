package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
     private static List<Car> carList = new ArrayList<>();

     static {
         carList.add(new Car("Toyota Carina", 2002, 260000));
         carList.add(new Car("Mitsubishi Pajero", 2007, 1450000));
         carList.add(new Car("Honda Stream", 2012, 1700000));
         carList.add(new Car("Toyota Vista", 1998, 210000));
         carList.add(new Car("Audi 90", 1988, 170000));
     }

    @Override
    public List<Car> getListOfCars(int count) {

        if (count == 0 || count >= 5) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
