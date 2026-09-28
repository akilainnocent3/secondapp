package defpackage;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: classes.dex */
public final class oj90 extends Thread {
    public final /* synthetic */ ConditionVariable a;
    public final /* synthetic */ pj90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj90(pj90 pj90Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.b = pj90Var;
        this.a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            this.a.open();
            this.b.o();
            this.b.b.getClass();
        }
    }
}
