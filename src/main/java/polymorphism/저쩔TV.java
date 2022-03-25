package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class 저쩔TV implements TV {

    // speaker 변수에 들어갈 객체를 자동으로 할당을 해준다.
    @Autowired
    private Speaker speaker;

    public void powerOn() {
        System.out.println("저쩔티비 ---- 전원 켠다.");
    }

    public void powerOff() {
        System.out.println("저쩔티비 ---- 전원 끈다.");
    }

    public void volumeUp() {
        speaker.volumeUp();
    }

    public void volumeDown() {
        speaker.volumeDown();
    }

}
