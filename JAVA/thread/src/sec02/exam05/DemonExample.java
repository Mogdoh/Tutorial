package sec02.exam05;

public class DemonExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true); //데몬 스레드로 설정
        autoSaveThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        System.out.println("메인 스레드 종료");
    }
}
