package Assignment3.Question1;

public class Main {
    public static void main(String[] args) {
        Psychiatrist psyObj = new Psychiatrist();
        Happy hapObj = new Happy();
        Sad sadObj = new Sad();
        psyObj.examine(hapObj);
        psyObj.observe(hapObj);
        psyObj.examine(sadObj);
        psyObj.observe(sadObj);
    }
}
