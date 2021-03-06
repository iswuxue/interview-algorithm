package java_thread.stack_1;

/**
 * Created with IntelliJ IDEA.
 *
 * @author WuXue
 * @date 2019/7/29 0029
 */
public class ThreadC extends Thread {

    private Consume consume;

    public ThreadC(Consume consume) {
        this.consume = consume;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            consume.popService();
        }
    }
}
