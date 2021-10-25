package Practice;

public class Dog extends Pet implements iBoardable {

    private String size;
    private int startDay;
    private int endDay;

    public Dog(String name, String ownerName, String color, String size) {
        super(name, ownerName, color);
        this.size=size;
    }

    public String eat() {
        return this.getPetName()+" will eat pedigree";
    }
    public String sound() {
        return this.getPetName()+" will make a woof sound";
    }
    public void setBoardStart(int startDay) {
        this.startDay=startDay;
    }
    public void setBoardEnd(int endDay) {
        this.endDay=endDay;
    }
    public Boolean boarding(int day) {
        return day >= startDay && day <= endDay;
    }
}
