package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class rfd implements m730 {
    public final m730<Executor> a;
    public final m730<gs1> b;
    public final zm70 c;
    public final m730<erg> d;
    public final m730<zoe0> e;

    public rfd(m730 m730Var, m730 m730Var2, zm70 zm70Var, m730 m730Var3, m730 m730Var4) {
        this.a = m730Var;
        this.b = m730Var2;
        this.c = zm70Var;
        this.d = m730Var3;
        this.e = m730Var4;
    }

    @Override // defpackage.m730
    public final Object get() {
        return new qfd(this.a.get(), this.b.get(), (mwj0) this.c.get(), this.d.get(), this.e.get());
    }
}
