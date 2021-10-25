package Practice;

public abstract class Pet {
    public String getPetName(){
        return name;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public String getColor(){
        return color;
    }

    private String name;
    private String ownerName;
    private String color;

    public Pet(String name, String ownerName, String color){
        this.name=name;
        this.ownerName=ownerName;
        this.color=color;
    }

    public String toString(){
        return "Pet name= " + this.name + " Owner = " + this.ownerName + " Color = " + this.color;
    }

    abstract String eat();
    abstract String sound();
}
