package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yqk0 {
    public static volatile pvk0 d;
    public final zal0 a;
    public final uqk0 b;
    public volatile long c;

    public yqk0(zal0 zal0Var) {
        hm20.h(zal0Var);
        this.a = zal0Var;
        this.b = new uqk0(this, zal0Var);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            zal0 zal0Var = this.a;
            zal0Var.e().getClass();
            this.c = System.currentTimeMillis();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            zal0Var.a().f.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        pvk0 pvk0Var;
        if (d != null) {
            return d;
        }
        synchronized (yqk0.class) {
            try {
                if (d == null) {
                    d = new pvk0(this.a.d().getMainLooper());
                }
                pvk0Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pvk0Var;
    }
}
