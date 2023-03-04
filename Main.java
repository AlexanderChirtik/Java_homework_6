public class Main {
    public static void main(String[] args) {
        Map myMap = new Map();
        PointOfStart start = new PointOfStart();
        AccountProcessor.waveAlgorithm(myMap.map, start.getStartPosision());
        System.out.println(myMap.mapToString(myMap.map));
    }
}