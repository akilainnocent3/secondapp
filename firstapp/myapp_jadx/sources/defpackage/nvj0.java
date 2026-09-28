package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class nvj0 implements m730 {
    public final m730<Executor> a;
    public final m730<erg> b;
    public final zm70 c;
    public final m730<zoe0> d;

    public nvj0(m730 m730Var, m730 m730Var2, zm70 zm70Var, m730 m730Var3) {
        this.a = m730Var;
        this.b = m730Var2;
        this.c = zm70Var;
        this.d = m730Var3;
    }

    @Override // defpackage.m730
    public final Object get() {
        return new mvj0(this.a.get(), this.b.get(), (mwj0) this.c.get(), this.d.get());
    }
}
