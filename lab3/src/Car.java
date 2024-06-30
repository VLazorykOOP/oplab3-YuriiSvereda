public class Car {
    private String engine;
    private String wheels;
    private String body;
    private String interior;

    // Приватний конструктор, доступний лише з класу Builder
    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.body = builder.body;
        this.interior = builder.interior;
    }

    // Статичний внутрішній клас Builder
    public static class CarBuilder {
        private String engine;
        private String wheels;
        private String body;
        private String interior;

        public CarBuilder() {
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(String wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        public CarBuilder setInterior(String interior) {
            this.interior = interior;
            return this;
        }

        // Метод, що будує та повертає об'єкт Car
        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + ", body=" + body + ", interior=" + interior + "]";
    }
}