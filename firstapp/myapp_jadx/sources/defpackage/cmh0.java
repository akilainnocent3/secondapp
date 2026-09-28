package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cmh0 implements m730 {
    public final m730<Context> a;
    public final m730<gs1> b;
    public final m730<erg> c;
    public final zm70 d;
    public final m730<Executor> e;
    public final m730<zoe0> f;
    public final m730<bs7> g;

    public cmh0(m730 m730Var, m730 m730Var2, m730 m730Var3, zm70 zm70Var, m730 m730Var4, m730 m730Var5, m730 m730Var6) {
        this.a = m730Var;
        this.b = m730Var2;
        this.c = m730Var3;
        this.d = zm70Var;
        this.e = m730Var4;
        this.f = m730Var5;
        this.g = m730Var6;
    }

    @Override // defpackage.m730
    public final Object get() {
        return new bmh0(this.a.get(), this.b.get(), this.c.get(), (mwj0) this.d.get(), this.e.get(), this.f.get(), new bxi0(), new rl9(), this.g.get());
    }
}
