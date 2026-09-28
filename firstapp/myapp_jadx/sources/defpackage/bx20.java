package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class bx20 implements k730 {
    public final wnn a;
    public final m730<xsh0> b;

    public bx20(wnn wnnVar, k730 k730Var) {
        this.a = wnnVar;
        this.b = k730Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m730
    public final Object get() {
        return new ax20((Context) this.a.a, this.b.get());
    }
}
