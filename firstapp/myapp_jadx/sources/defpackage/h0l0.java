package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h0l0 implements Runnable {
    public final long a;
    public final long b;
    public final boolean c;
    public final /* synthetic */ p1l0 d;

    public h0l0(p1l0 p1l0Var, boolean z) {
        Objects.requireNonNull(p1l0Var);
        this.d = p1l0Var;
        this.a = System.currentTimeMillis();
        this.b = SystemClock.elapsedRealtime();
        this.c = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        p1l0 p1l0Var = this.d;
        if (p1l0Var.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            p1l0Var.d(e, false, this.c);
            b();
        }
    }

    public void b() {
    }
}
