package Assessment_test.Assignment_three;

abstract class Engine {
    protected String type;

    public String getType() {
        return type;
    }

    public abstract void start();
}

class CombustionEngine extends Engine {
    public CombustionEngine() {
        this.type = "Combustion Engine";
    }

    @Override
    public void start() {
        System.out.println("Starting a combustion engine...");
    }
}

class ElectricEngine extends Engine {
    public ElectricEngine() {
        this.type = "Electric Engine";
    }

    @Override
    public void start() {
        System.out.println("Starting an electric engine...");
    }
}

class HybridEngine extends Engine {
    public HybridEngine() {
        this.type = "Hybrid Engine";
    }

    @Override
    public void start() {
        System.out.println("Starting a hybrid engine...");
    }
}
