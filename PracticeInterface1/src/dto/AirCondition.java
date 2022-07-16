package dto;

public class AirCondition implements KoreaRemote{
    @Override
    public void subTitle(String language) {
        System.out.println("Display " + language);
    }

    @Override
    public void onDevice() {
        System.out.println("on AC");
    }

    @Override
    public void offDevice() {
        System.out.println("off AC");
    }

    public static void main(String[] args) {
        KoreaRemote re = new AirCondition();
        re.onDevice();
        re.subTitle("Korean");
        re.setLock();
    }
}
