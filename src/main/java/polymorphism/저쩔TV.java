package polymorphism;

public class 저쩔TV implements TV {

    public void powerOn() {
        System.out.println("저쩔티비 ---- 전원 켠다.");
    }

    public void powerOff() {
        System.out.println("저쩔티비 ---- 전원 끈다.");
    }

    public void volumeUp() {
        System.out.println("저쩔티비 ---- 소리를 올린다.");
    }

    public void volumeDown() {
        System.out.println("저쩔티비 ---- 소리를 내린다.");
    }

}
