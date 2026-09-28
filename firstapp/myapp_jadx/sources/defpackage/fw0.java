package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class fw0 extends b3 {
    public static volatile fw0 d;
    public static final dw0 e = new dw0();
    public static final ew0 f = new ew0();
    public final lhd c;

    public fw0() {
        super(12);
        this.c = new lhd();
    }

    public static fw0 X() {
        if (d != null) {
            return d;
        }
        synchronized (fw0.class) {
            try {
                if (d == null) {
                    d = new fw0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }

    public final boolean Y() {
        this.c.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void Z(Runnable runnable) {
        lhd lhdVar = this.c;
        if (lhdVar.e == null) {
            synchronized (lhdVar.c) {
                try {
                    if (lhdVar.e == null) {
                        lhdVar.e = lhd.X(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        lhdVar.e.post(runnable);
    }
}
