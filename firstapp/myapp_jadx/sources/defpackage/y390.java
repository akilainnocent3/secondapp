package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class y390 implements k730 {
    public final m730<hh80> a;
    public final m730<pg80> b;
    public final m730<lg80> c;
    public final m730<vwf0> d;
    public final m730<sqc<bg80>> e;
    public final k730 f;
    public final m730<CoroutineContext> g;

    public y390(k730 k730Var, k730 k730Var2, k730 k730Var3, k730 k730Var4, k730 k730Var5, k730 k730Var6, wnn wnnVar) {
        this.a = k730Var;
        this.b = k730Var2;
        this.c = k730Var3;
        this.d = k730Var4;
        this.e = k730Var5;
        this.f = k730Var6;
        this.g = wnnVar;
    }

    @Override // defpackage.m730
    public final Object get() {
        return new x390(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), (yw20) this.f.get(), this.g.get());
    }
}
