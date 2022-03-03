package Utils;

import Base.Base;

public class TestUtil extends Base {

    public static final long EXPLICIT_WAIT = 30;
    public static final long IMPLICIT_WAIT = 10;


    public static void waitForSeconds(int timeout) {
        try {
            Thread.sleep(timeout * 1000L);
        } catch (InterruptedException e) {
            //Do nothing
        }
    }
}
