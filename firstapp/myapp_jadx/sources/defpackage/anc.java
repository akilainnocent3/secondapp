package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class anc {
    public Context a;

    public final bnc a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        bnc bncVar = new bnc();
        bncVar.a = ize.a(xtg.a.a);
        znn znnVar = new znn(context);
        bncVar.b = znnVar;
        bncVar.c = ize.a(new xov(znnVar, new byb(znnVar)));
        znn znnVar2 = bncVar.b;
        bncVar.d = new ln70(znnVar2);
        m730<String> m730VarA = ize.a(new frg(znnVar2));
        bncVar.e = m730VarA;
        m730<fq60> m730VarA2 = ize.a(new gq60(bncVar.d, m730VarA));
        bncVar.f = m730VarA2;
        ym70 ym70Var = new ym70();
        znn znnVar3 = bncVar.b;
        zm70 zm70Var = new zm70(znnVar3, m730VarA2, ym70Var);
        m730<Executor> m730Var = bncVar.a;
        m730 m730Var2 = bncVar.c;
        bncVar.i = ize.a(new evg0(new rfd(m730Var, m730Var2, zm70Var, m730VarA2, m730VarA2), new cmh0(znnVar3, m730Var2, m730VarA2, zm70Var, m730Var, m730VarA2, m730VarA2), new nvj0(m730Var, m730VarA2, zm70Var, m730VarA2)));
        return bncVar;
    }
}
