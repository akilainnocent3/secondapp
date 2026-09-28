package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class dp0 {
    public static final Logger a = Logger.getLogger(dp0.class.getName());

    public static void a() {
        Level level = Level.FINEST;
        Logger logger = a;
        if (logger.isLoggable(level)) {
            logger.log(level, "context is null", (Throwable) new AssertionError());
        }
    }
}
