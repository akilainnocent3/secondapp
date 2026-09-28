package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class og80 implements k730 {
    public final wnn a;
    public final m730<sph> b;
    public final m730<hh80> c;
    public final k730 d;
    public final m730<CoroutineContext> e;

    public og80(wnn wnnVar, wnn wnnVar2, k730 k730Var, k730 k730Var2, wnn wnnVar3) {
        this.a = wnnVar;
        this.b = wnnVar2;
        this.c = k730Var;
        this.d = k730Var2;
        this.e = wnnVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m730
    public final Object get() {
        return new mg80((yoh) this.a.a, this.b.get(), this.c.get(), (dpg) this.d.get(), this.e.get());
    }
}
