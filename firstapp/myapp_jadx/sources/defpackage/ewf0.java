package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ewf0 {
    public final lfd a;
    public final qvj0 b;
    public final Object c = new Object();
    public final LinkedHashMap d = new LinkedHashMap();

    public ewf0(lfd lfdVar, qvj0 qvj0Var) {
        this.a = lfdVar;
        this.b = qvj0Var;
    }

    public final void a(iwd0 iwd0Var) {
        Runnable runnable;
        iwd0Var.getClass();
        synchronized (this.c) {
            runnable = (Runnable) this.d.remove(iwd0Var);
        }
        if (runnable != null) {
            this.a.a(runnable);
        }
    }

    public final void b(final iwd0 iwd0Var) {
        iwd0Var.getClass();
        Runnable runnable = new Runnable() { // from class: dwf0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.a(iwd0Var, 3);
            }
        };
        synchronized (this.c) {
        }
        this.a.b(5400000L, runnable);
    }
}
