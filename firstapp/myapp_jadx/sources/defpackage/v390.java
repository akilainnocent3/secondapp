package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class v390 {
    public final lv50 a;
    public final AtomicBoolean b;
    public final mpe0 c;

    public v390(lv50 lv50Var) {
        lv50Var.getClass();
        this.a = lv50Var;
        this.b = new AtomicBoolean(false);
        this.c = hwr.b(new orh(this, 2));
    }

    public final bge0 a() {
        lv50 lv50Var = this.a;
        lv50Var.a();
        if (this.b.compareAndSet(false, true)) {
            return (bge0) this.c.getValue();
        }
        String strB = b();
        lv50Var.getClass();
        lv50Var.a();
        lv50Var.b();
        return lv50Var.k().f1().J0(strB);
    }

    public abstract String b();

    public final void c(bge0 bge0Var) {
        bge0Var.getClass();
        if (bge0Var == ((bge0) this.c.getValue())) {
            this.b.set(false);
        }
    }
}
