package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class kn50 implements Runnable {
    public final aug a;
    public final bc6 b;

    public kn50(aug augVar, bc6 bc6Var) {
        this.a = augVar;
        this.b = bc6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.D(this.a, Unit.a);
    }
}
