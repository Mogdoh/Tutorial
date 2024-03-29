package sec01.exam04;

public class Television implements RemoteControl{
    //필드

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("텔레비전을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("텔레비전을 끕니다.");
    }

    @Override
    public void setVolume() {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨:" + this.volume);
    }
}
