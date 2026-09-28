package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class nqe implements Executor {
    public static volatile nqe a;

    public static nqe a() {
        if (a != null) {
            return a;
        }
        synchronized (nqe.class) {
            try {
                if (a == null) {
                    a = new nqe();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
