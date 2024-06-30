public class Main {
    public static void main(String[] args) {
        /// Task #1
        Car car = new Car.CarBuilder()
                .setEngine("V8")
                .setWheels("Alloy")
                .setBody("Sedan")
                .setInterior("Leather")
                .build();

        System.out.println(car);

        /// Task #2
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
        System.out.println("Computer started.");

        // Do some work...

        computer.stopComputer();
        System.out.println("Computer stopped.");

        /// Task #3
        Context context = new Context();

        StartState startState = new StartState();
        context.setState(startState);
        context.doAction();

        StopState stopState = new StopState();
        context.setState(stopState);
        context.doAction();
    }
}
