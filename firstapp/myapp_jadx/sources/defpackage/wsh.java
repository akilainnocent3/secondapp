package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class wsh implements k730 {
    public final wnn a;
    public final m730<hh80> b;
    public final m730<CoroutineContext> c;
    public final k730 d;

    public wsh(wnn wnnVar, k730 k730Var, wnn wnnVar2, k730 k730Var2) {
        this.a = wnnVar;
        this.b = k730Var;
        this.c = wnnVar2;
        this.d = k730Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m730
    public final Object get() {
        return new hsh((yoh) this.a.a, this.b.get(), this.c.get(), (eh80) this.d.get());
    }
}
