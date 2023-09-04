package com.Composition;

public class Car {
        private Engine engine;
        Car(Engine en)
        {
            engine = en;
        }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
