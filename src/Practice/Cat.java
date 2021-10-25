package Practice;

public class Cat extends Pet implements iBoardable {

    private int startDay;
    private int endDay;

    public Cat(String name, String ownerName, String color) {
        super(name, ownerName, color);
    }

    public String eat() {
        return this.getPetName()+" will eat Tuna";
    }
    public String sound() {
        return this.getPetName()+" will make a meow sound";
    }
    public void setBoardStart(int day) {
        this.startDay=day;
    }
    public void setBoardEnd(int day) {
        this.endDay=day;
    }
    public Boolean boarding(int day) {
        return day >= startDay && day <= endDay;
    }
}
