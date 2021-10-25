package Assignment3.Question1;

abstract class Moody {
    abstract String getMood();
    abstract void expressFeelings();
    public void queryMood() {
        System.out.println("I feel " + getMood() + " Today\n");
    }
}
