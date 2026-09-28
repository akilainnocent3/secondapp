package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j1e0 implements Runnable {
    public final yy20 a;
    public final iwd0 b;
    public final boolean c;
    public final int d;

    public j1e0(yy20 yy20Var, iwd0 iwd0Var, boolean z, int i) {
        yy20Var.getClass();
        iwd0Var.getClass();
        this.a = yy20Var;
        this.b = iwd0Var;
        this.c = z;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zD;
        ayj0 ayj0VarB;
        boolean z = this.c;
        yy20 yy20Var = this.a;
        iwd0 iwd0Var = this.b;
        if (z) {
            int i = this.d;
            yy20Var.getClass();
            String str = iwd0Var.a.a;
            synchronized (yy20Var.k) {
                ayj0VarB = yy20Var.b(str);
            }
            zD = yy20.d(str, ayj0VarB, i);
        } else {
            int i2 = this.d;
            yy20Var.getClass();
            String str2 = iwd0Var.a.a;
            synchronized (yy20Var.k) {
                try {
                    if (yy20Var.f.get(str2) != null) {
                        jgt.e().a(yy20.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) yy20Var.h.get(str2);
                        if (set != null && set.contains(iwd0Var)) {
                            zD = yy20.d(str2, yy20Var.b(str2), i2);
                        }
                    }
                    zD = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        jgt.e().a(jgt.g("StopWorkRunnable"), "StopWorkRunnable for " + this.b.a.a + "; Processor.stopWork = " + zD);
    }
}
