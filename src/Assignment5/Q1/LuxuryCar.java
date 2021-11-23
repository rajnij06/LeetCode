package Assignment5.Q1;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(ICar car) {
        super(car);
    }

    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}

