package Assignment4;

class Traffic_Light_Controlled_Intersection {
    static class Light {

        private final Signal signalTraffic;

        public Light() {
            signalTraffic = new Signal();
        }

        public void carArrived(int carNo, int roadNo, int direction, Runnable turnGreen, Runnable passCar) {
            synchronized (signalTraffic) {
                if (signalTraffic.greenRoadA != roadNo) {
                    turnGreen.run();
                    signalTraffic.greenRoadA = roadNo;;
                    System.out.println("Light on road " + roadNo + " turned green!");
                }
                System.out.println("Car " + carNo + " on road " + roadNo + " crossed the intersection in direction " + direction);
                passCar.run();
            }
        }

        class Signal {
            int greenRoadA = 1;
        }
    }
}

class TrafficLights {
    public static void main (String[] args) {
        Traffic_Light_Controlled_Intersection.Light trafficLight = new Traffic_Light_Controlled_Intersection.Light();
        int numberOfThreads = (int) Math.floor(Math.random() * (20 - 1 + 1) + 1);
        for (int i = 0; i < numberOfThreads; i++) {
            int carNo = i + 1;
            new Thread(
                    () -> {
                        try {
                            trafficLight.carArrived(
                                    carNo,
                                    (int) Math.floor(Math.random() * (2 - 1 + 1) + 1),
                                    (int) Math.floor(Math.random() * (4 - 1 + 1) + 1),
                                    new Runnable() {
                                        @Override
                                        public void run() {
                                        }
                                    },
                                    new Runnable() {
                                        @Override
                                        public void run() {
                                        }
                                    }
                            );
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
            ).start();
        }
    }
}
