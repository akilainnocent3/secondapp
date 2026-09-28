package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zm70 implements m730 {
    public final m730<Context> a;
    public final m730<erg> b;
    public final ym70 c;

    public zm70(m730 m730Var, m730 m730Var2, ym70 ym70Var) {
        this.a = m730Var;
        this.b = m730Var2;
        this.c = ym70Var;
    }

    @Override // defpackage.m730
    public final Object get() {
        return new f9p(this.a.get(), this.b.get(), (sm70) this.c.get());
    }
}
