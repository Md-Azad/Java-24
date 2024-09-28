package Assessment_test.Assignment_three;

abstract class Vehicle {
    protected String model;
    protected Manufacture manufacture;
    protected Engine engine;

    public Vehicle(String model, Manufacture manufacture, Engine engine) {
        this.model = model;
        this.manufacture = manufacture;
        this.engine = engine;
    }

    public abstract void ShowCharacteristics();
}

class ICEV extends Vehicle {
    public ICEV(String model, Manufacture manufacture, Engine engine) {
        super(model, manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("ICEV Model: " + model);
        System.out.println(manufacture);
        System.out.println("Engine Type: " + engine.getType());
    }
}

class BEV extends Vehicle {
    public BEV(String model, Manufacture manufacture, Engine engine) {
        super(model, manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("BEV Model: " + model);
        System.out.println(manufacture);
        System.out.println("Engine Type: " + engine.getType());
    }
}

class HybridV extends Vehicle {
    public HybridV(String model, Manufacture manufacture, Engine engine) {
        super(model, manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Hybrid Vehicle Model: " + model);
        System.out.println(manufacture);
        System.out.println("Engine Type: " + engine.getType());
    }
}
