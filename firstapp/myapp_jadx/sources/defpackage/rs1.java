package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes7.dex */
public final class rs1 extends HandlerThread {
    public static rs1 a;
    public static Handler b;

    public rs1() {
        super("BackgroundThread", 0);
    }

    public static void a(Runnable runnable) {
        synchronized (rs1.class) {
            if (a == null) {
                rs1 rs1Var = new rs1();
                a = rs1Var;
                rs1Var.start();
                b = new Handler(a.getLooper());
            }
            b.post(runnable);
        }
    }
}
