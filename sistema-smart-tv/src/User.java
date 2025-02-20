public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.increaseVolume();

        System.out.println("Current channel : "+smartTv.channel);
        smartTv.changeChannel(22);
        System.out.println("Current channel : "+smartTv.channel);
        System.out.println("Current volume : "+smartTv.volume);

        System.out.println("TV on? "+smartTv.power);
        
        System.out.println("Current volume : "+smartTv.volume);

        smartTv.turnOnTv();
        System.out.println("New status -> TV on? "+smartTv.power);

        smartTv.turnOffTv();
        System.out.println("New status -> TV on? "+smartTv.power);
    }
}
