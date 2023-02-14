package practice.filesPractice;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectSerialisablePractice {


    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2  = new Car();

        Car[] cars = {c1,c2};

        ObjectOutputStream objectOutputStream  = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("navjyot.txt"));
            objectOutputStream.writeObject(c1);
            objectOutputStream.writeObject(cars);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}


class  Car implements Serializable {

    String model;
    int carNumber;
    static int count = 0;

    Car(){
        this.model = "Test model"+count;
        this.carNumber = count;
        count++;
    }

}
