package polymorphism;

public class 어쩔TV implements TV {

    private SonySpeaker speaker;
    private int price;

    public 어쩔TV() {
        System.out.println("===> 어쩔티비 객체 생성");
    }

    public 어쩔TV(SonySpeaker speaker) {
        System.out.println("===> 어쩔티비 객체 생성(2)");
        this.speaker = speaker;
    }

    public 어쩔TV(SonySpeaker speaker, int price) {
        System.out.println("===> 어쩔티비 객체 생성(3)");
        this.speaker = speaker;
        this.price = price;
    }

    @Override
    public void powerOn() {
        System.out.println("어쩔티비 ---- 전원 켠다.(가격 : " + price + "원)");
    }

    @Override
    public void powerOff() {
        System.out.println("어쩔티비 ---- 전원 끈다.");
    }

    @Override
    public void volumeUp() {
        speaker.volumeUp();
    }

    @Override
    public void volumeDown() {
        speaker.volumeDown();
    }

}
