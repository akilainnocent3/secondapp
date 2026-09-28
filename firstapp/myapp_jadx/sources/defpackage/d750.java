package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class d750 implements k730 {
    public final m730<xu0> a;
    public final wnn b;

    public d750(wnn wnnVar, k730 k730Var) {
        this.a = k730Var;
        this.b = wnnVar;
    }

    @Override // defpackage.m730
    public final Object get() {
        return new c750(this.a.get(), (CoroutineContext) this.b.a);
    }
}
