package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
public final class olk0 implements Runnable {
    public final Runnable a;

    public olk0(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.a.run();
    }
}
