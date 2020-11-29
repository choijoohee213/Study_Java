package abstractEx2;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("엄청 높이 jump");
    }

    @Override
    public void turn() {
        System.out.println("한바퀴 돕니다.");
    }

    @Override
    public void showLevelMs() {
        System.out.println("숙련자");
    }
}
