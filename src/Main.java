import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<>();

        carList.add(new Car("Ford",12));
        carList.add(new Car("VW", 5));
        carList.add(new Car("BMW",6));
        carList.add(new Car("VW", 8));
        carList.add(new Car("Lamborghini",2));
        carList.add(new Car("Lamborghini",1));

        System.out.println(sortCarList(carList));
        System.out.println(sortCarListComparator(carList));
    }

    public static ArrayList<Car> sortCarList(ArrayList<Car> originalCarList){

        Car[] sortedCarList = new Car[originalCarList.size()];
        ArrayList<Car> carList = (ArrayList<Car>) originalCarList.clone();

        int index;
        String manufacturer;

        for(int i=0; i<sortedCarList.length; i++) {
            index = 0;
            manufacturer = carList.get(0).getManufacturer();
            for (int j = 0; j < carList.size(); j++) {
                if(carList.get(j).getManufacturer().compareTo(manufacturer) < 0){
                    index = j;
                    manufacturer = carList.get(j).getManufacturer();
                }
            }
            sortedCarList[i] = carList.get(index);
            carList.remove(index);
        }

        ArrayList<Car> newCarList = new ArrayList<>();

        for(int i=0; i<sortedCarList.length; i++){
            newCarList.add(sortedCarList[i]);
        }

        return newCarList;
    }

    public static ArrayList<Car> sortCarListComparator(ArrayList<Car> carList){

        Comparator<Car> carCompare = Comparator.comparing(Car::getManufacturer).thenComparing(Car::getAge);

        ArrayList<Car> newCarList = (ArrayList<Car>) carList.clone();

        Collections.sort(newCarList,carCompare);
        return newCarList;
    }
}
