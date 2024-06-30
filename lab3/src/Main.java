//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setEngine("V8")
                .setWheels("Alloy")
                .setBody("Sedan")
                .setInterior("Leather")
                .build();

        System.out.println(car);
    }
}
