public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setEngine("V8")
                .setWheels("Alloy")
                .setBody("Sedan")
                .setInterior("Leather")
                .build();

        System.out.println(car);

        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
        System.out.println("Computer started.");

        // Do some work...

        computer.stopComputer();
        System.out.println("Computer stopped.");
    }
}
