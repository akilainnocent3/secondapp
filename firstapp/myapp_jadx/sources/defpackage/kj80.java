package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class kj80 implements k730 {
    public final m730<CoroutineContext> a;
    public final m730<vwf0> b;
    public final k730 c;

    public kj80(wnn wnnVar, k730 k730Var, k730 k730Var2) {
        this.a = wnnVar;
        this.b = k730Var;
        this.c = k730Var2;
    }

    @Override // defpackage.m730
    public final Object get() {
        return new hj80(this.a.get(), this.b.get(), (sqc) this.c.get());
    }
}
